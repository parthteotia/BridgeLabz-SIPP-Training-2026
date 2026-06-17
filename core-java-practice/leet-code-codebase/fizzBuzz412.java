import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class fizzBuzz412{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fizzBuzzCalc(n));
        sc.close();
    }
    public static List<String> fizzBuzzCalc(int n) {
        List<String> answer = new ArrayList<>();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        for(int i=0;i<n;i++){
            if(arr[i]%3==0 && arr[i]%5==0){
                answer.add("FizzBuzz");
            }
            else if(arr[i]%3==0){
                answer.add("Fizz");
            }
            else if(arr[i]%5==0){
                answer.add("Buzz");
            }
            else{
                answer.add(String.valueOf(arr[i]));
            }
        }
        return answer;
    }
}
