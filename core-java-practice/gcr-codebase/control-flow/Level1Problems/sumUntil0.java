// Write a program to find the sum of numbers until the user enters 0
// Hint => 
// Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
// Use the while loop to check if the user entered is 0
// If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
// The loop will continue till the user enters zero and outside the loop display the total value


package Level1Problems;
import java.util.Scanner;
public class sumUntil0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double newNum = sc.nextDouble();
        double total = newNum;
        
        while(newNum != 0){
            newNum = sc.nextDouble();
            total += newNum;
        }
        System.out.println(total);
    }
}
