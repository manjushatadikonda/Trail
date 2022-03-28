import org.testng.annotations.Test;

public class replacevowels {

	public String replace(String str)
	{
	
		str=str.replace('a', '*').replace('e', '*').replace('i', '*').replace('o', '*').replace('u', '*').replace('A', '*').replace('E', '*').replace('I', '*').replace('O', '*').replace('U', '*');
		return str;
	}
	@Test
	public void test1()
	{
		System.out.println(replace("Hello"));
	}
	@Test
	public void test2()
	{
		System.out.println(replace("AEIOUaeiou"));
	}
	@Test
	public void test3()
	{
		System.out.println(replace("APPLE"));
	}
}
