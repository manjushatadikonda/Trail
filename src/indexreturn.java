import org.testng.Assert;
import org.testng.annotations.Test;

public class indexreturn {

	public int index(int[] arr, int n)
	{
		int index=-1;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				index=i;
			}
		}
		return index;
	}
	
	@Test
	public void test1(){
		
			int[] arr1= {1,2,3,4,4,5,6,6,8};
			Assert.assertEquals(index(arr1,3), 2);
		}
	@Test
	public void test2()
	{
		
			int[] arr1= {1,2,3,4,4,5,6,6,8};
			Assert.assertEquals(index(arr1,6), 7);
		
	}
	@Test
	public void test3()
	{
		int[] arr1= {1,2,3,4,4,5,6,6,8};
		Assert.assertEquals(index(arr1,9), -1);
		
	}
		
	@Test
	public void test4()
	{
		int[] arr1= {1,1,1,1,1};
		Assert.assertEquals(index(arr1,1), 4);
		
	}
	@Test
	public void test5()
	{
		int[] arr1= {1,2,3,25,26,3,5,3,5,1};
		Assert.assertEquals(index(arr1,1), 9);
		
	}
	
}

