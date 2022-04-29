package programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class jewels {
public int checkjewels(String J,String S)
{
	int count=0;
	for(int i=0;i<S.length();i++)
	{
		
		for(int j=0;j<J.length();j++)
		{
			if(S.charAt(i)==J.charAt(j))
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
	String J="aA";
	String S="aAAbbBc";
	Assert.assertEquals(checkjewels(J,S), 3);
}
}
