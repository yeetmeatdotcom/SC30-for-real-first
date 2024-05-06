


public class App {
	public static boolean LeapYear( int year )
	{
        if ((year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
	}
}
