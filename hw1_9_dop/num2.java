package hw1_9_dop;

import java.util.Scanner;

public class num2 {
    static int min(int a, int b, int c, int d){
        return Math.min(Math.min(a,b),Math.min(c,d));
    }
    public static void main(String args[]){
        Scanner myscanner = new Scanner(System.in);
        int a=myscanner.nextInt();
        int b=myscanner.nextInt();
        int c=myscanner.nextInt();
        int d=myscanner.nextInt();
        System.out.print(min(a,b,c,d));
    }
}

