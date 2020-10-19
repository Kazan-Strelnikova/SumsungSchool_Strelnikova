package hw1_8;

import java.util.Scanner;

public class num7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int minus = 0;
        for (int i=0; i<n; i++){
            a[i] = in.nextInt();
            if(a[i] < 0){
                minus++;
            }
        }
        int m[] = new int[minus];
        int plus = n-minus;
        int p[] = new int[plus];
        int m2 = 0;
        int p2 = 0;
        for (int i=0; i<n; i++){
            if (a[i] < 0){
                m[m2] = a[i];
                m2++;
            } else {
                p[p2] = a[i];
                p2++;
            }
        }
        for (int i=0; i<m2; i++){
            System.out.print(m[i] + " ");
        }
        for (int i=0; i<p2; i++){
            System.out.print(p[i] + " ");
        }
    }
}
