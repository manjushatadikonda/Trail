import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class duplicate {
	 public HashMap<Character, Integer> occurance(String str)

     {
                str=str.toUpperCase();

                HashMap<Character, Integer> hMap= new HashMap<Character, Integer>();
                HashMap<Character, Integer> hMap1= new HashMap<Character, Integer>();
                char[] strArray = str.toCharArray();
                
                
                for (char c : strArray) {
                    if (hMap.containsKey(c)) {
         
                        hMap.put(c, hMap.get(c) + 1);
                    }
                    else {
         
                    
                        hMap.put(c, 1);
                    }
                }
         

                
               // System.out.println(hMap);


                for (Map.Entry<Character, Integer> check : hMap.entrySet())
                {

           

                      if ( check.getValue()>1)

                       {

                        hMap1.put(check.getKey(),check.getValue());

                      }

                  }

          // System.out.println(hMap1);

           for (Map.Entry<Character, Integer> check : hMap1.entrySet())
           {
        	   System.out.println(check.getKey()+" "+check.getValue()+"\n");
        	   
           }
            
        	 return hMap1;

             }

     @Test

     public void test1()

     {
     HashMap<Character, Integer> hm=occurance("Banana");

        Assert.assertEquals(hm.size(),2);

     }

     @Test

     public void test2()

     {
    	 HashMap<Character, Integer> hm=  occurance("Apple");
        Assert.assertTrue(hm.containsKey('P'));

     }
}
