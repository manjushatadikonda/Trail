import java.io.File;
 class trails {

	 int i=5;
	class class2
	{
	 int i=3;
	class class3
		{
			int i=2;
			int k=(i*i*i);
			void printing()
			{
				System.out.println(k);
			}
		}
	}
public static void main(String[] args)
{
	trails t=new trails();
	trails.class2 c=t.new class2();
	trails.class2.class3 c1=c.new class3();
	c1.printing();
	
	
}
}
