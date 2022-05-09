package programs;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class selfdivisor {
	public boolean selfdivisorcheck(int num)
	{
		boolean selfdiv=true;
		List<Integer> list=new ArrayList<Integer>();
		int num1=num;
		while(num1>0)
		{
			list.add((num1%10));
			num1=num1/10;
		}
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)!=0)
			{
			if(num%(list.get(i))!=0)
			{
				selfdiv=false;
			}
			}
			else
				selfdiv=false;
		}
		return selfdiv;
	}
public List<Integer> check(int num,int count)
{
	int count1=0;
	List<Integer> list1=new ArrayList<Integer>();
	for(int i=num;count1<count;i++)
	{
		if(selfdivisorcheck(i))
		{
			count1++;
			list1.add(i);
		}
	}
	return list1;
}
@Test
public void test1()
{
	List<Integer> list=check(10,1);
	System.out.println(list);
	Assert.assertTrue(list.contains(11));
}
@Test
public void test2()
{
	List<Integer> list=check(10,3);
	System.out.println(list);
	Assert.assertTrue(list.contains(11));
	Assert.assertTrue(list.contains(12));
	Assert.assertTrue(list.contains(15));
	Assert.assertFalse(list.contains(13));
}
@Test
public void test3()
{
	List<Integer> list=check(22,5);
	System.out.println(list);
	
}

}
