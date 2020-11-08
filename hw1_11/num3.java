package hw1_11;

import java.util.Scanner;

public class num3 {
    public static void main(String args[]){
        Scanner msc = new Scanner(System.in);
        int n = msc.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = msc.nextInt();
            }
        }
        int flag =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=a[j][i]){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
