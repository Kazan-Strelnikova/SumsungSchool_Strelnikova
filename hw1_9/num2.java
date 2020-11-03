package hw1_9;

import java.util.Scanner;

public class num2 {
    static int sum(int a) {
        int l=a/10;
        int r=a%10;
        int sum=l+r;
        return sum;
    }
    public static void main(String args[]){
        int s=0;
        for(int i=14;i<99;i+=7){
            s+=sum(i);
        }
        System.out.print(s);
    }
}
