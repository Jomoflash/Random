import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		boolean loopCondition=true;
		
		do{
		
		try 
		{
			System.out.println("Input a & b");
			
			int a = input.nextInt();
			int b = input.nextInt();
			
			if (b==0)
			{
				throw new ArithmeticException();
			}
			
			double c =  (float)a/b;
			
			System.out.printf("%.4f",c);
			
			loopCondition=false;
			
		}//end try
		
			catch(InputMismatchException e1)
			{
				System.out.printf("This is the error \n%s",e1);
				System.out.println("\n\n\tOnly integers is allowed");
				input.nextLine();
				System.out.printf("%s\n\n\tRetry\n\n\t", e1.getStackTrace());
			}//end catch e1
		
		catch(ArithmeticException e2)
		{
			System.out.println("Can't divide by zero");
		}
		
		}while(loopCondition);
	}
}
