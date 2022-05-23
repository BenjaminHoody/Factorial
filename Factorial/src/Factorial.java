import java.util.Scanner;

public class Factorial
	{

		public static void main(String[] args)
			{
				System.out.println("What is your number?");
				Scanner userInput = new Scanner (System.in);
				int num = userInput.nextInt();
				
				fact(num);
			}
		
		public static void fact(int n)
			{
				int num = 1;
				for(int i = num; i <= n; i++)
					{
						 num = num * i;
					}
				
				System.out.println(num);
				
			}

	}
