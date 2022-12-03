import java.util.Scanner;

public class Problem2 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Enter a positive integer: ");
int number = input.nextInt();
input.close();
System.out.println("Multiplication Table of " + number);

for (int i = 1; i <= 10; i++) {

    System.out.println(number + " * " + i + " = " + number * i);
}
}
}
