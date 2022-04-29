package programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class arraynextelement {
public int[] arrayelements(int[] arr)
{
	for(int i=0;i<=arr.length-1;i++)
	{
		if(!(i==arr.length-1))
		{
			if(arr[i]>arr[i+1])
				arr[i]=arr[i+1];
			else
				arr[i]=-1;
		}
		else
		{
			arr[i]=-1;
		}
		System.out.println(arr[i]);
	}
	return arr;
	
}

@Test
public void test1()
{
	int[] arr= {4,2,3,1,3};
	int[] arr1=arrayelements(arr);
	Assert.assertEquals(arr1[0],2);
	Assert.assertEquals(arr1[1],-1);
	Assert.assertEquals(arr1[2],1);
	Assert.assertEquals(arr1[3],-1);
	Assert.assertEquals(arr1[4],-1);
}
}
