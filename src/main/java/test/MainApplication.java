package test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test.utility.PropertiesReader;

@SpringBootApplication
public class MainApplication {
	
	public static void main(String[] args) throws Exception {
		try{
			SpringApplication.run(MainApplication.class, args);
		}
		finally {
			PropertiesReader.logFromProperties();
		}
	}

	@Value("${spring.application.name}")
	private String applicationName;

}