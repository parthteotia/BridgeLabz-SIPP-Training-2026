package Level1PracticeProblems;

public class distributePen {
    public static void main(String[] args){
        int students = 3;
        int pens = 14;
        int penEach = students/pens;
        int remaining = students%pens;
        System.out.println("The pen per student is "+penEach+" and the remaining pens are "+remaining);

    }
}
