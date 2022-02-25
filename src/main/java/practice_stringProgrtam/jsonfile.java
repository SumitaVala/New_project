package practice_stringProgrtam;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class jsonfile {
	
	public static void main(String[] args) {
		
		JSONObject employeeDetails = new JSONObject();
	    employeeDetails.put("firstName", "Lokesh");
	    employeeDetails.put("lastName", "Gupta");
	    employeeDetails.put("website", "howtodoinjava.com");
	     
	    JSONObject employeeObject = new JSONObject(); 
	    employeeObject.put("employee", employeeDetails);
	    
	    JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        
           try (FileWriter file = new FileWriter("employees.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(employeeList.toJSONString()); 
          //  file.flush();
            System.out.println(employeeList);
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	  //  JSONParser jsonParser = new JSONParser(); 
		
	}
	
}
	