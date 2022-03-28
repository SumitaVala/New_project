package jsonr_read_write;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class json_write {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		writeJsonSimpleDemo("example.json");
		JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("example.json");
	    System.out.println(jsonObject);
	    System.out.println(jsonObject.get("age"));
		
		
	}
	public static void writeJsonSimpleDemo(String filename) throws Exception {
	    JSONObject sampleObject = new JSONObject();
	    sampleObject.put("name", "Stackabuser");
	    sampleObject.put("age", 35);

	    JSONArray messages = new JSONArray();
	    messages.add("Hey!");
	    messages.add("What's up?!");

	    sampleObject.put("messages", messages);
	    Files.write(Paths.get(filename), sampleObject.toJSONString().getBytes());
	    System.out.println(filename);
	  
	}
	public static Object readJsonSimpleDemo(String filename) throws Exception {
	    FileReader reader = new FileReader(filename);
	    JSONParser jsonParser = new JSONParser();
	    return jsonParser.parse(reader);
	}
}


