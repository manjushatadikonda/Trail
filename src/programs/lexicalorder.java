package programs;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class lexicalorder {
public String arrange(String s)
{
	s=s.toLowerCase();
	String[] st=s.split("\\s");
	Arrays.sort(st);
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<st.length;i++)
	{
		sb.append(st[i]+" ");
		
	}
	return sb.toString().trim();
}
@Test
public void test1()
{
	String s="my name is manjusha";
	Assert.assertEquals(arrange(s),"is manjusha my name");
}
@Test
public void test2()
{
	String s="how are you";
	Assert.assertEquals(arrange(s),"are how you");
}
}
