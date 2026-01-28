package inheritance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class Json {

	public static void main(String[] args) throws IOException {
		byte[] bytes=Files.readAllBytes(Paths.get("C:\\Users\\Rajesh\\Desktop\\data.json"));
        String str=new String (bytes);
        System.out.println(str);
        
        JSONArray jsonarr=new JSONArray(str);
        JSONObject rootjsonobj= jsonarr.getJSONObject(0);
        String type=rootjsonobj.getString("type");
        System.out.println(type);
	}
	

}
