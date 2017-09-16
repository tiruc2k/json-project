package com.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonExample {
 
 public static void main(String[] args) {
  String json = "{ \"name\":\"Peter\", \"type\":\"first\", \"age\":\"25\"}";
  
  ObjectMapper mapper = new ObjectMapper();
  
  try {
   //convert JSON to Java object
   Employee readValue = mapper.readValue(json.getBytes(), Employee.class);
   System.out.println("object:" + readValue);
   
   //convert Java object to JSON
   mapper.writeValue(System.out, readValue);
   
  } catch (IOException  e) {
   e.printStackTrace();
  } 
 }
}
