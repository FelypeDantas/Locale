package MetodosDate;

import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;

public class Data3 {
  public static void main(String[] args) {
	  
	  Calendar c = Calendar.getInstance();
	  c.set(1980, Calendar.FEBRUARY, 12);
	  Date date = c.getTime();
	  
	  DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
	  System.out.println(f.format(date));
  }
}
