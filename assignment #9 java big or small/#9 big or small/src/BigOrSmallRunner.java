//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class BigOrSmallRunner
{
	public static void main( String args[] )
	{
		BigOrSmall.check( 10, 20);		
		BigOrSmall.check( 20, 10);	
		BigOrSmall.check( 20, 20);
		BigOrSmall.check( 10, 10);	
		BigOrSmall.check( 0, 1);	
		BigOrSmall.check( 1, 0 );	
		BigOrSmall.check( 3, 5);	
		BigOrSmall.check( 5, 3 );	
		BigOrSmall.check( 5342, 323 );						
	}
}