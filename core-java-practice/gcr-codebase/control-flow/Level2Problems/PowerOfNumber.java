// Create a program to find the power of a number.
// Hint => 
// Get integer input for two variables - number and power and check for positive integer
// Create a result variable with an initial value of 1.
// Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result


package Level2Problems;
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int result = 1;
        for(int i=0;i<p;i++){
            result *= n;
        }
        System.out.println(result);
    }
}
