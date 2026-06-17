package Level1PracticeProblems;

import java.util.Scanner;
public class feetToYards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = sc.nextDouble();
        double yard = feet / 3;
        double mile = feet / 1760;
        System.out.println("The distance in feet is "+feet+" while in yard is "+yard+" and in mile is "+mile+".");
        sc.close();
    }
}
