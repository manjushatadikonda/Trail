package programs;

public class dateandtime {
	DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm a");
    Date date = formatter.parse("12/8/2012 11:25 am");      
    Calendar cal=Calendar.getInstance();
    cal.setTime(date)
}
