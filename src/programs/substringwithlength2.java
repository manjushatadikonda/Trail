package programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class substringwithlength2 {

	
	
	public int length(String str)
	{
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i;j<=str.length()-1;j++)
			{
				String str1=str.substring(i,j+1);
				System.out.println(str1);
				if(str1.length()==2)
				{
					count++;
				}
			}
		}
		return count;
	}
	@Test
	public void test()
	{
		String s="abbc";
		Assert.assertEquals(length(s),3);
	}
	@Test
	public void test2()
	{
		String s="abc";
		Assert.assertEquals(length(s),2);
	}
	}

