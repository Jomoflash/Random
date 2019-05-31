import java.util.Scanner;

public class CodeJam
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter val ");
		
		long a = sc.nextLong();
		long b =0;
		System.out.println();
		
		while(valChecker(a) || valChecker(b)){
			a--; b++;
		}
		
		System.out.printf("A = %d, B = %d" ,a,b);
	}
	
	public static boolean valChecker(long val)
	{
		String s = String.valueOf(val);
		boolean cond = false;
		
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='4'){
				cond = true;
				break ;
			}
		}
		return cond;
	}
}
