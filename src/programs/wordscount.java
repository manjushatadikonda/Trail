package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class wordscount {
public HashMap<String,Integer> check(String s)
{
	s=s.toLowerCase();
	String[] st=s.split("\\s");
	HashMap<String,Integer> hMap=new HashMap<String,Integer>();
	for(int i=0;i<st.length;i++)
	{
		if(hMap.containsKey(st[i]))
		{
			int count=hMap.get(st[i]);
			hMap.put(st[i],++count);
		}
		else
			hMap.put(st[i],1);
	}
	System.out.println(hMap);
    
	return hMap;
}
@Test
public void test1()
{
	String s="My Name is Durga and my son Name is Yashva";
	Assert.assertEquals(check(s).size(), 7);
}
}
