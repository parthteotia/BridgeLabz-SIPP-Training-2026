// Write a program to check if the first is the smallest of the 3 numbers.
// I/P => number1, number2, number3
// O/P => Is the first number the smallest?


package Level1Problems;
import java.util.Scanner;
public class smallestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        boolean isSmallest = true;
        if(n2<=n1 || n3<=n1) isSmallest = false;
        System.out.println("Is the first number the smallest? "+isSmallest);
    }
}
