package classes_and_objects;
import java.util.Scanner;

class Payment{
    public void log(){
    System.out.println("Payment Started");
    }
    public void log1(){
        System.out.println("Duplic Payment Started");
    }
}

class GooglePay extends Payment{
    @Override
    public void log(){
        System.out.println("Google Payment Started");
        }
}

class PayTM extends Payment{
    @Override
    public void log(){
        System.out.println("PayTM Payment Started");
        }
}

public class MethodOverriding {
  public static void main(String[] args) {
        System.out.println("Select a payment method below :");
        System.out.println(" 1. GooglePay \n 2. PayTM");     
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if (a == 1){
            GooglePay gpay = new GooglePay();
            gpay.log();
            gpay.log1();
        }
        else if (a == 2){
            PayTM ptm = new PayTM();
            ptm.log();
        }
  }  
}
