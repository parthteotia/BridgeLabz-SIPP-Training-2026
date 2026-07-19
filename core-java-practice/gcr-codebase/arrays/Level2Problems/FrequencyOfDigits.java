// Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
// Hint => 
// Take the input for a number
// Find the count of digits in the number
// Find the digits in the number and save them in an array
// Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
// Display the frequency of each digit in the number

import java.util.Scanner;
public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        while(temp != 0){
            digits[count] = temp%10;
            count++;
            temp /= 10;
            if(count == maxDigit){
                maxDigit += 10;
                int[] tempArr = new int[maxDigit];
                for(int i=0;i<count;i++){
                    tempArr[i] = digits[i];
                }
                digits = tempArr;
            }
        }
        int[] frequency = new int[10];
        for(int i=0;i<count;i++){
            frequency[digits[i]]++;
        }
        for(int i=0;i<10;i++){
            System.out.println("Frequency of "+i+": "+frequency[i]);
        }
    }
}
