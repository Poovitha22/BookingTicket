package com.chainsys;
import java.util.HashMap;
import java.util.Map;

public class Reverse {

	public static void main(String[] args) {

	            Map<Integer, String> map = new HashMap<Integer, String>();
	            map.put(1,"one");
	            map.put(2,"two");
	            map.put(3,"three");
	            map.put(4,"four");

	            System.out.println(getKeyFromValue(map,"three"));
	          }


	// hm is the map you are trying to get value from it
	          public static Object getKeyFromValue(Map hm, Object value) {
	            for (Object o : hm.keySet()) {
	              if (hm.get(o).equals(value)) {
	                return o;
	              }
	            }
	            return null;
	          }
	        }


	


