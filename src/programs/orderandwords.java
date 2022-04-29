package programs;

import java.util.Arrays;
import java.util.Comparator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class orderandwords {
public String wordscheck(String[] words,String ORDER)
{
	String[] words1=words.clone();
	Arrays.sort(words1, new Comparator<String>() {

	    @Override
	    public int compare(String o1, String o2) {
	       return ORDER.indexOf(o1) -  ORDER.indexOf(o2) ;
	    }
	});
	if(Arrays.equals(words1,words))
	{
		System.out.println("YES");
		return "YES";
	}
	else
	{
		System.out.println("NO");
		return "NO";
	}
	
	
}
@Test
public void test1()
{
	String[] words= {"word","world","row"};
	String Order="worldabcefghijkmnpqstuvxyz";
	Assert.assertEquals(wordscheck(words,Order),"NO");
}
@Test
public void test2()
{
	String[] words= {"ninja","codingninja"};
	String Order="nabcdefghijklmopqrstuvwxyz";
	Assert.assertEquals(wordscheck(words,Order),"YES");
}
}
