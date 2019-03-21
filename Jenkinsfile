pipeline {
	options {
        buildDiscarder(logRotator(numToKeepStr: '20'))
    }
	environment {
		AWS_ECR = '575331706869.dkr.ecr.us-east-2.amazonaws.com'
		AWS_REGION = 'us-east-2'
		DOCKER_IMAGE = 'bip-service'
		AWS_TASK_DEFINITION = 'bip-service'
		AWS_CLUSTER_STAGING = 'R4C-Staging1-Cluster'
		AWS_SERVICE = 'bip-service'
		AWS_CLUSTER_PROD = 'R4C-Prod1-Cluster'
    }
	agent any
    tools { 
        maven 'M3' 
		jdk 'java8'
    }
	stages {
		stage('Compile') {
	        steps{
	            checkout scm
				script {
					GIT_VERSION = sh (script: 'git describe --tags',returnStdout: true).trim()
                }
				echo "GIT version: ${GIT_VERSION}"
				sh "java -version"
			    sh "mvn -f pom.xml clean compile"
	        }
		}
		stage('Unit Test') {
	        steps{
			    sh "mvn -f pom.xml test"
	        }
		}
		stage('Docker Build') {
	        steps{
				echo "GIT version: ${GIT_VERSION}"
			    sh "mvn -f pom.xml package"
				sh "docker build -t ${DOCKER_IMAGE}:${GIT_VERSION} ."
				sh "docker tag ${DOCKER_IMAGE}:${GIT_VERSION} ${DOCKER_IMAGE}:latest"
	        }
		}
		stage('Push To AWS ECR') {
	        steps{
				echo "GIT version: ${GIT_VERSION}"
				script {
					loginAwsEcrInfo = sh (script: 'aws ecr get-login --no-include-email --region ${AWS_REGION}',returnStdout: true).trim()
                }
				echo "Retrieved AWS Login: ${loginAwsEcrInfo}"
                sh "${loginAwsEcrInfo}"
				echo "GIT version: ${GIT_VERSION}"
				sh "docker tag ${DOCKER_IMAGE}:${GIT_VERSION} ${AWS_ECR}/${DOCKER_IMAGE}:${GIT_VERSION}"
				sh "docker tag ${DOCKER_IMAGE}:latest ${AWS_ECR}/${DOCKER_IMAGE}:latest"
				sh "docker push ${AWS_ECR}/${DOCKER_IMAGE}:${GIT_VERSION}"
				sh "docker push ${AWS_ECR}/${DOCKER_IMAGE}:latest"
			}
		}
		stage('AWS Staging Deployment') {
	        steps{
				sh "rm -f awsTaskDefinitionTemp.json"
				sh "sed 's/VAR-TAG-NAME/${GIT_VERSION}/g' aws-ecs-taskdefinition-staging.json >> awsTaskDefinitionTemp.json" 
				sh "sed -i 's/VAR-AWS-ECR/${AWS_ECR}/g' awsTaskDefinitionTemp.json" 
				sh "sed -i 's/VAR-DOCKER-IMAGE/${DOCKER_IMAGE}/g' awsTaskDefinitionTemp.json" 
				sh "sed -i 's/VAR-AWS-CONTAINER-NAME/${DOCKER_IMAGE}/g' awsTaskDefinitionTemp.json" 
				sh "sed -i 's/VAR-AWS-TASK-DEFINITION-FAMILY/${AWS_TASK_DEFINITION}/g' awsTaskDefinitionTemp.json" 
				script {
					ecsTaskLatestRevision = sh (script: "aws ecs register-task-definition --cli-input-json file://${workspace}/awsTaskDefinitionTemp.json | egrep \"revision\" | awk '{print \$2}'",returnStdout: true).trim()
				}
				echo "Retrieved AWS Latest Task Revision: ${ecsTaskLatestRevision}"
				sh "aws ecs update-service --cluster ${AWS_CLUSTER_STAGING} --service ${AWS_SERVICE} --task-definition ${AWS_TASK_DEFINITION}:${ecsTaskLatestRevision}"
	        }
		}
		stage('Integration Test') {
	        steps{
	        	sleep time: 5, unit: 'MINUTES'
				build job: 'integration-test-service'
	        }
		}
		stage('Approval') {
	        steps{
				timeout(time:1, unit:'DAYS') {
					input 'Approve Deployment to Production?'
				}
	        }
		}
		stage('AWS Production Deployment') {
		 	steps{
				sh "rm -f awsTaskDefinitionTemp.json"
				sh "sed 's/VAR-TAG-NAME/${GIT_VERSION}/g' aws-ecs-taskdefinition-prod.json >> awsTaskDefinitionTemp.json" 
				sh "sed -i 's/VAR-AWS-ECR/${AWS_ECR}/g' awsTaskDefinitionTemp.json" 
				sh "sed -i 's/VAR-DOCKER-IMAGE/${DOCKER_IMAGE}/g' awsTaskDefinitionTemp.json" 
				sh "sed -i 's/VAR-AWS-CONTAINER-NAME/${DOCKER_IMAGE}/g' awsTaskDefinitionTemp.json" 
				sh "sed -i 's/VAR-AWS-TASK-DEFINITION-FAMILY/${AWS_TASK_DEFINITION}/g' awsTaskDefinitionTemp.json" 
				script {
					ecsTaskLatestRevision = sh (script: "aws ecs register-task-definition --cli-input-json file://${workspace}/awsTaskDefinitionTemp.json | egrep \"revision\" | awk '{print \$2}'",returnStdout: true).trim()
				}
				echo "Retrieved AWS Latest Task Revision: ${ecsTaskLatestRevision}"
				sh "aws ecs update-service --cluster ${AWS_CLUSTER_PROD} --service ${AWS_SERVICE} --task-definition ${AWS_TASK_DEFINITION}:${ecsTaskLatestRevision}"
	        }
		}
	}
	post {  
        always {  
             echo 'This will always run'  
             sh "docker rmi ${AWS_ECR}/${DOCKER_IMAGE}:${GIT_VERSION}"
             sh "docker rmi ${DOCKER_IMAGE}:${GIT_VERSION}"
			 sh "docker rmi ${AWS_ECR}/${DOCKER_IMAGE}:latest"
             sh "docker rmi ${DOCKER_IMAGE}:latest"
        }  
        success {  
            echo 'This will run only if successful'  
        }  
        failure {  
			echo 'This will run only if failure'  
            mail bcc: '', body: "<br>Pipeline: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> Build log: <a href='${env.BUILD_URL}console'>Click to view the Log</a>", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "ERROR PIPELINE: ${env.JOB_NAME}", to: "dev@rapid4cloud.com"; 
			echo 'Email sent'  			
        }  
        unstable {  
            echo 'This will run only if the run was marked as unstable'  
        }  
        changed {  
            echo 'This will run only if the state of the Pipeline has changed'  
            echo 'For example, if the Pipeline was previously failing but is now successful'  
        }  
    }  
}