package programs;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class substrings {
	public int check(String str)
	{
		Set<String> set=new HashSet<String>();
		int count;
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i;j<=str.length()-1;j++)
			{
				String str1=str.substring(i,j+1);
				set.add(str1);
			}
		}
		set.add(" ");
		count=set.size();
		return count;
	}
	@Test
	public void test()
	{
		String s="sds";
		Assert.assertEquals(check(s),6);
	}
	@Test
	public void test2()
	{
		String s="abc";
		Assert.assertEquals(check(s),7);
	}
	@Test
	public void test3()
	{
		String s="abcd";
		Assert.assertEquals(check(s), 11);
	}
	}

