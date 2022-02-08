package dnd.util;

public class ExandrianCalendar extends Calendar {

	/**
	 * post divergence
	 */
	public static int PD = 1;

	private int era = PD;
	private int year = 835;
	private int month = 1;
	private int dayOfMonth = 1;
	private int dayOfWeek = 0;
	private int weekOfMonth = 0;

	public ExandrianCalendar(int year, int month, int dayOfMonth) {
		this.year = year;
		this.month = month;
		this.dayOfMonth = dayOfMonth;
	}

	@Override
	public String toString() {
		return year + "-" + month + "-" + dayOfMonth;
	}

}
