import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
 class trails {

public static void main(String[] args) throws ParseException
{
	List<Date> dates = new ArrayList<Date>();
	DateFormat formatter = new SimpleDateFormat("MMM dd,yyyy HH:mm a");
    java.util.Date date = formatter.parse("Mar 25,2022 11:25 am");   
    java.util.Date date1 = formatter.parse("Mar 25,2022 11:30 am");
    Date d=dates.get(0);
    Date d="Mar 25,2022 11:25 am";
    Calendar cal=Calendar.getInstance();
    cal.setTime(d);
    calendar cal1=Calendar.getInstance();
    cal1.setTime()
	System.out.println(date.getYear()+"and"+date1.getYear());
	System.out.println(date.getMonth()+"and"+date1.getMonth());
	System.out.println(date.getDate()+"and"+date1.getDate());
	System.out.println(cal.MONTH+"and"+date1.getDate());
}
}
