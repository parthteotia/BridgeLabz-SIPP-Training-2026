// Create a program to find all the multiples of a number taken as user input below 100.
// Hint => 
// Get the input value for a variable named number. Check the number is a positive integer and less than 100.
// Run a for loop backward: from i = 100 to i = 1.
// Inside the loop, check if i perfectly divide the number. If true, print the number and continue the loop.

package Level2Problems;
import java.util.Scanner;
public class MultiplesOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<1 || n>100) return;
        for(int i=100;i>=n;i--){
            if(i%n==0) System.out.println(i);
        }
    }
}
