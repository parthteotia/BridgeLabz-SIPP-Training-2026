import java.util.Scanner;
public class max69Number1323 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 0;
        int count = 1000;
        boolean foundSix = false;
        while(digit != 6 && count > 0){
            int temp = n;
            digit = (temp/count)%10;
            if (digit == 6) {
                foundSix = true;
                break;
            }
                count = count/10;
        }
        if(foundSix){
            int r = n % count;
            int s = n / count;
            s = s + 3;
            n = (s * count) + r;
        }
        System.out.println(n);
    }
}
