package classes_and_objects;

import java.util.*;

class Calc{
    int n1=4,n2=3,res;
    public void add(){
        res=n1+n2;
    }
    public void sub(){
        res=n1-n2;
    }
    public void multiply(){
        res=n1*n2;
    }

}

public class CalculatorClassDemo {
    public static void main(String[] args) {
        Calc referCalc = new Calc();
        System.out.println(" 1.ADDITION \n 2.SUBRACTION \n 3.MULTIPLICATION\n");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        if (a==1)
            referCalc.add();
        else if(a==2){
            referCalc.sub();
        }
        else if(a==3){
            referCalc.multiply();
        }
        else{
            System.out.println("Enter a valid Number!");
            System.exit(0);
        }
        System.out.print(referCalc.res);
    }
}
