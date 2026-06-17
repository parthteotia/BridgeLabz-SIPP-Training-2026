package Level1PracticeProblems;

import java.util.Scanner;
public class studentDiscount2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int discountPercent = sc.nextInt();
        int fee = sc.nextInt();
        int discountAmount = (fee * discountPercent)/100;
        int discountedPrice = fee - discountAmount;
        System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+discountedPrice);
        sc.close();
    }
}