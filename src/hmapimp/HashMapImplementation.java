package hmapimp;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapImplementation {
	 static ArrayList<String> arr= new ArrayList<String>();
	 
	  
	   static HashMap<String, Integer>  hMap=new HashMap<String, Integer>();
	  static  void clear()
  	   {
  		   hMap.clear();
  	   }
	  	 
	  	   
	  	   static void INSERT(String key,Integer value)
	  	   {
	  		   if(hMap.containsKey(key))
	  		   {
	  		  hMap.put(key,value);
	  		   }
	  		   else
	  		   {
	  			 hMap.put(key,value);
	  			   arr.add(key);
	  		   }
	  			   
	  	   }
	  	   
	  	   static void DELETE(String key)
	  	   {
	  		   if(hMap.containsKey(key))
	  		   {
	  			   hMap.remove(key);
	              System.out.println(hMap);
	  		   }
	  	   }
	  	   
	  	   static boolean SEARCH(String key)
	  	   {
	  		 if(hMap.containsKey(key))
	  		   {
	  			 return true;
	  	   }
	  		 else
	  			 return false;
	  	   }
	  	   
	  	   static int GET(String key)
	  	   {
	  		   if(hMap.containsKey(key))
	  			   return hMap.get(key);
	  		   else
	  		   return -1;
	  	   }
	  	   
	  	   static int GET_SIZE()
	  	   {
	  		   return hMap.size();
	  	   }
	  	   
	  	   static boolean IS_EMPTY()
	  	   {
	  		   if(hMap.isEmpty())
	  		   return true;
	  		   else
	  			   return false;
	  	   }
	  	   
	  	   
}
