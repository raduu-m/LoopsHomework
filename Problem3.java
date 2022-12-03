import java.util.Scanner;

public class Problem3 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Enter a positive integer: ");

int number = input.nextInt();
input.close();
int reverse = 0;

while(number != 0) {
    int digit = number % 10;
    reverse = reverse * 10 + digit;
    number /= 10;
}
System.out.println("The reverse of the input is: " + reverse);
}
}