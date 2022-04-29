package programs;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.BeforeMethod;

public class HashMapImplementation {
	 ArrayList<String> arr;   
	 
	  
	   HashMap<String, Integer>  hMap;
	 
	  	   public HashMapImplementation()
	   {
	       arr = new ArrayList<String>();
	       hMap = new HashMap<String, Integer>();
	   }
	  	   
	  	   void clear()
	  	   {
	  		   hMap.clear();
	  	   }

	  	   void INSERT(String key,Integer value)
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
	  	   
	  	   void DELETE(String key)
	  	   {
	  		   if(hMap.containsKey(key))
	  		   {
	  			   hMap.remove(key);
	  			   for(int i=0;i<arr.size();i++)
	  			   {
	  				   if(arr.get(i)==key)
	  				   {
	  					   arr.remove(i);
	  					   break;
	  				   }
	  			   }
	  		   }
	  	   }
	  	   
	  	   boolean SEARCH(String key)
	  	   {
	  		 if(hMap.containsKey(key))
	  		   {
	  			 return true;
	  	   }
	  		 else
	  			 return false;
	  	   }
	  	   
	  	   int GET(String key)
	  	   {
	  		   if(hMap.containsKey(key))
	  			   return hMap.get(key);
	  		   else
	  		   return -1;
	  	   }
	  	   
	  	   int GET_SIZE()
	  	   {
	  		   return hMap.size();
	  	   }
	  	   
	  	   boolean IS_EMPTY()
	  	   {
	  		   if(hMap.isEmpty())
	  		   return true;
	  		   else
	  			   return false;
	  	   }
	  	   
	  
}
