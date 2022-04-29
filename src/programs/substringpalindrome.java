package programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class substringpalindrome {
	public boolean check(String str)
	{
		StringBuilder input1 = new StringBuilder(str);
        input1.reverse();
        if(input1.toString().equals(str))
        	return true;
        else
        	return false;
	}
public int palindorme(String str)
{
	int count=0;
	for(int i=0;i<=str.length()-1;i++)
	{
		for(int j=i;j<=str.length()-1;j++)
		{
			String str1=str.substring(i,j+1);
			//System.out.println(str1);
			if(check(str1))
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
	Assert.assertEquals(palindorme(s),5);
}
@Test
public void test2()
{
	String s="abc";
	Assert.assertEquals(palindorme(s),3);
}
}
