package interviewQuestion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.json.Json;


public class Api {

	public static void main(String[] args) throws IOException  {
 byte [] byteArr= Files.readAllBytes(Paths.get("C:\\Users\\Rajesh\\Desktop\\data.json"));
 String Arraystr=new String(byteArr);
 System.out.println(Arraystr);
 
 JSONArray returnarray=   new JSONArray(Arraystr);
 JSONObject jsonObject_0= returnarray.getJSONObject(0);
  // JSONObject viewed_jsonobj= jsonObject_0.getJSONObject("viewed");
 //  System.out.println(viewed_jsonobj);
 System.out.println(jsonObject_0);
 Number ret= jsonObject_0.getNumber("id");
 System.out.println(ret);
  String jsontype= jsonObject_0.getString("type");
  System.out.println(jsontype);
  Number json_time= jsonObject_0.getNumber("created_time");
  System.out.println(json_time);
   Number jsonobj= jsonObject_0.getNumber("last_called");
   System.out.println(jsonobj);
 JSONObject json_views=  jsonObject_0.getJSONObject("viewed");
 Number json_time1= json_views.getNumber("viewed_time");
 System.out.println(json_time1);
    JSONArray jsonwith= jsonObject_0.getJSONArray("tagsWithTime");
     JSONObject jsonnumb= jsonwith.getJSONObject(0);
    String jsonstr=  jsonnumb.getString("tag");
    System.out.println(jsonstr);
    Number json_createdTime= jsonnumb.getNumber("createdTime");
    System.out.println(json_createdTime);
   JSONArray JSON_properties= jsonObject_0.getJSONArray("properties");
   JSONObject json_obj_0= JSON_properties.getJSONObject(0);
   String json_value=  json_obj_0.getString("value");
   System.out.println(json_value);
   JSONArray json_Value= jsonObject_0.getJSONArray("properties");
   JSONObject json1= json_Value .getJSONObject(1);
   String strvalue= json1.getString("value");
   System.out.println(strvalue);
   
	
	
	}
	
	

}
