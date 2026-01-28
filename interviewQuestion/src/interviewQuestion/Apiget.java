package interviewQuestion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class Apiget {

	public static void main(String[] args) throws IOException {
    Path path= Paths.get("C:\\\\Users\\\\Rajesh\\\\Desktop\\data.json");
	byte [] bytes= Files.readAllBytes(path);
	String string= new String(bytes);
	System.out.println(string);
	
	//JSONArray jsonarray= new JSONArray(string);
 //   JSONObject jsonroot=	jsonarray.getJSONObject(0);
    
	JSONObject obj=	new JSONObject(string);
    Number num_id= obj.getNumber("id");
    System.out.println(num_id);
    
  
//    
//     int total_len= jsonroot.length();
//     System.out.println(total_len);
//     
//   String str_type=  jsonroot.getString("type");
//   System.out.println(str_type);
//   
//    JSONObject json_viewed= jsonroot.getJSONObject("viewed");
//    Number num_viewed_time=  json_viewed.getNumber("viewed_time");
//    System.out.println(num_viewed_time);
//    
//    Number num_viewed_time1= jsonroot.getNumber("viewed_time");
//    System.out.println(num_viewed_time1);
//    
//    JSONArray json_tags= jsonroot.getJSONArray("tags");
//    String  json_1= json_tags.getString(1);
//    System.out.println(json_1);
//    
//    String string_3= json_tags.getString(3);
//    System.out.println(string_3);
//    
//    JSONArray tagsWithTime_array= jsonroot.getJSONArray("tagsWithTime");
//    JSONObject json_0= tagsWithTime_array.getJSONObject(0);
//     Number createdTime_num= json_0.getNumber("createdTime");
//     System.out.println(createdTime_num);
//     
//     JSONObject tagsWithTime_array_3= tagsWithTime_array.getJSONObject(3);
//     String entity_type_str= tagsWithTime_array_3.getString("entity_type");
//     System.out.println(entity_type_str);
//     
//     JSONArray properties_array= jsonroot.getJSONArray("properties");
//     JSONObject properties_0= properties_array.getJSONObject(2);
//     String value_str= properties_0.getString("value");
//     System.out.println(value_str);
//     
//     JSONObject properties_json= properties_array.getJSONObject(3);
//     String value_stri= properties_json.getString("value");
//     System.out.println(value_stri);
//     
//      JSONArray jsonarray_properties= jsonroot.getJSONArray("properties");
//      JSONObject  jsonobj_4=  jsonarray_properties.getJSONObject(4);
//      Number number_value= jsonobj_4.getNumber("value");
//      System.out.println(number_value);
//      
//    
//     int lenght_int=  value_stri.length();
//     System.out.println(lenght_int);
//     
//     JSONArray properties_Array= jsonroot.getJSONArray("properties");
//     JSONObject jsonobj_3= properties_Array.getJSONObject(3);
//    // String getstring= jsonobj_3.getString();
//     System.out.println(jsonobj_3);
//     
     
//    byte []bytes= Files.readAllBytes(Paths.get("C:\\\\Users\\\\Rajesh\\\\Desktop\\\\data.json"));
//    String str= new String (bytes);
//    System.out.println(str);
//	
//    JSONArray obj= new JSONArray(str);
//	JSONObject jsonroot= obj.getJSONObject(0);
//	Number num_id= jsonroot.getNumber("id");
//	System.out.println(num_id);
//	
	
		
		
		
		
//	byte [] bytes=Files.readAllBytes(Paths.get("C:\\Users\\Rajesh\\Desktop\\data.json"));
//    String str=	new String(bytes);
//    System.out.println(str);
//    
//   JSONArray jsonarr= new JSONArray(str);
//   JSONObject jsonroot= jsonarr.getJSONObject(0);
//   Number num_id= jsonroot.getNumber("id");
//   System.out.println(num_id);
   
//   String str_type=  jsonroot.getString("type");
//   System.out.println(str_type);
//   
//  JSONObject json_viewed=  jsonroot.getJSONObject("viewed");
//  System.out.println(json_viewed);
//  
//  Number json_viewed_time =json_viewed.getNumber("viewed_time");
//  System.out.println(json_viewed_time);
//  
//  Number num_json_lead_viewed= jsonroot.getNumber("lead_score");
//  System.out.println(num_json_lead_viewed);
//  
//  String Number_0= jsonroot.getString("klout_score");
//  System.out.println(Number_0);
//  
//  JSONArray json_tags= jsonroot.getJSONArray("tags");
//  System.out.println(json_tags);
//  
//  String string_0= json_tags.getString(0);
//  System.out.println(string_0);
//  
//  String str_3= json_tags.getString(3);
//  System.out.println(str_3);
//  
//  JSONArray json_tagsWithTime= jsonroot.getJSONArray("tagsWithTime");
//  JSONObject json_tagsWithTimeObj=  json_tagsWithTime.getJSONObject(0);
//  Number json_createdTime= json_tagsWithTimeObj.getNumber("createdTime");
//  System.out.println(json_createdTime);
//  
//  JSONObject jsonobj= json_tagsWithTime.getJSONObject(0);
//  System.out.println(jsonobj);
//  
//   String string_tag= jsonobj.getString("tag");
//   System.out.println(string_tag);
//   
//   JSONArray arrat_tagsWithTime= jsonroot.getJSONArray("tagsWithTime");
//   System.out.println(arrat_tagsWithTime);
//   
//   JSONObject json_3=  arrat_tagsWithTime.getJSONObject(3);
//   System.out.println(json_3);
	}

}
