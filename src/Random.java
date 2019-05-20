import java.util.Scanner;
import java.util.Random;

public class Random
{
	public static void main(String[] args)
	{
		Random ran = new Random();
		
		int f1=0;
		int f2=0;
		int f3=0;
		int f4=0;
		int f5=0;
		int f6=0;
		
		for(int i=0; i<=1000; i++){
			switch(1+ran.nextInt(6)){
				case 1:{f1++; break;}
				case 2:{f2++; break;}
				case 3:{f3++; break;}
				case 4:{f4++; break;}
				case 5:{f5++; break;}
				case 6:{f6++; break;}
			}
		}
		
		System.out.println("Done \n");
		System.out.println("Face\tFrequency");
		
		System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
		f1,f2,f3,f4,f5,f6);
	}
}
