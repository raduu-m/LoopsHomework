// Write a program to print Fibonacci series of n terms where n is input by user 



import java.util.Scanner;

public class Problem5 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Enter the number of terms: ");
int number = input.nextInt();
input.close();
int a = 0;
int b = 1;
int c = 0;
System.out.println("Fibonacci Series of " + number + " terms");

for (int i = 1; i <= number; i++) {
    System.out.print(a + " ");
    c = a + b;
    a = b;
    b = c;
}
}
}
