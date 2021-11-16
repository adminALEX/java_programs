package classes_and_objects;

class Outer{
    static int a;  
    static class Inner{
        int b;
    void show(){
        System.out.println(a);
        System.out.println(b);
    }
}
}

public class InnerClass {
    public static void main(String[] args) {
    Outer.a=2;
    Outer.Inner in=new Outer.Inner();
    in.b=3;
    in.show();
    }
    
}
