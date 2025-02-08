# Binary-Decimal Converter

This repository contains two Java programs for converting numbers between binary and decimal representations:
1. **Decimal to Binary Conversion**
2. **Binary to Decimal Conversion**

## 1. Decimal to Binary Conversion

### Code:

```java
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
```

### Explanation:
This program converts a decimal number to binary using a loop and arithmetic operations.

#### **Step-by-Step Process:**
1. The user inputs a decimal number.
2. Initialize variables:
   - `binary = 0` (to store the final binary value)
   - `power = 1` (acts as a place value for binary digits)
3. The `while` loop executes until `num` becomes 0:
   - Extract the last digit (`num % 10`)
   - Multiply it by `power` and add to `binary`
   - Update `power` by multiplying it by 2
   - Remove the last digit from `num` (`num /= 10`)
4. Print the final binary result.

## 2. Binary to Decimal Conversion

### Code:

```java
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
```

### Explanation:
This program converts a binary number into its decimal equivalent.

#### **Step-by-Step Process:**
1. The user inputs a binary number.
2. Initialize variables:
   - `binary = 0` (to store the final decimal value)
   - `power = 1` (acts as a place value for decimal digits)
3. The `while` loop executes until `num` becomes 0:
   - Extract the last binary digit (`num % 2`)
   - Multiply it by `power` and add to `binary`
   - Update `power` by multiplying it by 10
   - Divide `num` by 2 to process the next digit
4. Print the decimal result.

## Key Takeaways:
- **Decimal to Binary:** Uses modulo 10 and power of 2.
- **Binary to Decimal:** Uses modulo 2 and power of 10.
- Demonstrates the use of loops and arithmetic operations in Java.
- Useful for understanding number system conversions in computer science.

## Clone
```
https://github.com/Ananthadatta02/Java-Binary_Decimal_Converter.git
```
