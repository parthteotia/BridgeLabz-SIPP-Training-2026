/* Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
 Hint => 
 Take user input for a number. 
 Find the count of digits in the number. 
 Find the digits in the number and save them in an array
 Create an array to store the elements of the digits array in reverse order
 Finally, display the elements of the array in reverse order  */

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxDigit = 10;
        int temp = n;
        int index = 0;
        int[] digits = new int[maxDigit];
        while(temp != 0){
            digits[index] = temp%10;
            index++;
            temp /= 10;
            if(index == maxDigit){
                maxDigit += 10;
                int[] tempArr = new int[maxDigit];
                for(int i=0;i<index;i++){
                    tempArr[i] = digits[i];
                }
                digits = tempArr;
            }
        }
        int[] revDigits = new int[index];
        for(int i=0;i<index;i++){
            revDigits[i] = digits[index - 1 - i];
        }
        for(int i=0;i<index;i++){
            System.out.print(revDigits[i]+" ");
        }
    }
}
