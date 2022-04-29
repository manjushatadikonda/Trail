package programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class descendingfrequency {
public int[] check(int[] arr)
{ 
	
	HashMap<Integer,Integer> hMap=new HashMap<Integer,Integer>();
	 HashMap<Integer, Integer> mapIndex
     = new HashMap<Integer, Integer>();
	int[] arr1=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		if(hMap.containsKey(arr[i]))
		{
			int count=hMap.get(arr[i]);
			hMap.put(arr[i],++count);
		}
		else
		{
			hMap.put(arr[i], 1);
			mapIndex.put(arr[i], i);
		}
	}
	
	   List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hMap.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
            	if(o1.getValue()!=o2.getValue())
                return (o1.getValue()).compareTo(o2.getValue());
            	else
            		return(mapIndex.get(o2.getKey()).compareTo(mapIndex.get(o1.getKey())));
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
            System.out.println(aa.getKey()+" "+aa.getValue());
        }
        int count=arr1.length-1;
        for(Map.Entry<Integer, Integer> a:temp.entrySet())
        {
        	//System.out.println(a.getKey());
        	

        		for(int j=0;j<a.getValue();j++)
        		{
        		arr1[count]=a.getKey();
        		count--;
        		}
        	
        }
        
        for(int j=0;j<arr1.length;j++)
        {
        	System.out.println(arr1[j]);
        }
        return arr1;
}
@Test
public void test1()
{
	int[] arr= {2,8,8,3,4,2,8};
	Assert.assertEquals(check(arr)[0],8);
}
}
