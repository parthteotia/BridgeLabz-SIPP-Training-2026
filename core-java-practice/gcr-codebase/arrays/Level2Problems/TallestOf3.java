// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
// Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
// Finally display the youngest and tallest of the 3 friends

import java.util.Scanner;
public class TallestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        for(int i=0;i<3;i++){
            age[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            height[i] = sc.nextInt();
        }
        String youngest = "";
        String tallest = "";
        int smallestIndex = 0;
        int biggestIndex = 0;
        for(int i=0;i<3;i++){
            if(age[i]<age[smallestIndex]) smallestIndex = i;
            if(height[i]>height[biggestIndex]) biggestIndex = i;
        }
        switch (smallestIndex) {
            case 0:
                youngest = "Amar";
                break;
            case 1:
                youngest = "Akbar";
                break;
            case 2:
                youngest = "Anthony";
                break;
            default:
                break;
        }
        switch (biggestIndex) {
            case 0:
                tallest = "Amar";
                break;
            case 1:
                tallest = "Akbar";
                break;
            case 2:
                tallest = "Anthony";
                break;
            default:
                break;
        }
        System.out.println("Youngest: "+youngest);
        System.out.println("Tallest: "+tallest);
    }
}
