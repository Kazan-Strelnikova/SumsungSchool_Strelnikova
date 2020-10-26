package hw1_8_dop;

import java.util.Scanner;

public class num1 {
    public static void main(String args[]){
        Scanner msc = new Scanner(System.in);
        int n = msc.nextInt();
        while(n>1){
            System.out.print(n%2);
            n=n/2;
        }
        System.out.print(n);
    }
}
