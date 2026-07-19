// An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
// Hint => 
// Take input for a number of persons
// Create arrays to store the weight, height, BMI, and weight status of the persons
// Take input for the weight and height of the persons
// Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
// Display the height, weight, BMI, and weight status of each person
// Use the table to determine the weight status of the person

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double height[] = new double[n];
        double weight[] = new double[n];
        double bmi[] = new double[n];
        String[] weightClass = new String[n];
        System.out.println("First enter height in m than weight in kg than move to second person");
        for(int i=0;i<n;i++){
            height[i] = sc.nextDouble();
            weight[i] = sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            bmi[i] = weight[i]/(height[i] * height[i]);
        }
        for(int i=0;i<n;i++){
            if(bmi[i]<18.5) weightClass[i] = "Underweight";
            else if(bmi[i]>=18.5 && bmi[i]<25.0) weightClass[i] = "Normal";
            else if(bmi[i]>=25.0 && bmi[i]<40.0) weightClass[i] = "Overweight";
            else if(bmi[i]>=40.0) weightClass[i] = "Obese";
        }
        for(int i=0;i<n;i++){
            System.out.println("Height: "+height[i]+"\nWeight: "+weight[i]+"\nBMI: "+bmi[i]+"\nWeight Status: "+weightClass[i]);
        }
    }
}
