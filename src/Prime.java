import java.util.*;

public class Prime
{


	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter Range: ");
		int count = input.nextInt();

		

		for(int i=0;i<=count; i++)
		{
			if(primeChecker(i)){
				System.out.println(i);
			}
		}
	}

	public static boolean primeChecker(int n)
	{
		boolean flag=true;

		for (int i=2; i <= n/2; i++)
		{
			if (n % i == 0)
			{
				flag = false;
				break;
			}
		}

		return flag;
	}
}
