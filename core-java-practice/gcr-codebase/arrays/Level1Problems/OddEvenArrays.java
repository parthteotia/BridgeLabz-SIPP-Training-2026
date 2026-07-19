// Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
// Hint => 
// Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
// Create an integer array for even and odd numbers with size = number / 2 + 1
// Create index variables for odd and even numbers and initialize them to zero
// Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
// Finally, print the odd and even numbers array using the odd and even index

import java.util.Scanner;
public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddSize = n/2;
        int evenSize = n/2;
        if(n%2!=0) oddSize = (n+1)/2;
        else evenSize = (n+1)/2;
        int[] odd = new int[oddSize];
        int[] even = new int[evenSize];
        int oddIndex = 0;
        int evenIndex = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even[evenIndex] = i;
                evenIndex++;
            }
            else{
                odd[oddIndex] = i;
                oddIndex++;
            }
        }
        for(int i=0;i<evenSize;i++){
            System.out.print(even[i] + " ");
        }
        System.out.println();
        for(int i=0;i<oddSize;i++){
            System.out.print(odd[i] + " ");
        }
    }
}