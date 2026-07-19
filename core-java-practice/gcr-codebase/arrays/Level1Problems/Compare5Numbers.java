// Write a program to take user input for 5 numbers and check whether a 
// number is positive,  negative, or zero. Further for positive numbers 
// check if the number is even or odd. Finally compare the first and last 
// elements of the array and display if they equal, greater or less
// Hint => 
// Define an integer array of 5 elements and get user input to store in the array.
// Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
// If the number is negative, print negative. Else if the number is zero, print zero. 
// Finally compare the first and last element of the array and display if they equal, greater or less

import java.util.Scanner;
public class Compare5Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i=0;i<5;i++){
            nums[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(nums[i]>0){
                System.out.println("Positive");
                if(nums[i]%2==0) System.out.println("even");
                else System.out.println("odd");
            }
            else if(nums[i]==0){
                System.out.println("Zero");
            }
            else{
                System.out.println("Negative");
            }
        }
        if(nums[0]>nums[nums.length-1]) System.out.println("first is greater");
        else if(nums[0]<nums[nums.length-1]) System.out.println("last is greater");
        else System.out.println("both are equal");
    }
}
