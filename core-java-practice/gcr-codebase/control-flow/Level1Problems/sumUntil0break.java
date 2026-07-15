// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
// Hint => 
// Use infinite while loop as in while (true)
// Take the user entry and check if the user entered 0 or a negative number to break the loop using break;


package Level1Problems;
import java.util.Scanner;
public class sumUntil0break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        while(true){
            n = sc.nextInt();
            if(n<1) break;
            sum += n;
        }
        System.out.println(sum);
    }
}
