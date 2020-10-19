package hw1_8;

import java.util.Scanner;

public class num5 {
    public static void main(String args[]){
        Scanner msc = new Scanner(System.in);
        int n = msc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = msc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            int d = a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=d;
        }
        for(int i =0;i<n-1;i++){
            System.out.print(a[i] + " ");
        }
        System.out.print(a[n-1]);
    }
}
