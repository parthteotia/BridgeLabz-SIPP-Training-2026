public class variableTypes{
    static int x;    //static class level varible, uninitialized -> default value 0
    int y;    //non-static object level variable, uninitialized, default value 0

    static void m1(){
        System.out.println(x);   //accesses the static variable x 
    }
    void m2(){
        int y = 40;
        System.out.println(y);   //accesses the local variable y
        System.out.println(this.y);    //accesses the non-static variable y
    }
    public static void main(String[] args){
        int x = 10;   //initialized local variable, can be used only in main method

        System.out.println(x);   //value of local variable x will be printed ,i.e., 10
        System.out.println(variableTypes.x);     //static variable x will be printed , i.e. 0

        variableTypes obj = new variableTypes();   //method with the same name as the class is called a constructor.

        System.out.println(obj.y);   //non-static variable y value is printed
        
        m1();      //static method m1. it can be called directly due to being static.
        obj.m2();      //since method m2 is non-static, an object has to be used to call it.
    }
}