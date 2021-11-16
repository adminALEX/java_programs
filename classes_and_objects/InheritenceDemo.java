package classes_and_objects;


class Parent{
    public Parent(){
    System.out.println("parent");
    }
    public Parent(int n){
        System.out.println("parent");
        }
}
class Child1 extends Parent{
    public Child1(){
        System.out.println("child 1");
        }
        public Child1(int n){
            System.out.println("in child 1");
            }
}
class Child2 extends Child1{
    public Child2(){
        System.out.println("child 2");
        }
    public Child2(int n){
            super(3);
            System.out.println("in child 2");
        }
}


public class InheritenceDemo {
    public static void main(String[] args) {
        Child2 c2 = new Child2(2);
        c2.getClass();
    }
}
