package programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class largestword {
public String check(String s)
{
	String[] st=s.split("\\s");
	String max=st[0];
	boolean condition=false;
	for(int i=1;i<st.length;i++)
	{
		if(max.length()!=st[i].length())
			condition=true;
	}
	
	if(condition)
	{
	for(int i=1;i<st.length;i++)
	{
		if(st[i].length()>max.length())
		{
			max=st[i];
		}
		
	}
	}
	else
		max="-1";
	
	return max;
}
@Test
public void test1()
{
	String s="Hello World";
	Assert.assertEquals(check(s),"-1");
}
@Test
public void test2()
{
	String s="Selenium Java";
	Assert.assertEquals(check(s),"Selenium");
}
@Test
public void test3()
{
	String s="Selenium";
	Assert.assertEquals(check(s),"-1");
}
@Test
public void test4()
{
	String s="Java Selenium test";
	Assert.assertEquals(check(s),"Selenium");
}
@Test
public void test5()
{
	String s="test Selenium Java";
	Assert.assertEquals(check(s),"Selenium");
}
@Test
public void test6()
{
	String s="Hello World Test";
	Assert.assertEquals(check(s),"-1");
}
}
