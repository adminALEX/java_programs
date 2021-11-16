package leet_programs;
import java.util.Scanner;


class SolutionHR {
    public void solve(Integer[] arr){
        int sum = arr[0];
        for(int i=0;i<arr[2];i++){
                sum = sum + (int)(Math.pow(2, i)) * arr[1];
                System.out.print(sum +" ");
                 }
        }

    }


public class LoopManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SolutionHR sol = new SolutionHR();
        System.out.println("Enter n value :");
        int n = sc.nextInt();
        Integer[][] arr = new Integer[10][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++)
            arr[i][j] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        sol.solve(arr[i]);
        System.out.println();
    }
        sc.close();
    }
}
