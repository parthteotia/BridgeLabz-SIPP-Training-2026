// Create a program to find the bonus of 10 employees based on their 
// years of service and the total bonus amount the company Zara has to 
// pay, along with the old and new salary.
// Hint => 
// Zara decides to give a bonus of 5% to employees whose year of service 
// is more than 5 years or 2% if less than 5 years
// Define a double array to save salary and years of service for each 
// of the 10 employees
// Also define a double array to save the new salary and the bonus amount 
// as well as variables to save the total bonus, total old salary, and 
// new salary
// Define a loop to take input from the user. If salary or year of service 
// is an invalid number then ask the use to enter again. Note in this case 
// you will have to decrement the index counter
// Define another loop to calculate the bonus of 10 employees based on 
// their years of service. Save the bonus in the array, compute the new 
// salary, and save in the array. Also, the total bonus and total old and 
// new salary can be calculated in the loop
// Print the total bonus payout as well as the total old and new salary of 
// all the employees

import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 2;
        int cols = 10;
        double[][] salary = new double[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                salary[i][j] = sc.nextDouble();
                if(salary[i][j] < 0){
                    System.out.println("Invalid input. Enter again.");
                    j--;
                }
            }
        }
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        for(int i=0;i<cols;i++){
            totalOldSalary += salary[1][i];
        }
        double[][] bonus = new double[rows][cols];
        for(int i=0;i<cols;i++){
            if(salary[0][i]>5) bonus[0][i] = salary[1][i] + salary[1][i]*0.05;
            else bonus[0][i] = salary[1][i] + salary[1][i]*0.02;
            totalNewSalary += bonus[0][i];
        }
        for(int i=0;i<cols;i++){
            bonus[1][i] = bonus[0][i] - salary[1][i];
            totalBonus += bonus[1][i];
        }
        System.out.println("Total Old Salary: "+totalOldSalary);
        System.out.println("Total New Salary: "+totalNewSalary);
        System.out.println("Total Bonus: "+totalBonus);
    }
}
