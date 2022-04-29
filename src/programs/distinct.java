package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class distinct {
	
	    
	public String check(String str)
	{
		Set<Character> set1=new HashSet<Character>();
		List<String> list1=new ArrayList<String>();
		for(int i=0;i<str.length();i++)
		{
			set1.add(str.charAt(i));
		}
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i;j<=str.length()-1;j++)
			{
				String str1=str.substring(i,j+1);
				
				Set<Character> set2=new HashSet<Character>();
				for(int k=0;k<str1.length();k++)
				{
					set2.add(str1.charAt(k));
				}
				if(set1.equals(set2))
				{
					
					list1.add(str1);
				}
			}
		}
		
		Collections.sort(list1, new Comparator<String>(){
		       public int compare(String s1, String s2){
		                return s1.length() - s2.length();
		       }
		});
		
		return list1.get(0);
	}
@Test
public void test1()
{
	String s="aababcb";
	Assert.assertEquals(check(s),"abc");
}
@Test
public void test2()
{
	String s="bcabb";
	Assert.assertEquals(check(s),"bca");
}
}
