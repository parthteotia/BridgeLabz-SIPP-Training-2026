// Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
// Hint => 
// In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements. 
// To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
// Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number

import java.util.Scanner;
public class SecondLargestElementDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0) return;
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        int temp = n;
        
        while(temp!=0){
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
        int largest = 0;
        int largestIndex = 0;
        int secondLargest = 0;
        for(int i=0;i<index;i++){
            if(digits[i]>largest){
                largest = digits[i];
                largestIndex = i;
            }
        }
        for(int i=0;i<index;i++){
            if(digits[i]>secondLargest && digits[i]<=largest && i!=largestIndex) secondLargest = digits[i];
        }
        System.out.println("Largest: "+largest+"\nSecond Largest: "+secondLargest);
    }
}
