package hw1_9;

import java.util.Scanner;

public class num4 {
    static double metod(double a){
        a*=2;
        System.out.print((int) a);
        a=a-((int) a);
        return a;
    }
    public static void main(String args[]){
        Scanner myscanner = new Scanner(System.in);
        double x=myscanner.nextDouble();
        int n=myscanner.nextInt();
        for(int i=0;i<n;i++){
            x=metod(x);
        }
    }
}
