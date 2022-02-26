import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Fizzbuzz 
{
public HashMap<Object,String> checkapp(Object[] arr)
{
	
	HashMap<Object,String> hMap=new HashMap<Object,String>();
	for(int i=0;i<arr.length;i++)
	{
			try
			{if((int)arr[i]%3==0 && (int)arr[i]%5!=0)
		      {
		    	  hMap.put(arr[i], "Fizz");
		      }
		      else if((int)arr[i]%5==0 && (int)arr[i]%3!=0)
		      {
		    	  hMap.put(arr[i], "Buzz");
		      } 
		      else if((int)arr[i]%3==0 && (int)arr[i]%5==0)
			     {
			    	 hMap.put(arr[i],"FizzBuzz");
			     }
			
		      else
		      {
		    	  String s="Divided "+arr[i]+" by 3"+"\n"+"\t"+"Divided "+arr[i]+" by 5";
		    	  hMap.put(arr[i], s);
		      }
			}
			catch(Exception e)
			{
				hMap.put(arr[i],"Invalid item");
			}
	
	}
	for(Map.Entry<Object, String> check:hMap.entrySet())
	{
		System.out.println(check.getKey()+"\t"+check.getValue()+"\n");
	}
	return hMap;
}

@Test
public void test1()
{
	Object[] arr1= {1,33,15,'a','B'};
	HashMap<Object,String> hMap1=checkapp(arr1);
	Assert.assertEquals(hMap1.get('a'),"Invalid item");
}
@Test
public void test2()
{
	Object[] arr1= {1,33,15,'a','B'};
	HashMap<Object,String> hMap1=checkapp(arr1);
	Assert.assertEquals(hMap1.get(33),"Fizz");
}
@Test
public void test3()
{
	Object[] arr1= {1,33,15,'a','B',10};
	HashMap<Object,String> hMap1=checkapp(arr1);
	Assert.assertEquals(hMap1.get(10),"Buzz");
}
@Test
public void test4()
{
	Object[] arr1= {1,33,15,'a','B',10};
	HashMap<Object,String> hMap1=checkapp(arr1);
	Assert.assertEquals(hMap1.get(15),"FizzBuzz");
}
@Test
public void test5()
{
	Object[] arr1= {1,33,15,'a','B',10};
	HashMap<Object,String> hMap1=checkapp(arr1);
	Assert.assertEquals(hMap1.get(1),"Divided 1 by 3"+"\n"+"\t"+"Divided 1 by 5");
	

}
}
