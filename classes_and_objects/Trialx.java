package classes_and_objects;


interface Inter{
    void show();
}
class Implementor implements Inter{
    public void show(){
        System.out.println("hello");
    }
    public void hello(){
        System.out.println("hii");
    }
}


    public class Trialx{
        public static void main(String[] args) {
            Inter intr = new Implementor();
            intr.show();
            Implementor intr1 = new Implementor();
            intr1.hello();

    }
}
