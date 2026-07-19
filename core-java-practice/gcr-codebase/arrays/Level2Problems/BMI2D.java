// Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
// Hint => 
// Take input for a number of persons
// Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
//        double[][] personData = new double[number][3];
//        String[] weightStatus = new String[number];
// Take input for weight and height of the persons and for negative values, ask the user to enter positive values
// Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
// Display the height, weight, BMI and status of each person

import java.util.Scanner;
public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                personData[i][j] = sc.nextDouble();
                if(personData[i][j] < 0){
                    System.out.println("Enter positive values.");
                    j--;
                }
            }
        }
        for(int i=0;i<n;i++){
            personData[i][2] = personData[i][0]/(personData[i][1]*personData[i][1]);
        }
        for(int i=0;i<n;i++){
            if(personData[i][2]<18.5) weightStatus[i] = "Underweight";
            else if(personData[i][2]>=18.5 && personData[i][2]<25.0) weightStatus[i] = "Normal";
            else if(personData[i][2]>=25.0 && personData[i][2]<40.0) weightStatus[i] = "Overweight";
            else if(personData[i][2]>=40.0) weightStatus[i] = "Obese";
        }
        for(int i=0;i<n;i++){
            System.out.println("Height: "+personData[i][1]+"\nWeight: "+personData[i][0]+"\nBMI: "+personData[i][2]+"\nWeight Status: "+weightStatus[i]);
        }
    }
}
