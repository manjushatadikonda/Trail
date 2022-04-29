package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class arraysegmemts {

	public int check(int[] arr)
	{

		 int[] b=arr.clone();
         Arrays.sort(b);
         int[] c=new int[arr.length];
         int ch=0;
         
		for(int i=0;i<arr.length;i++)
		
		{
			System.out.println("Arr:"+Arrays.toString(arr));
			
			int j=0,res=0;
			while(j<arr.length)
			{
				int[] temp;
				if((j+i+1)>=arr.length)
					temp=Arrays.copyOfRange(arr,j,arr.length);
				else
				    temp=Arrays.copyOfRange(arr,j,j+i+1);
			j=j+i+1;
			System.out.println("Temp:"+Arrays.toString(temp));
			Arrays.sort(temp);
			for(int k=0;k<temp.length;k++)
			{
				c[res]=temp[k];
				res++;
			}	
		    }
	
			System.out.println("c:"+Arrays.toString(c));
			if(Arrays.equals(c,b))
			{
				ch=i;
				break;
			}
		     
			
	}
		return arr.length-ch;	
}
	@Test
	public void test1()
	{
			int[] arr= {2,1,3,4,4};
			Assert.assertEquals(check(arr),4);
	}
	
	@Test
	public void test2()
	{
			int[] arr= {2,3,4,5,1};
			Assert.assertEquals(check(arr),1);
	}
}
