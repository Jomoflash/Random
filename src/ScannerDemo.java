import java.util.Scanner;

public class ScannerDemo
	{
		public static void main( String[] args )
			{
				System.out.println( "Welcome, this program utilizes scanner class to print some  text" );

				String s = "Welcome, this program utilizes scanner class to print some  text";
				Scanner in = new Scanner( s );

				while ( in.hasNext( ) )
					{
						System.out.println( in.next( ) );
					}
					
				in.close(); //Close else you won't b able to use it

				System.out.println( "\n\n Finished" );

				while ( in.hasNext( ) )
					{
						System.out.println( in.next( ) );
					}
			}
	}
