package binary_Decimal;

import java.util.Scanner;

public class Binary_to_Decimal 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number to Convert in Binary");
		int num = s.nextInt();
		int binary = 0;
		int power = 1;
		while(num>0)
		{
			int remainder = num%2;
			binary = binary + remainder * power;
			power *= 10;
			num/=2;
		}
		System.out.println(binary);
	}
}
