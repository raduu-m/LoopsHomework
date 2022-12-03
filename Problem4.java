import java.util.Scanner;

public class Problem4 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Enter the integers: ");
int number = input.nextInt();
input.close();
int sum_even= 0;
int sum_odd = 0;

while(number != 0) {
    int digit = number % 10;
    if(digit % 2 == 0){
        sum_even = sum_even + digit;
    }
    else{
        sum_odd = sum_odd + digit;
    }
    number /= 10;
}
System.out.println("The sum of the even digits is: " + sum_even);
System.out.println("The sum of the odd digits is: " + sum_odd);
}
}

