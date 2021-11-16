package classes_and_objects;

class A1 extends C{
    public void show(){
        System.out.println("in A");
    }
}

class B extends C{
    public void show(){
        System.out.println("in B");
    }
}

class C{
    public void show(){
        System.out.println("in C");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        C bug1 = new A1(); /* C is parent (reference) A1 is a child of C hence we use C as reference we can only access common methods of the both classes . */
        bug1.show();
        bug1 = new B(); /* This will change the object to B while runtime .This is known as Dynamic Method Dispatch . */
        bug1.show();
    }
}
