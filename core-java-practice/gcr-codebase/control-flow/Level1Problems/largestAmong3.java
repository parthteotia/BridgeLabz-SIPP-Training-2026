// Write a program to check if the first, second, or third number is the largest of the three.
// I/P => number1, number2, number3
// O/P => 
// Is the first number the largest? ____
// Is the second number the largest? ___
// Is the third number the largest? ___



package Level1Problems;
import java.util.Scanner;
public class largestAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        boolean firstLargest  = (n1 > n2 && n1 > n3);
        boolean secondLargest = (n2 > n1 && n2 > n3);
        boolean thirdLargest  = (n3 > n1 && n3 > n2);
        
        System.out.println("first largest? "+ firstLargest+"\nsecond largest? "+secondLargest+"\nthird largest? "+thirdLargest );
    }
}
