package hw1_8;

import java.util.Scanner;

public class num3 {
    public static void main(String args[]){
        Scanner msc = new Scanner(System.in);
        int n = msc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = msc.nextInt();
        }
        double sum=0;
        int k=0;
        for (int i=0;i<n;i++){
            if(a[i]%2!=0){
                sum += a[i];
                k++;
            }
        }
        if(k==0){
            System.out.print("NO");
        }else{
            double r = sum/k;
            System.out.printf("%.2f", r);
        }
    }
}
