package hw1_8_dop;

import java.util.Scanner;

public class num3 {
    public static void main(String args[]){
        Scanner msc = new Scanner(System.in);
        int n = msc.nextInt();
        int a[][]=new int[n][n];
        int b=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=b;
                b++;
            }
        }
        for(int i=0;i<n-1;i++){
            System.out.print(a[i][i]+" ");
        }
        System.out.println(a[n-1][n-1]);
    }
}
