import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class frequency {
	public TreeMap<Character, Integer> occurance(String str)

    {
               str=str.toLowerCase();

               HashMap<Character, Integer> hMap= new HashMap<Character, Integer>();
               TreeMap<Character, Integer> hMap1= new TreeMap<Character, Integer>();
               char[] strArray = str.toCharArray();
               
               
               for (char c : strArray) {
                   if (hMap.containsKey(c)) {
        
                       hMap.put(c, hMap.get(c) + 1);
                   }
                   else {
        
                   
                       hMap.put(c, 1);
                   }
               }
        



             
          char ch;
         
          for (ch = 'a' ; ch <= 'z' ; ch++ )
          {
          if(hMap.containsKey(ch))
          {
        	  for (Map.Entry<Character, Integer> check : hMap.entrySet())
              {
                        if(check.getKey().equals(ch))
                      {
                      //temp=check.getKey();
                     //temp1=check.getValue();
                      //con=true;
                      hMap1.put(ch,check.getValue());
                       
                     }
                       
                        
                      
                 }
        	 
          }
          else
        	  hMap1.put(ch, 0);
        	 /* if(con)
        	  {
        		  hMap1.put(temp,temp1);
        		  con=false;
        	  }
        	  else
        	  {
        		  hMap1.put(ch, 0);
        	  }*/
          }
        
System.out.println(hMap1);
       	 return hMap1;

            }

    @Test

    public void test1()

    {
    TreeMap<Character, Integer> hm=occurance("Banana");

    //   Assert.assertEquals(hm.get(0),2);

    }

    @Test

    public void test2()

    {
   	 TreeMap<Character, Integer> hm=  occurance("Apple");
      // Assert.assertTrue(hm.containsKey('P'));

    }
}
