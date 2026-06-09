package core;

import java.util.Scanner;
public class maxNumberUsing6or9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 0;
        int count = 1000;
        while(digit != 6){
            int temp = n;
            digit = (temp/count)%10;
            if(digit == 9){
                count = count/10;
            }
        }
        int r = n % count;
        int s = n / count;
        s = s + 3;
        n = (s * count) + r;
        System.out.println(n);

        sc.close();
    }
}
