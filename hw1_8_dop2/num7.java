package hw1_8_dop2;

import java.util.Scanner;

public class num7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 1;
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        for (int i=0;i<n-1;i++){
            if (a[i]!=a[i+1]){
                c +=1;
            }
        }
        System.out.println(c);
    }
}
