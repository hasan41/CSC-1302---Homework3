import java.util.*;
public class CalendarDateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>();
		dates.add(new CalendarDate(2019,02,12));
		dates.add(new CalendarDate(2022,02,12));
		dates.add(new CalendarDate(1998,12,25));
		dates.add(new CalendarDate(2004,04,21));
		dates.add(new CalendarDate(1624,12,20));
		dates.add(new CalendarDate(2018,9,10));


		
		System.out.println("Orignal Dates = " + dates);
        Collections.sort(dates);
        System.out.println("Ordered Dates(Yearly) = " + dates);

	}

}
