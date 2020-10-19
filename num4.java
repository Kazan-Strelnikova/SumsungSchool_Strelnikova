package hw1_8;

import java.util.Scanner;

public class num4 {
    public static void main(String args[]){
        Scanner msc = new Scanner(System.in);
        int num = 4;
        int n = msc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = num + i*3;
        }
        for (int i=0;i<n-1;i++){
            System.out.print(a[i] + " ");

        }
        System.out.print(a[n-1]);

    }
}
