package hw1_9_dop;

import java.util.Scanner;

public class num1 {
    static double metod(double a,double b,double c,double d) {
        double len=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
        return len;
    }
    public static void main(String args[]){
        Scanner myscanner = new Scanner(System.in);
        double x1=myscanner.nextDouble();
        double y1=myscanner.nextDouble();
        double x2=myscanner.nextDouble();
        double y2=myscanner.nextDouble();
        double x3=myscanner.nextDouble();
        double y3=myscanner.nextDouble();
        double a=metod(x1,y1,x2,y2);
        double b=metod(x2,y2,x3,y3);
        double c=metod(x1,y1,x3,y3);
        double perimeter=a+b+c;
        System.out.printf("%.10f", perimeter);
    }
}
