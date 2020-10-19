package hw1_8;

import java.util.Scanner;

public class num6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int max = 0;
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
            if (a[i] > max){
                max = a[i];
            }
        }
        int b[] = new int[max];
        for (int i=0; i<n; i++){
            b[a[i]-1] += 1;
        }
        int min = 0;
        int ind = 0;
        for (int i=0; i<n; i++){
            if (b[a[i]-1] > min){
                min = b[a[i]-1];
                ind = a[i];
            }
        }
        System.out.print(ind);
    }
}
