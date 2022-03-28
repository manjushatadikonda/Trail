package programs;

import org.testng.annotations.Test;

public class linearequation 
{
public int mathchall(String str)
{
	int a=0;
	int c=0;
	int b=0;
	String[] arr=str.split("[=]");
	
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	if(arr[i].contains("x"))
	{
	if(arr[i].contains("+"))
	{
	String[] arr1=arr[i].split("[+]");
	for(int j=0;j<arr1.length;j++)
	{
		if(arr1[j].contains("x"))
		{
			String[] arr2=arr1[j].split("x");
			System.out.println("value"+arr2[0]);
			if(arr2[0].isEmpty())
			{
			for(int k=0;k<arr2.length;k++)
			{
			b+=Integer.parseInt(arr2[k]);
			}
			}
			else
				b=1;
		}
		else
		{
			a+=Integer.parseInt(arr1[j]);
		}
		
	}
	System.out.println("a"+a);
	System.out.println("b"+b);
	}
	else if(arr[i].contains("-"))
	{
		String[] arr1=arr[i].split("[-]");
		for(int j=0;j<arr1.length;j++)
		{
			if(arr1[j].contains("x"))
			{
				String[] arr2=arr1[j].split("x");
				for(int k=0;k<arr2.length;k++)
				{
					if(arr2[0].isEmpty())
						b-=1;
					else
				b-=Integer.parseInt(arr2[0]);
				}
				b=-b;
			}
			else
			{
				a-=Integer.parseInt(arr1[j]);
			}
			System.out.println("a"+a);
			System.out.println("b"+b);
		}
	}
	
	else if(arr[i].contains("/"))
	{
		String[] arr1=arr[i].split("[/]");
		for(int j=0;j<arr1.length;j++)
		{
			if(arr1[j].contains("x"))
			{
				String[] arr2=arr1[j].split("x");
				for(int k=0;k<arr2.length;k++)
				{
					if(arr2[0]==null)
						b-=1;
					else
				b-=Integer.parseInt(arr2[0]);
				}
				b=-b;
			}
			else
			{
				a-=Integer.parseInt(arr1[j]);
			}
			System.out.println("a"+a);
			System.out.println("b"+b);
		}
	}
	}
	else
	{
		if(arr[i].contains("+"))
		{
			String[] arr1=arr[i].split("[+]");
			System.out.println(arr1[0]);
			System.out.println(arr1[1]);
			for(int j=0;j<arr1.length;j++)
			{
				c+=Integer.parseInt(arr1[j]);
			}
			System.out.println("c"+c);
		}
		else
		c+=Integer.parseInt(arr[i]);
		System.out.println("c"+c);
		
	}
	
	}
	
	return (c-a)/(b);
	
	
	
	
	
	
	
}

public int mathchall1(String str)
{
	int a=0;
	int c=0;
	int b=0;
	String[] arr=str.split("[=]");
	
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	if(arr[i].contains("x"))
	{
		if(arr[i].contains("+"))
		{
			String[] arr1=arr[i].split("+");
			
			
		}
		else
		{
			String[] arr1=arr[i].split("x");
			b+=Integer.parseInt(arr1[0]);
		}
		
		   
	}


	
	@Test
	public void test1()
	{
		System.out.println(mathchall("2x=4+2"));
	}
	
	
}
