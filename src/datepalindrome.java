

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class datepalindrome {
	public static void main(String[] args)
	{
	 DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
     Calendar cal = Calendar.getInstance();
     Date date = cal.getTime();
     String todaysdate = dateFormat.format(date);
      System.out.println("Today's date : " + todaysdate);
	}
}
