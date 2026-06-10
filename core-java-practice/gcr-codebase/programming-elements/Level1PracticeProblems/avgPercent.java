package Level1PracticeProblems;

public class avgPercent {
    public static void main(String[] args){
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        
        System.out.println("Sam’s average mark in PCM is "+percent(maths,physics,chemistry));

    }
    public static double percent(int maths, int physics, int chemistry){
        double avg = 0.01 * (maths + physics + chemistry) * 0.3;
        return avg;
    }
}
