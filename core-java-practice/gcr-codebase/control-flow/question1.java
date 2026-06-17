// A kingdom's tax system charges 5% for income <10K, 15% for 10K - 50K, 30% above 50K. Read a citizen's income, print tax bracket and amount. Extend: loop over an array of 10 citizens and tally total tax collected.

import java.util.Scanner;

public class question1 {

    static double taxPercent;
    static double taxAmount;

    static void taxBracket(long income){
        if(income < 10000){
            System.out.println("Tax Bracket: 5% of income.");
            taxPercent = 0.05;
        }
        else if(income >= 10000 && income <= 50000){
            System.out.println("Tax Bracket: 15% of income.");
            taxPercent = 0.15;
        }
        else{
            System.out.println("Tax Bracket: 30% of income.");
            taxPercent = 0.3;
        } 
    }
    static void taxTotal(long income){
        taxAmount = taxPercent * income;
        System.out.println(taxAmount);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long income = sc.nextInt();
        
        taxBracket(income);
        taxTotal(income);
        sc.close();
    }
}
