package programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class addtwostrings {
	public int convert(String num1)
	{
		int[] num=new int[num1.length()];
		for(int i=0;i<num1.length();i++)
		{
			num[i]=num1.charAt(i)-'0';
		}
		
		int res=0;
	    for(int i=0;i<num.length;i++) {
	         res=res*10+num[i];
	    }
	    return res;
	}
public int addstrings(String num1,String num2)
{
	int A=convert(num1);
	int B=convert(num2);
	int result=A+B;
	return result;
	
}
@Test
public void test1()
{
	Assert.assertEquals(addstrings("21","20"),41);
}
@Test
public void test2()
{
	Assert.assertEquals(addstrings("5","21"),26);
}
@Test
public void test3()
{
	Assert.assertEquals(addstrings("10","9"),19);
}
}
