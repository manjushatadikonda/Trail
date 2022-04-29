package hmapimp;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hmapcall {
	  void input(int i,String key,Integer value)
  	  {
  		  if(i==1)
  		  {
  			 HashMapImplementation.INSERT(key,value);
  		  }
  	  }
  	  
  	 Object input(int i,String key)
  	  {
  		Object[] items=new Object[1];
  		int j=0;
  		  if(i==2)
  		  {
  			HashMapImplementation.DELETE(key);
  		  }
  	  
  		  else if(i==3)
  		  {
  			boolean h=HashMapImplementation.SEARCH(key);
  			items[j]=h;
  		  }
  		  else
  		  {
  			  int k=HashMapImplementation.GET(key);
  			  items[j]=k;
  			  
  		  }
  		
		  return items[j];
  			  
  	  }
  	 
  	Object input(int i)
	  {
  		
  		Object[] items=new Object[1];
  		int j=0;
  	     if(i==5)
  	     {
  	    	 int k=HashMapImplementation.GET_SIZE();
  	    	 items[j]=k;
  	     }
  	     else
  	     {
  	    	 boolean h=HashMapImplementation.IS_EMPTY();
  	    	 items[j]=h;
  	     }
  	     
  	     return items[j];
  	     
		
	  }
  	@BeforeMethod
  	public void clean()
  	{
  		HashMapImplementation.clear();
  	}
  	@Test
  	public void test1()
  	{
  		input(1,"qwerty",35);
  		input(1,"qwerty",50);
  		Assert.assertEquals(input(5),1);
  		
  	}		

@Test
public void test2()
{
	
	input(1,"code",9);
	Assert.assertEquals(input(3,"code"), true);
	input(2,"code");
	Assert.assertEquals(input(3,"code"), false);
	Assert.assertEquals(input(5), 0);
	Assert.assertEquals(input(6), true);
}
}
