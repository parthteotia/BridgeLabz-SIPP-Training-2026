// A warehouse stores item quantities in an array. Find the max, min, total stock, and detect duplicates.
// Extend: rotate the stock array by k positions (simulate daily shift handover), and transpose a 2D shelf grid.

import java.util.Scanner;
import java.util.Arrays;

public class warehouseItemStorage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] stock = {45, 20, 60, 20, 90, 15, 60};

        findMinMax(stock);
        findTotal(stock);
        searchItem(stock, 90);
        findDuplicates(stock);

        int[] rotated = rotateArray(stock, 2);
        System.out.println("Rotated Array: "+ Arrays.toString(rotated));

        int[][] matrix = {{1,2,3},{4,5,6}};
        transpose(matrix);
        sc.close();
    }
    static void findMinMax(int[] stock){
        int min = stock[0];
        int max = stock[0];
        for(int i=1;i<stock.length;i++){
            if(stock[i]<min){
                min = stock[i];
            }
            if(stock[i]>max){
                max = stock[i];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
    static void findTotal(int[] stock){
        int sum = 0;
        for(int i=0;i<stock.length;i++){
            sum += stock[i];
        }
        System.out.println("Total: "+sum);
    }
    static void searchItem(int[] stock, int target){
        boolean found = false;
        for(int i=0;i<stock.length;i++){
            if(stock[i]==target){
                System.out.println("Item found at index: "+i);
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("Item not found.");
        }
    }
    static void findDuplicates(int[] stock){
        System.out.println("Duplicates: ");

        for(int i=0;i<stock.length;i++){
            for(int j=i+1;j<stock.length;j++){
                if(stock[i]==stock[j]){
                    System.out.println(stock[i]);
                    break;
                }
            }
        }
    }
    static int[] rotateArray(int[] stock, int k){
        int[] result = new int[stock.length];
        for(int i=0;i<stock.length;i++){
            int newIndex = (i + k) % stock.length;
            result[newIndex] = stock[i];
        }
        return result;
    }
    static void transpose(int[][] matrix){
        System.out.println("Transpose: ");
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.println(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
