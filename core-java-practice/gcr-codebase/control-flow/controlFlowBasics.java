public class controlFlowBasics {

    static String ternary(int age){
        return age > 10 ? "Greater than 10" : "Not greater than 10";
    }
    public static void main(String[] args){
        int k = 10;
        int res1 = k++ + --k + k + k-- - ++k - --k;
        System.out.println(res1);

        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        
        int y = 10;
        while(y>0){
            System.out.println(y);
            y--;
        }
        int z = 20;
        do{
            System.out.println(z);
            z--;
        }
        while(z>0);

        int m = 3;
        switch(m){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            default:
                System.out.println("default");
        }
    }
}
