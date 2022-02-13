import java.util.HashMap;

import java.util.Map;

import java.util.Map.Entry;

 

public class cricketscoreshashmap {

     static HashMap<String, Integer> score = new HashMap<String, Integer>();

     public static void addscores()

     {

     score.put("Agarwal", 28);

     score.put("Sharma", 14);

     score.put("Pujara",58);

     score.put("Kohli",120);

     score.put("Jadeja", 99);

     score.put("Dhoni",101);

     score.put("Yuvi", 52);

     }

     public static void printscores()

     {

     for(Map.Entry<String, Integer> m: score.entrySet())

     {

          System.out.println(m.getKey()+":"+m.getValue());

     }

     }

    

     public static void main(String[] args) {

          // TODO Auto-generated method stub

         

          addscores();

          printscores();

     }

 

}