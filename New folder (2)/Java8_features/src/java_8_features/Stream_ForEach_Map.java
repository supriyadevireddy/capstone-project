package java_8_features;

import java.util.LinkedHashMap;
import java.util.Map;

public class Stream_ForEach_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map -- group of entries 
	      //  -- as every entry in a map is unique with respect to keys  -- so group of entries we consider them as Set of Entries

	//Map<Object, Object> mapObj = new HashMap<Object, Object>();
	
	Map<Object, Object> mapObj = new LinkedHashMap<Object, Object>();
	
	mapObj.put("id", 400);
	mapObj.put(9000, "bill");
	mapObj.put(9.3, "aggr");
	mapObj.put("gender", 'M');
	mapObj.put("symbol", '$');
	mapObj.put("name", "sagar");
	mapObj.put(9000, "amount");
	mapObj.put("course", "java");
	mapObj.put("fee", 400);
	mapObj.put(null, 9800);
	
	mapObj.entrySet().stream().forEach(x -> System.out.println(x.getKey()+" -- "+x.getValue()));
	
	
}



	}


