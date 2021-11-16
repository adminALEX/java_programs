package classes_and_objects;

class A{
    int a;
    public A(){
        a=10;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        A ref=new A();
        System.out.println(ref.a);
        ref.a=1;
        System.out.println(ref.a);
        
    }
}
