package Level2PracticeProblems;

import java.util.Scanner;
public class basicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+number1+" and "+number2+" are "+(number1+number2)+", "+(number1-number2)+", "+number1*number2+", and "+number1/number2+".");
    }
}
