package hw1_8_dop2;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i += 2) {
            System.out.print(a[i]+" ");
        }
    }
}
