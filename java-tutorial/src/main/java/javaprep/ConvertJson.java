/*
package javaprep;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;

public class ConvertJson {

    public static void main(String myHelpers[]){
        String jsonArrayString = "{\"fileName\": [{\"name\": \"Anand\",\"last\": \"Dwivedi\",\"place\": \"Bangalore\"}]}";

        JSONObject output;
        try {
            output = new JSONObject(jsonArrayString);


            JSONArray docs = output.getJSONArray("fileName");

            File file=new File("JSONSEPERATOR.csv");
            String csv = CDL.toString(docs);
            FileUtils.writeStringToFile(file, csv);
            System.out.println("Data has been Sucessfully Writeen to "+file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/
