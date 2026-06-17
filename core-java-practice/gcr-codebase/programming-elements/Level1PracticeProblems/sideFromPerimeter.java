package Level1PracticeProblems;

import java.util.Scanner;
public class sideFromPerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float perimeter = sc.nextFloat();
        float side = perimeter / 4;
        System.out.println("The length of side of the square is "+side+" that has a perimeter of "+perimeter+".");
        sc.close();
    }
}
