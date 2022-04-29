package programs;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class reversestring {
public String reverse(String str)
{
	String[] st=str.split("\\s");
	// StringBuilder b = new StringBuilder();
	for(int i=0,j=st.length-1;i<j;i++,j--)
	{//System.out.println(st[i]);
		String temp=st[i];
		st[i]=st[j];
		st[j]=temp;
		
		System.out.println(st[i]);
	}
	
	return Arrays.toString(st).replace(',', ' ').trim();
}
@Test
public void test()
{
	String s="I love java programming";
	Assert.assertEquals(reverse(s),"programming java love I");
}
}
