package vtiger_automation;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class api_testing {

	public static void main(String[] args) {
//	Response requestspacification_get=  RestAssured.given().auth().basic("rajesh@evabhadohi.com", "Rajesh")
//	.accept("application/json").get("https://rajeshbhadohi.agilecrm.com/dev/api/contacts/4773668875599872");
//	String as_str= requestspacification_get.getBody().asPrettyString();
//	//System.out.println(as_str);
//	
// if(	requestspacification_get.getStatusCode()==200) {
//	 System.out.println("passed.status code is correct");
// }else {
//	 System.out.println("failed.status code is  incorrect");
// }
//System.out.println(statuscode);

String fname= RandomStringUtils.randomAlphabetic(6);
String lname= RandomStringUtils.randomAlphabetic(6);
String email=  RandomStringUtils.randomAlphabetic(12)+"@gmail.com.ltd";
	
	String res_body="{\r\n"
			+ "    \"star_value\": \"4\",\r\n"
			+ "    \"lead_score\": \"92\",\r\n"
			+ "    \"tags\": [\r\n"
			+ "        \"Lead\",\r\n"
			+ "        \"Likely Buyer\"\r\n"
			+ "    ],\r\n"
			+ "    \"properties\": [\r\n"
			+ "        {\r\n"
			+ "            \"type\": \"SYSTEM\",\r\n"
			+ "            \"name\": \"first_name\",\r\n"
			+ "            \"value\": \""+fname+"\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"type\": \"SYSTEM\",\r\n"
			+ "            \"name\": \"last_name\",\r\n"
			+ "            \"value\": \""+lname+"\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"type\": \"SYSTEM\",\r\n"
			+ "            \"name\": \"email\",\r\n"
			+ "            \"subtype\": \"work\",\r\n"
			+ "            \"value\": \""+email+"\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"type\": \"SYSTEM\",\r\n"
			+ "            \"name\": \"address\",\r\n"
			+ "            \"value\": \"{\\\"address\\\":\\\"225 Gawn Street\\\",\\\"city\\\":\\\"NSW\\\",\\\"state\\\":\\\"Sydney\\\",\\\"zip\\\":\\\"2000\\\",\\\"country\\\":\\\"Australia\\\"}\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"phone\",\r\n"
			+ "            \"value\": \"8888888889\",\r\n"
			+ "            \"subtype\": \"work\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"phone\",\r\n"
			+ "            \"value\": \"8888888889\",\r\n"
			+ "            \"subtype\": \"home\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"website\",\r\n"
			+ "            \"value\": \"www.youtube.com\",\r\n"
			+ "            \"subtype\": \"YOUTUBE\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"website\",\r\n"
			+ "            \"value\": \"www.linkedin.com\",\r\n"
			+ "            \"subtype\": \"LINKEDIN\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"website\",\r\n"
			+ "            \"value\": \"www.mywebsite.com\",\r\n"
			+ "            \"subtype\": \"URL\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"My custom field of type text\",\r\n"
			+ "            \"type\": \"CUSTOM\",\r\n"
			+ "            \"value\": \"My name is ghanshyam\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"My custom field of type date\",\r\n"
			+ "            \"type\": \"CUSTOM\",\r\n"
			+ "            \"value\": 1479580200\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"My custom field of type checkbox\",\r\n"
			+ "            \"type\": \"CUSTOM\",\r\n"
			+ "            \"value\": \"on\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"My custom field of type list\",\r\n"
			+ "            \"type\": \"CUSTOM\",\r\n"
			+ "            \"value\": \"lemon\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"My custom field of type companies\",\r\n"
			+ "            \"type\": \"CUSTOM\",\r\n"
			+ "            \"value\": \"[\\\"5767466600890368\\\",\\\"5114076984246272\\\",\\\"5746725247516672\\\"]\"\r\n"
			+ "        }\r\n"
			+ "    ]\r\n"
			+ "}";
	
 Response res_get=	RestAssured.given().auth().basic("rajesh@evabhadohi.com", "Rajesh")
.contentType("application/json") .accept("application/json").body(res_body).post("https://rajeshbhadohi.agilecrm.com/dev/api/contacts");		 
 String json_res_str= res_get.getBody().asPrettyString();	
 System.out.println(json_res_str);
 
 JSONObject jsonroot=	new JSONObject(json_res_str);
 JSONArray json_prpts_ary= jsonroot.getJSONArray("properties");
 
 /////////////////////////////////////////////////////////////////////////////////
 JSONObject  responce_fname= json_prpts_ary.getJSONObject(0);
 String res_fname= responce_fname.getString("value");
 
 if(res_fname.equalsIgnoreCase(fname)) {
	 System.out.println("passed.Firstname is maching-actual-"+res_fname+",expected-"+fname);
 }else {
	 System.out.println("failed.Firstname is not maching-"+res_fname+",expected-"+fname);
 }
 ///////////////////////////////////////////////////////////////////
 JSONObject  responce_lname= json_prpts_ary.getJSONObject(1);
 String res_lname= responce_lname.getString("value");
 
 if(res_lname.equalsIgnoreCase(lname)){
	System.out.println("passed.lastname is maching-"+res_lname+",expected-"+lname); 
 }else {
	 System.out.println("Failed.lastname is not maching"+res_lname+",expected-"+lname);
 }
 
 //////////////////////////////////////////////////////////////
 JSONObject  responce_email= json_prpts_ary.getJSONObject(2);
 String res_email= responce_email.getString("value");
 	
if(res_email.equalsIgnoreCase(email)){
	System.out.println("passed.Email is maching-"+res_email+",expected-"+email);
}else {
	System.out.println("Failed.Email is not maching-"+res_email+",expected-"+email);
}

	}

}
