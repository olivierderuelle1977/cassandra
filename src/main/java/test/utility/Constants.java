package test.utility;

import java.util.regex.Pattern;

public class Constants {
	
	public static final String HTTP_REQUEST_TOKEN_HEADER="X-Token";
	
	public static final String JSON_ENVIRONMENT_NAME="name";
	public static final String JSON_ENVIRONMENT_GROUP_ID="groupId";
	public static final String JSON_ENVIRONMENT_PROPERTIES="environmentProperties";
	public static final String JSON_ENVIRONMENT_USER_PERMISSIONS="environmentUserPermissions";
	public static final String JSON_ENVIRONMENT_ENABLED="enabled";
	public static final String JSON_ENVIRONMENT_CREATED_BY="createdBy";
	public static final String JSON_ENVIRONMENT_CREATION_DATE="creationDate";
	public static final String JSON_ENVIRONMENT_LAST_UPDATE_DATE="lastUpdateDate";
	public static final String JSON_ENVIRONMENT_LAST_UPDATED_BY="lastUpdatedBy";
	public static final String JSON_ENVIRONMENT_DESCRIPTION="description";
	public static final String JSON_ENVIRONMENT_USER_PERMISSION_USER_ID="userId";
	public static final String JSON_ENVIRONMENT_USER_PERMISSION_DATA_READ="dataRead";
	public static final String JSON_ENVIRONMENT_USER_PERMISSION_DATA_WRITE="dataWrite";
	public static final String JSON_ENVIRONMENT_PROPERTY_NAME="name";
	public static final String JSON_ENVIRONMENT_PROPERTY_VALUE="value";
	public static final String JSON_ENVIRONMENT_PROPERTY_IS_ENCRYPTED="encrypted";
	public static final String JSON_ENVIRONMENT_OWNER_ID = "ownerId";
	public static final String JSON_ENVIRONMENT_PROPERTY_BIP_BASE_URL = "bipURL";
	public static final String JSON_ENVIRONMENT_PROPERTY_BIP_USERNAME = "bipUserName";
	public static final String JSON_ENVIRONMENT_PROPERTY_BIP_PASSWORD = "bipPassword";

	public static final String JSON_BIP_EXTRACT_SQL_QUERY = "sqlQuery";
	public static final String JSON_BIP_BASE_URL = "bipBaseUrl";
	public static final String JSON_BIP_USERNAME = "bipUsername";
	public static final String JSON_BIP_ENCODED_PASSWORD = "bipEncodedPassword";
	
	public static final String BIP_REPORT_NAME_XML_OUTPUT="DYNXMLV1";
	public static final String BIP_REPORT_VS_XML_OUTPUT="DYNVSXMLV1";
	public static final String BIP_FUSION_RAPID4CLOUD_FOLDER="/RAPID4CloudSQLReportsV1";
	
	public static final String JSON_JOB_ATTRIBUTE_OBJECT_DEFINITION_NAME = "objectDefinitionName";
	public static final String JSON_JOB_ATTRIBUTE_ENVIRONMENT_ID= "oracleEnvId";
	public static final String JSON_JOB_ATTRIBUTE_FILE_NAME= "fileName";
	public static final String JSON_JOB_ATTRIBUTE_IS_GENERATE_SEQUENCE_NUMBER= "isGenerateSequenceNumber";
	public static final String JSON_JOB_ATTRIBUTE_MESSAGE_RECEIVED_COUNT ="messageReceivedCount";
	public static final String JSON_JOB_ATTRIBUTE_OBJECT_DEFINITION_KB_ID = "kbId";
	public static final String JSON_JOB_ATTRIBUTE_OBJECT_DEFINITION_VERSION = "objectDefinitionVersion";
	
	public static final String JSON_USER_PERMISSION_USER_ID="userId";
	public static final String JSON_USER_PERMISSION_DATA_READ="dataRead";
	public static final String JSON_USER_PERMISSION_DATA_WRITE="dataWrite";
	
	public static final String JSON_JOB_FIELD_ID="id";
	public static final String JSON_JOB_FIELD_TYPE_ID="typeId";
	public static final String JSON_JOB_FIELD_TYPE_TEXT="typeText";
	public static final String JSON_JOB_FIELD_STATUS="status";
	public static final String JSON_JOB_FIELD_STATUS_TEXT="statusText";
	public static final String JSON_JOB_FIELD_CREATION_DATE="creationDate";
	public static final String JSON_JOB_FIELD_CREATED_BY_USER_ID="createdByUserId";
	public static final String JSON_JOB_FIELD_CREATED_BY_USER_TEXT="createdByUserText";
	public static final String JSON_JOB_FIELD_START_DATE="startDate";
	public static final String JSON_JOB_FIELD_END_DATE="endDate";
	public static final String JSON_JOB_FIELD_MESSAGE="message";
	public static final String JSON_JOB_FIELD_MESSAGE_RECEIVED_COUNT="messageReceivedCount";
	public static final String JSON_JOB_FIELD_DEPENDENT_JOB_ID="dependentJobId";
	public static final String JSON_JOB_FIELD_CUSTOM_ATTRIBUTES="customAttributes";
	public static final String JSON_CUSTOM_ATTRIBUTE_LABEL = "label";
	public static final String JSON_CUSTOM_ATTRIBUTE_VALUE = "value";
	public static final String JSON_CUSTOM_ATTRIBUTE_REFERENCE1 = "reference1";
	public static final String JSON_JOB_FIELD_GROUP_ID = "groupId";
	
	public static final String JSON_JOB_ATTRIBUTE_DATA_RECORD_ID_PREFIX= "dataRecordId";
	public static final String JSON_JOB_ATTRIBUTE_UI_POSITION = "uiPosition";
	public static final String JSON_JOB_ATTRIBUTE_UI_POSITIONS_PREFIX = "uiPositions";
	public static final String JSON_JOB_ATTRIBUTE_UI_VALUES_PREFIX  = "uiValues";
	public static final String JSON_JOB_ATTRIBUTE_DATA_FILTER_ATTRIBUTE = "dataFilterAttribute";
	
	public static final String END_OF_LINE="\\r?\\n";
	public static final String SQL_REPLACE_HTML_KEYWORD_FIELD_KEYWORD="REPLACE_HTML_KEYWORD";
	public static final String SQL_NOZERODATEFORMAT_FIELDS_KEYWORD="NOZERODATEFORMAT_FIELDS";	
	public static final String VALUE_SET_LOGIC_TO_APPLY = "VALUE_SET_LOGIC_TO_APPLY_FIELDS";
	
	public static String LAST_UPDATED_BY_COLUMN_NAME="RSC_LAST_UPDATED_BY";
	public static String LAST_UPDATE_DATE_COLUMN_NAME="RSC_LAST_UPDATE_DATE";
	public static String CREATED_BY_COLUMN_NAME="RSC_CREATED_BY";
	public static String CREATION_DATE_COLUMN_NAME="RSC_CREATION_DATE";
	public static String ORAGANIZATION_COLUMN_NAME="RSC_ORGANIZATION_ID";
	public static String BUSINESS_UNIT_COLUMN_NAME="RSC_BUSINESS_UNIT_ID";
	public static String LEGAL_ENTITY_COLUMN_NAME="RSC_LEGAL_ENTITY_ID";
	public static String LEDGER_COLUMN_NAME="RSC_LEDGER_ID";
	public static String CHART_OF_ACCOUNT_COLUMN_NAME="RSC_CHART_OF_ACCOUNTS_ID";
	public static String BUSINESS_GROUP_COLUMN_NAME="RSC_BUSINESS_GROUP_ID";
	public static String ENTERPRISE_COLUMN_NAME="RSC_ENTERPRISE_ID";
	public static String EXTRA_COLUMN_NAME_PREFIX="RSC_EXTRA_COLUMN";

	public static String LAST_UPDATED_BY_BIPTAG_NAME="X1";
	public static String LAST_UPDATE_DATE_BIPTAG_NAME="X2";
	public static String CREATED_BY_BIPTAG_NAME="X3";
	public static String CREATION_DATE_BIPTAG_NAME="X4";
	public static String ORAGANIZATION_BIPTAG_NAME="X5";
	public static String BUSINESS_UNIT_BIPTAG_NAME="X6";
	public static String LEGAL_ENTITY_BIPTAG_NAME="X7";
	public static String LEDGER_BIPTAG_NAME="X8";
	public static String CHART_OF_ACCOUNT_BIPTAG_NAME="X9";
	public static String BUSINESS_GROUP_BIPTAG_NAME="X10";
	public static String ENTERPRISE_BIPTAG_NAME="X11";

	public static String REGEX_CAST_NUMBER = "cast[ ]*\\([ ]*null[ ]+as[ ]+number\\)[ ]+as[ ]+";
	public static String REGEX_NORMAL = "null[ ]+as[ ]+";
	public static String REGEX_MIN = "null[ ]+";

	public static Pattern ORAGANIZATION_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+ORAGANIZATION_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern ORAGANIZATION_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+ORAGANIZATION_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern ORAGANIZATION_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+ORAGANIZATION_COLUMN_NAME, Pattern.CASE_INSENSITIVE);

	public static Pattern BUSINESS_UNIT_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+BUSINESS_UNIT_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BUSINESS_UNIT_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+BUSINESS_UNIT_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BUSINESS_UNIT_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+BUSINESS_UNIT_COLUMN_NAME, Pattern.CASE_INSENSITIVE);

	public static Pattern LEGAL_ENTITY_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+LEGAL_ENTITY_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern LEGAL_ENTITY_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+LEGAL_ENTITY_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern LEGAL_ENTITY_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+LEGAL_ENTITY_COLUMN_NAME, Pattern.CASE_INSENSITIVE);

	public static Pattern LEDGER_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+LEDGER_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern LEDGER_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+LEDGER_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern LEDGER_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+LEDGER_COLUMN_NAME, Pattern.CASE_INSENSITIVE);

	public static Pattern CHART_OF_ACCOUNT_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+CHART_OF_ACCOUNT_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern CHART_OF_ACCOUNT_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+CHART_OF_ACCOUNT_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern CHART_OF_ACCOUNT_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+CHART_OF_ACCOUNT_COLUMN_NAME, Pattern.CASE_INSENSITIVE);

	public static Pattern BUSINESS_GROUP_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+BUSINESS_GROUP_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BUSINESS_GROUP_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+BUSINESS_GROUP_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BUSINESS_GROUP_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+BUSINESS_GROUP_COLUMN_NAME, Pattern.CASE_INSENSITIVE);

	public static Pattern ENTERPRISE_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+ENTERPRISE_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern ENTERPRISE_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+ENTERPRISE_COLUMN_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern ENTERPRISE_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+ENTERPRISE_COLUMN_NAME, Pattern.CASE_INSENSITIVE);

	public static Pattern BIP_ORAGANIZATION_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+ORAGANIZATION_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_ORAGANIZATION_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+ORAGANIZATION_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_ORAGANIZATION_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+ORAGANIZATION_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);

	public static Pattern BIP_BUSINESS_UNIT_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+BUSINESS_UNIT_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_BUSINESS_UNIT_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+BUSINESS_UNIT_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_BUSINESS_UNIT_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+BUSINESS_UNIT_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);

	public static Pattern BIP_LEGAL_ENTITY_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+LEGAL_ENTITY_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_LEGAL_ENTITY_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+LEGAL_ENTITY_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_LEGAL_ENTITY_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+LEGAL_ENTITY_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);

	public static Pattern BIP_LEDGER_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+LEDGER_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_LEDGER_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+LEDGER_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_LEDGER_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+LEDGER_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);

	public static Pattern BIP_CHART_OF_ACCOUNT_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+CHART_OF_ACCOUNT_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_CHART_OF_ACCOUNT_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+CHART_OF_ACCOUNT_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_CHART_OF_ACCOUNT_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+CHART_OF_ACCOUNT_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);

	public static Pattern BIP_BUSINESS_GROUP_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+BUSINESS_GROUP_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_BUSINESS_GROUP_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+BUSINESS_GROUP_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_BUSINESS_GROUP_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+BUSINESS_GROUP_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);

	public static Pattern BIP_ENTERPRISE_REGEX_CAST_NUMBER_PATTERN = Pattern.compile(REGEX_CAST_NUMBER+ENTERPRISE_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_ENTERPRISE_REGEX_NORMAL_PATTERN = Pattern.compile(REGEX_NORMAL+ENTERPRISE_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	public static Pattern BIP_ENTERPRISE_REGEX_MIN_PATTERN = Pattern.compile(REGEX_MIN+ENTERPRISE_BIPTAG_NAME, Pattern.CASE_INSENSITIVE);
	
	public static final String CHARACTER_SET_ENCODING = "UTF-8";
	public static final String DATA_FILE_FOOTER = "</data>";

	public static final String JSON_BUSINESS_UNIT_ID = "id";
	public static final String JSON_BUSINESS_UNIT_NAME = "name";

	public static final String JSON_ORACLE_USER_ID = "id";
	public static final String JSON_ORACLE_USER_NAME = "name";
	
}