// Write a Program to check if the given number is a prime number or not
// Hint => 
// A number that can be divided exactly only by itself and 1 are Prime Numbers,
// Prime Numbers checks are done for numbers greater than 1
// Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
// Use the isPrime boolean variable to store the result


package Level3Problems;
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1) return;
        boolean isPrime = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
