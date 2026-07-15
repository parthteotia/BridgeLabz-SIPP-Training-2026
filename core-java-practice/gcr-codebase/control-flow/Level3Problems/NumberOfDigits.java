// Create a program to count the number of digits in an integer.
// Hint => 
// Get an integer input for the number variable.
// Create an integer variable count with value 0.
// Use a loop to iterate until number is not equal to 0.
// Remove the last digit from number in each iteration
// Increase count by 1 in each iteration.
// Finally display the count to show the number of digits


package Level3Problems;
import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n == 0) {
            System.out.println(1);
            return;
        }
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
