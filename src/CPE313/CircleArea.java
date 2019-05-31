import java.io.*;

public class CircleArea
{
	public static void main(String[] args)
	{
		System.out.println("Hello \n This is a program to calculate the Area of a Circle");
		
		double rad = getRad();
		
		double area = (Math.PI * rad * rad);
		
		System.out.println("\n Area of the circle = " + area );
		
		
	}
	
	public static double getRad()
	{
		boolean condition = true;
		
		double rad = 0;
		
		while (condition)
		{
			try 
			{
				InputStreamReader inStream = new InputStreamReader(System.in);
				BufferedReader input= new BufferedReader(inStream);

				System.out.println("\n\n Enter the radius of the circle : ");

				String s = input.readLine();

				rad = Double.parseDouble(s);
				
				condition =false;
				
			}
			
			catch(IOException e)
			{
				
			}
			
			catch(NumberFormatException e)
			{
				System.out.println("    ***!\n  Thats an error!\n  The required value is of type double, e.g 4.123");
				System.out.println("   Try again! ");
				
			}
		}
		
		return rad;
	}
}
