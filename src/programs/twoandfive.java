package programs;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class twoandfive {
public List<Integer> method(int number)
{
	List<Integer> list=new ArrayList<Integer>();
	for(int j=1;j<=number;j++)
	{
String temp = Integer.toString(j);

int[] num = new int[temp.length()];
Boolean flag=true;

for (int i = 0; i < temp.length(); i++){
    num[i] = temp.charAt(i) - '0';
}

for(int k=0;k<num.length;k++)
{
	if(!(num[k]==2||num[k]==5))
	{
		flag=false;
		break;
	}
	else
		flag=true;
}
if(flag)
	list.add(j);
	
	}
	System.out.println(list);
	return list;
}
@Test
public void test1()
{
	Assert.assertEquals(method(30).get(1).intValue(),5);
}
}
