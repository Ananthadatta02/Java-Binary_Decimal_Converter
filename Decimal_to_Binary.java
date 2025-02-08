package binary_Decimal;

import java.util.Scanner;

public class Decimal_to_Binary 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Decimal number to Convert in Binary");
		int num = s.nextInt();
		int binary = 0;
		int power = 1;
		while(num>0)
		{
			int remainder = num%10;
			binary = binary + remainder * power;
			power *= 2;
			num /= 10;
		}
		System.out.println(binary);
	}
}
