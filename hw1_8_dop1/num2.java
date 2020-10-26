package hw1_8_dop;

import java.util.Scanner;

public class num2 {
    public static void main(String args[]){
        Scanner msc = new Scanner(System.in);
        int n = msc.nextInt();
        int a=0;
        for(int i=0;i<n-1;i++){
            a+=msc.nextInt();
        }
        int b=0;
        for(int i=1;i<n+1;i++){
            b+=i;
        }
        System.out.print(b-a);
    }
}
