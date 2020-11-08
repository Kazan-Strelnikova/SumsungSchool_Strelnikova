package hw1_11;

import java.util.Scanner;

public class num1 {
    public static void main(String args[]){
        Scanner msc = new Scanner(System.in);
        int n = msc.nextInt();
        int m = msc.nextInt();
        int a[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                a[i][j] = msc.nextInt();
            }
        }
        System.out.print(m+" "+n+"\n");
        for(int i=0;i<m;i++){
            for(int j=n-1;j>-1;j--) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
