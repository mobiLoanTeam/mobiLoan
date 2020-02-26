package com.capdev.helper;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class MapHelper {

	static ModelMapper modelMapper = new ModelMapper();
	static ObjectMapper objectMaper = new ObjectMapper()
			.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
			.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	
	Map<String, Object> data = new HashMap<String, Object>();

	static Type listType = new TypeToken<List<?>>() {
	}.getType();

	
	
	public static Map<String, Object> objectToMap(Object obj){
		return objectMaper.convertValue(obj, Map.class);
	} 
	
	public static String objectToJson(Object obj) {
		try {
			return objectMaper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
	
	public static Object MapToObject(Map<String,Object> map,Class classe) {
		return objectMaper.convertValue(map,classe);
	}
	
}
