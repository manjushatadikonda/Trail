package programs;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class majority {
public int check(int[] arr)
{
	int N=arr.length;
	HashMap<Integer,Integer> hMap=new HashMap<Integer,Integer>();
	
	for(int i=0;i<N;i++)
	{
		if(hMap.containsKey(arr[i]))
				{
			      int count=hMap.get(arr[i]);
			      hMap.put(arr[i], ++count);
				}
		else
			hMap.put(arr[i], 1);
	}
	int major=-1;
	for(Map.Entry<Integer, Integer> k:hMap.entrySet())
	{
		if(k.getValue()>Math.floor(N/2))
		{
			major=k.getKey();
		}
		
	}
	return major;
}
@Test
public void test1()
{
	int[] arr= {2,3,9,2,2};
	Assert.assertEquals(check(arr),2);
}
@Test
public void test2()
{
	int[] arr= {8,5,1,9};
	Assert.assertEquals(check(arr),-1);
}
}
