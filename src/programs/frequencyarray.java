package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class frequencyarray
{
 public Integer[] frequency(Integer[] A)
 
 { 
	
	 HashMap<Integer, Integer> hMap= new HashMap<Integer, Integer>();

 for (int i = A.length-1; i>= 0; i--)

 {

    if (hMap.containsKey(A[i]))

           {

       int count = hMap.get(A[i]);

       hMap.put(A[i], ++count);

    } else {

       hMap.put(A[i],1);

    }

 }

 Integer[] B=hMap.values().toArray(new Integer[0]);

 return B;
 }
 public int frequencyofarray(Integer[] B)
 {
	
	Integer[] C=frequency(frequency(B));
	Arrays.sort(C);
	 return C[C.length-1];
 }
 
 @Test
 public void test1()
 {
	 Integer[] arr= {1,2,1,2,3};
	Assert.assertEquals(frequencyofarray(arr), 2); ;
 }
 @Test
 public void test2()
 {
	 Integer[] arr= {7,5,5};
	Assert.assertEquals(frequencyofarray(arr), 1); ;
 }
 @Test
 public void test3()
 {
	 Integer[] arr= {1,2,3,4,3,2,2};
	Assert.assertEquals(frequencyofarray(arr), 2); ;
 }
}
