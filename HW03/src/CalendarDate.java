
public class CalendarDate implements Comparable <CalendarDate> {
	private int year; // instance variable 
	private int month;
	private int day;
	
	public CalendarDate(int year, int month, int day) {
		this.year = year; 
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int compareTo(CalendarDate other) {
		if(this.year != other.year) {
			return this.year - other.year;
		}
		else {
			return this.month - other.month;
		}
	}
	
	public String toString() {
		return this.year + "/" + this.month + "/" + this.day;
	}

}
