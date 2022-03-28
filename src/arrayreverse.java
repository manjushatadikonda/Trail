import org.testng.annotations.Test;

public class arrayreverse {
public int[] reverse(int[] arr, int m)
{
	int[] arr1=new int[arr.length];
	int j=arr.length-1;
	for(int i=0;i<=m;i++)
	{
		arr1[i]=arr[i];
	}
	for(int i=m+1;i<arr.length;i++)
	{
		arr1[j]=arr[i];
		j--;
	}

	for(int i=0;i<arr1.length;i++)
	{
	System.out.println(arr1[i]);
	}
	return arr1;
}
@Test
public void test1()
{
	int[] arr= {1,2,3,4,5,6};
	int m=3;
	reverse(arr,m);
}
}
