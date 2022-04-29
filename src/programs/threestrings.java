package programs;

import java.util.HashMap;

import org.testng.annotations.Test;

public class threestrings {
	public HashMap<Character,Integer> frequency(String s)
	{
		char[] st=s.toCharArray();
		HashMap<Character,Integer> hMap=new HashMap<Character,Integer>();
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
		return hMap;
	}
public void strings(String s1,String s2,String s3)
{
	String s4=s1.concat(s2);
	if(frequency(s4.toLowerCase()).equals(frequency(s3.toLowerCase())))
		System.out.println("YES");
	else
		System.out.println("NO");
}
@Test
public void test1()
{
	String s1="SANTACLAUS";
	String s2="DEDMOROZ";
	String s3="SANTAMOROZDEDCLAUS";
		strings(s1,s2,s3);
}
@Test
public void test2()
{
	String s1="Manju";
    String s2="sha";
    String s3="manjushaT";
	
		strings(s1,s2,s3);
}
}
