// Ravi just joined a coding guild. Store his name, age, rank, salary, and membership fee (fload) using correct data types. Compute his annual bonus (12% of salary), cast it to int, and print a formatted welcome card.

public class question1{

    static int annualBonus;
    
    public static void annualBonusCalculate(double salary){
        
        annualBonus = (int) (0.12 * salary);
        
    }

    public static void formattedPrint(String name, int age, int rank, double salary, float membershipFee){
        System.out.println(name);
        System.out.println(age);
        System.out.println(rank);
        System.out.println(salary);
        System.out.println(membershipFee);
        System.out.println(annualBonus);
    }
    public static void main(String[] args) {

        String name = args[0];
        String age = args[1];
        Integer i = Integer.parseInt(age);
        String rank = args[2];
        Integer j = Integer.parseInt(rank);
        String salary = args[3];
        Double d = Double.parseDouble(salary);
        String membershipFee = args[4];
        Float m = Float.parseFloat(membershipFee);
        
        annualBonusCalculate(d);
        formattedPrint(name,i,j,d,m);
    }
}