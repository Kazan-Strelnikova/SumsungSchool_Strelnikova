package hw1_8_dop2;

import java.util.Scanner;

public class num6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int max=a[0];
        for (int i = 0; i < n; i ++) {
            if(a[i]>max) {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}

