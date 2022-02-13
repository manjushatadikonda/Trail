import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class occurance {

     public int maxoccurance(int num)

     {

                int digi;

                ArrayList<Integer> list= new ArrayList<Integer>();

                while(num>0)

                {

                digi=num%10;

                num=num/10;

                list.add(digi);

                }

                HashMap<Integer, Integer> hMap= new HashMap<Integer, Integer>();

                for (int i = list.size()-1; i>= 0; i--)

                {

                   if (hMap.containsKey(list.get(i)))

                          {

                      int count = hMap.get(list.get(i));

                      hMap.put(list.get(i), ++count);

                   } else {

                      hMap.put(list.get(i),1);

                   }

                }

                System.out.println(hMap);

                int maxValue = hMap.getOrDefault(0, 0);

                int maxkey = hMap.getOrDefault(0, 0);

               // System.out.println(max);

                for (Map.Entry<Integer, Integer> check : hMap.entrySet()) {

           

                      if ( check.getValue()>maxValue)

                       {

                          maxValue = check.getValue();

                          maxkey=check.getKey();

                      }

                  }

           

              return maxkey;

             }

     @Test

     public void test1()

     {

          Assert.assertEquals(maxoccurance(12341231),1);

     }

     @Test

     public void test2()

     {

          Assert.assertEquals(maxoccurance(1414156484),4);

     }

}