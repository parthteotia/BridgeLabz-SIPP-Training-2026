package Level1PracticeProblems;

public class findAge {
    public static void main(String[] args){
        int currentYear = 2024;
        int birthYear = 2000;
        System.out.println("Harry's age in 2024 is "+age(currentYear, birthYear));
    }
    public static int age(int currentYear, int birthYear){
        int hisAge = currentYear - birthYear;
        return hisAge;
    }
}
