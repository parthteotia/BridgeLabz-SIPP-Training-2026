// Create a program to print odd and even numbers between 1 to the number entered by the user.
// Hint => 
// Get an integer input from the user, assign to a variable number and check for Natural Number
// Using a for loop, iterate from 1 to the number
// In each iteration of the loop, print the number is odd or even number


package Level2Problems;
import java.util.Scanner;
public class oddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddSum = 0;
        int evenSum = 0;
        for(int i=2;i<n;i++){
            if(i%2==0){ 
                evenSum += i;
                System.out.println("even");
            }
            else{ 
                oddSum += i;
                System.out.println("odd");
            }
            
        }
        System.out.println("Sum of odd numbers: "+oddSum);
        System.out.println("Sum of even numbers: "+evenSum);
    }
}
