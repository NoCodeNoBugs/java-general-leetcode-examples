package javaprep;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;

public class JsonToCSVConvertor {


    public JsonToCSVConvertor() throws IOException {

        JsonNode jsonTree = new ObjectMapper().readTree(new File("src/main/resources/InspectorOutput.json"));

        CsvSchema.Builder csvSchemaBuilder = CsvSchema.builder();
        JsonNode firstObject = jsonTree.elements().next();
        firstObject.fieldNames().forEachRemaining(fieldName -> {csvSchemaBuilder.addColumn(fieldName);} );
        CsvSchema csvSchema = csvSchemaBuilder.build().withHeader();

        CsvMapper csvMapper = new CsvMapper();
        csvMapper.writerFor(JsonNode.class)
                .with(csvSchema)
                .writeValue(new File("src/main/resources/InspectorOutput.csv"), jsonTree);

    }


    public static void main (String args[]) throws IOException {

        JsonToCSVConvertor jsonToCSVConvertor = new JsonToCSVConvertor();
        System.out.println(jsonToCSVConvertor);


    }
}
