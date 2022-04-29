package programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class squareandcube {
	public int check(int n)
	{
		int res;
		res=(int)Math.pow(n,2)+(int)Math.pow(n,3);
		return res;
	}
@Test
public void test1()
{
	Assert.assertEquals(check(3), 36);
}
@Test
public void test2()
{
	Assert.assertEquals(check(10), 1100);
}
}
