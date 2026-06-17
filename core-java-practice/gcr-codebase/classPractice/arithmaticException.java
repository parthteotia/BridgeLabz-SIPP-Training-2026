public class arithmaticException {
    public static void main(String[] args){
        int i = 3;
        int sum = 1;
        try{sum = i/0;}
        catch(Exception e){System.out.println(sum);}
    }
}
