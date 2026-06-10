package Level1PracticeProblems;
public class studentDiscount {
    public static void main(String[] args){
        int discountPercent = 10;
        int fee = 125000;
        int discountAmount = (fee * 10)/100;
        int discountedPrice = fee - discountAmount;
        System.out.println(" The discount amount is INR "+discountAmount+" and final discounted fee is INR "+discountedPrice);
    }
}
