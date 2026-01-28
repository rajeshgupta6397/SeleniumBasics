package polymorefigamsacnerio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class Method {

	public static void main(String[] args) throws IOException {
		Path path=Paths.get("C:\\Users\\Rajesh\\Desktop\\data.json");
		byte [] bytes=	Files.readAllBytes(path);
		String str= new String(bytes);

		JSONArray jsonA= new JSONArray(str);
		JSONObject jsonroot= jsonA.getJSONObject(0);

		Number id_number= jsonroot.getNumber("id");
		System.out.println(id_number);

		String Str_type= jsonroot.getString("type");
		System.out.println(Str_type);

		JSONObject obj_viewed= jsonroot.getJSONObject("viewed");
		System.out.println(obj_viewed);

		Number str_viewed_time= obj_viewed.getNumber("viewed_time");
		System.out.println(str_viewed_time);

		Number num_lead_score= jsonroot.getNumber("lead_score");
		System.out.println(num_lead_score);
       






	}


}



