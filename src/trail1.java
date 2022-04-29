import java.util.StringTokenizer;

public class trail1 {
	
	public static void main(String[] args) 
		
		{
		String s= "I like java Programming";
		check(s);
	}
	private static String check(String st) {
		StringBuilder rev=new StringBuilder(st);
		return rev.reverse().toString();
	}
}


