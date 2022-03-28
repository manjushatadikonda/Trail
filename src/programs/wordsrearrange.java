package programs;


import org.testng.Assert;
import org.testng.annotations.Test;

public class wordsrearrange {
public String sentence(String str)
{
         str= str.toLowerCase();
		 String[] my_str=str.split(" ");
		 int n=my_str.length;
	      for (int i=1 ;i<n; i++){
	         String temp = my_str[i];
	         int j = i - 1;
	         while (j >= 0 && temp.length() < my_str[j].length()){
	            my_str[j+1] = my_str[j];
	            j--;
	         }
	         my_str[j+1] = temp;
	      }
	      StringBuilder Text=new StringBuilder();
	      for(int j=0;j<n;j++)
	      {
	      if(j==0)
	      {
	    	 Text.append(my_str[j].substring(0,1).toUpperCase()+my_str[j].substring(1)+" ");
	      }
	      else
	      Text.append(my_str[j]+" ");
	      
	      }
	 
	return Text.toString().trim();
	 }

@Test
public void test1()
{
	Assert.assertEquals(sentence("my name is manjusha"),"My is name manjusha");
}
@Test
public void test2()
{
	Assert.assertEquals(sentence("Hello ninjas"),"Hello ninjas");
}
@Test
public void test3()
{
	Assert.assertEquals(sentence("Do you have a knack for coding"),"A do you for have knack coding");
}
}
