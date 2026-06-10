package Level1PracticeProblems;

public class calcProfit {
    public static void main(String[] args){
        int cp = 129;
        int sp = 191;
        int profit = sp - cp;
        float profitPercent = ((float) profit/cp) * 100;

        System.out.println("The Cost price is INR "+cp+" and Cost price is INR "+sp+"\nThe Profit is INR "+profit+" and profit percentage is "+profitPercent+"%.");
    }
}
