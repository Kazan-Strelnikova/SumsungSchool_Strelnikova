package hw1_9;

import java.util.Scanner;

public class num1 {
    static int sum(int a) {
        int l=a/10;
        int r=a%10;
        int sum=l+r;
        return sum;
    }
    public static void main(String args[]){
        Scanner myscanner = new Scanner(System.in);
        int num=myscanner.nextInt();
        System.out.println(sum(num));
    }
}