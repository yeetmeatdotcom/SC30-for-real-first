

import java.util.Scanner;

public class LeapyearRunner {
    public static void main( String args[] )
	{
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a year = ");
        int year = keyboard.nextInt();
        
        if (App.LeapYear(year)) 
        {
            System.out.println(year + " A leap year.");
        } 
        else 
        {
            System.out.println(year + " Not a leap year.");
        }
        keyboard.close();
	}
}
