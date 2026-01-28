package interviewQuestion;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiPut {

	public static void main(String[] args) {
		
		JSONObject jsanroot= new JSONObject();
		jsanroot.put("firstname", "rajesh");
		jsanroot.put("lastname", "gupta");
		jsanroot.put("village", "pipari");
		jsanroot.put("city", "bhadohi");
		
		JSONArray array= new JSONArray();
		array.put("travling");
		array.put("firstname");
		array.put("rajesh");
		array.put("lastname");
		array.put("gupta");
		
        System.out.println(jsanroot);
        System.out.println(array);
	}

}
