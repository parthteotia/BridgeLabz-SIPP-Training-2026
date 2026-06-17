import java.util.Scanner;

class uglyNumber263 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        uglyNumber263 obj = new uglyNumber263();
        System.out.println(obj.isUgly(n));
        sc.close();
    }
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }

        while(n>1){
            if(n%2==0) n/=2;
            else if(n%3==0) n/=3;
            else if(n%5==0) n/=5;
            else{
                return false;
            }
        }
        return true;
    }
}
