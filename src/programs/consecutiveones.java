package programs;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class consecutiveones {
public int check(int[] arr)
{
	List<Integer> list=new ArrayList<Integer>();
	int j=0;
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i]==1)
		{
			int k=1;
			for(j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]==0)
					break;
				else
					k++;
			}
			i=j;
			list.add(k);
		}
			
	}
	int max=0;
	for(int i=0;i<=list.size()-1;i++)
	{
		if(list.get(i)>max)
		{
			max=list.get(i);
		}
	}
	return max;
}
@Test
public void test1()
{
	int[] arr= {1,0,1,1,1,0,0,1,1};
	Assert.assertEquals(check(arr),3);
}
@Test
public void test2()
{
	int[] arr= {1,0,1,1,1,0,0,1,1,1,1,0,1,1,1,1,1};
	Assert.assertEquals(check(arr),5);
}
}
