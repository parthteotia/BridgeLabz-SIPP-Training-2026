package Level2PracticeProblems;
import java.util.Scanner;
public class areaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double base_inch = base/2.54;
        double height_inch = height/2.54;
        double area_cm = base*height*1/2;
        double area_inch = base_inch*height_inch*1/2;
        System.out.println("The Area of the triangle in sq in is "+area_inch+" and sq cm is "+area_cm+".")
    }
}
