package programs;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class anagram {
public boolean check(String s1, String s2)
{
	HashMap<Character,Integer> hMap1= new HashMap<Character,Integer>();
	HashMap<Character,Integer> hMap2= new HashMap<Character,Integer>();
	for(int i=0;i<s1.length();i++)
	{
		if(hMap1.containsKey(s1.charAt(i)))
		{
			int count=hMap1.get(s1.charAt(i));
			hMap1.put(s1.charAt(i), ++count);
		}
		else
		hMap1.put(s1.charAt(i), 1);
	}
	for(int i=0;i<s2.length();i++)
	{
		if(hMap2.containsKey(s2.charAt(i)))
		{
			int count=hMap2.get(s2.charAt(i));
			hMap2.put(s2.charAt(i), ++count);
		}
		else
		hMap2.put(s2.charAt(i), 1);
	}
	if(!s1.equals(s2))
	{
		if(hMap1.equals(hMap2))
			return true;
		else
			return false;
	}
	else
		return false;
}

@Test
public void test1()
{
	String s1="spar";
	String s2="rapz";
	Assert.assertEquals(check(s1,s2),false);
}
@Test
public void test2()
{
	String s1="rapz";
	String s2="rapz";
	Assert.assertEquals(check(s1,s2),false);
}
@Test
public void test3()
{
	String s1="listen";
	String s2="silent";
	Assert.assertEquals(check(s1,s2),true);
}
}
