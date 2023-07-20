import java.util.Scanner; 

public class LeapYear 
{

    	public static void main( String args[ ] )
	{
		int i, n;
		//boolean  flag = true;
		
		n = 2025;		
		{
		
		if( n % 4 == 0 )
			System.out.print( "\n Number " + n + " is a Leap Year." );
		else
			System.out.print( "\n Number " + n + " is NOT a Leap Year." );
	}
}
}