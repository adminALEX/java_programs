package classes_and_objects;

class A2 extends C2{
    public void show(){
        System.out.println("in A");
    }
}

class B2{
    public void show(){
        System.out.println("in B");
    }
}

class C2{
    public void show(){
        System.out.println("in C");
    }
}

public class DynamicMethodTrial {
    public static void main(String[] args) {
        C2 bug1 = new A2();
        bug1.show();
        bug1 = new C2();
        bug1.show();

    }
}
