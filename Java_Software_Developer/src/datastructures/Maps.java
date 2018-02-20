package datastructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		
		// Implement map interfaces
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		mapUtil(hMap);
	}
	
	public static void mapUtil(Map<Integer, String> map) {
		
		// 1. Add key-value pairs
		map.put(101, "Steve");
		map.put(502, "Roger");
		map.put(22, "Jennifer");
		map.put(325, "Don");
		map.put(750, "Kelly");
		
		// 2. Expose / access elements
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all key-value pairs: " + map);
		System.out.println(map.get(502));
		
		// 3. Iterate thought map of key-value pairs
		for (int key : map.keySet()) {
			System.out.println("Key: " + key + ". Value: "+ map.get(key));
		}
	}

}
