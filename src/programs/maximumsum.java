package programs;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class maximumsum {
public int sum(int[] arr)
{
	int sum=0;
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++)
	{
		sum+=arr[i]*i;
	}
	return sum;
}

@Test
public void test1()
{
	int[] arr= {1,2,3};
	Assert.assertEquals(sum(arr), 8);
}
}
