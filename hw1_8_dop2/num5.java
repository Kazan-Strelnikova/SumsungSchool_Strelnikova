package hw1_8_dop2;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int c=0;
        for (int i = 1; i < n; i ++) {
            if(a[i]>a[i-1]) {
                c++;
            }
        }
        System.out.println(c);
    }
}
