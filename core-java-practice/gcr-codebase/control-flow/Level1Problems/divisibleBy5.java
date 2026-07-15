// Write a program to check if a number is divisible by 5
// I/P => number
// O/P => Is the number ___ divisible by 5? ___



package Level1Problems;
import java.util.Scanner;
public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isDiv = false;
        if(number%5==0){
            isDiv = true;
        }
        System.out.println("Is the number "+number+" divisible by 5? "+isDiv);
    }
}
