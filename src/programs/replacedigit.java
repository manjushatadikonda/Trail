package programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class replacedigit {
public String replace(String s)
{
	for(int i=0;i<s.length();i++)
	{
		if(Character.isDigit(s.charAt(i)))
				{
			      s= s.replace(s.charAt(i), '*');
				}
	}
	return s;
}
@Test
public void test1()
{
	String s1="James777";
	Assert.assertEquals(replace(s1),"James***");
}
@Test
public void test2()
{
	String s1="123456";
	Assert.assertEquals(replace(s1),"******");
}
}
