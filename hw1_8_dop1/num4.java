package hw1_8_dop;

import java.util.Scanner;

public class num4 {
    public static void main(String args[]) {
        Scanner msc = new Scanner(System.in);
        int n = msc.nextInt();
        int a=1;
        for(int i=1;i<n+1;i++){
            a*=i;
        }
        System.out.println(a);
    }
}
