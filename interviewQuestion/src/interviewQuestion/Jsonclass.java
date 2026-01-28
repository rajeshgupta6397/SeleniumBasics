package interviewQuestion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class Jsonclass {

	public static void main(String[] args) throws IOException  {
    byte[] bytes =Files.readAllBytes(Paths.get("C:\\Users\\Rajesh\\Desktop\\data.json"));
	String str_byte= new String(bytes);
	//System.out.println(str_byte);

	JSONArray arrayjson=   new JSONArray(str_byte);
    JSONObject jsonObject=    arrayjson.getJSONObject(0);
   
   Number id_numNumber= jsonObject.getNumber("id");
   String type= jsonObject.getString("type");
   System.out.println(type);
   System.out.println(id_numNumber);
	}
}
