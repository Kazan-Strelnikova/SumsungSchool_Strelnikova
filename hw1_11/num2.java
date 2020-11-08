package hw1_11;

import java.util.Scanner;

public class num2 {
    public static void main(String args[]){
        Scanner msc = new Scanner(System.in);
        int n = msc.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                if(j==n-i-1){
                    a[i][j] = 1;
                }
                else if(j<n-i-1){
                    a[i][j] =0;
                }else{
                    a[i][j] =2;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
