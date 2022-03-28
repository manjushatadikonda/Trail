package programs;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class uniqueelement {
public int findunique(int[] arr)
{
	
	int num=0;
	
	 HashMap<Integer, Integer> hMap= new HashMap<Integer, Integer>();

	 for (int i = arr.length-1; i>= 0; i--)

	 {

	    if (hMap.containsKey(arr[i]))

	           {

	       int count = hMap.get(arr[i]);

	       hMap.put(arr[i], ++count);

	    } else {

	       hMap.put(arr[i],1);

	    }

	 }
	 for (Map.Entry<Integer, Integer> check : hMap.entrySet())
     {
	if(check.getValue()==1)
		num= check.getKey();
     }
	 
	return num;
}
@Test
public void test1()
{
	 int[] arr= {1,2,1,2,3};
	Assert.assertEquals(findunique(arr),3) ;
}
@Test
public void test2()
{
	 int[] arr= {6,3,3};
	Assert.assertEquals(findunique(arr),6) ;
}
@Test
public void test3()
{
	 int[] arr= {1,2,3,4,3,2,1};
	Assert.assertEquals(findunique(arr),4); 
}
}
