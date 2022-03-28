package petclinic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tester {


public String details(Pet pet)
{
	return pet.toString();
}

@Test
public void test1()
{
	Pet p=new Pet("Rocky",7,30,"Dog","husky");
	Assert.assertEquals(details(p), "Rocky 7 30 Dog husky");
}
@Test
public void test2()
{
	Pet p=new Pet("Rocky",7,30,"Dog","husky");
	boolean b=p.getName().isEmpty();
	Assert.assertFalse(b);
}
@Test
public void test3()
{
	Pet p=null;
	String name=p.getName();
}

}
