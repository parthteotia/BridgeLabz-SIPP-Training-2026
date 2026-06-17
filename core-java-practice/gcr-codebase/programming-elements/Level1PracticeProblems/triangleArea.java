package Level1PracticeProblems;

import java.util.Scanner;
public class triangleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double base = sc.nextDouble();
        double area = 0.5 * base * height;
        double areaInch = (0.5 * base * height)/(2.54 * 2.54);
        System.out.println("The area of trianle in square cm is "+ area+ " and in square inches is "+areaInch+".");
        sc.close();
    }
}
