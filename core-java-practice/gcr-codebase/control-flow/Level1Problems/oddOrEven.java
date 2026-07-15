// Create a program to print odd and even numbers between 1 to the number entered by the user.
// Hint => 
// Get an integer input from the user, assign to a variable number and check for Natural Number
// Using a for loop, iterate from 1 to the number
// In each iteration of the loop, print the number is odd or even number


package Level1Problems;
import java.util.Scanner;
public class oddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "odd";

        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
            return;
        }
        for(int i=1;i<=n;i++){
            if(i%2==0) s = "even";
            System.out.println(i+" "+s);
            s = "odd";
        }
    }
}
