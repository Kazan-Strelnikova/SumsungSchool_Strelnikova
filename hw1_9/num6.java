package hw1_9;

import java.util.Scanner;

public class num6 {
    static int [] metod(int a[]) {
        int min=a[0];
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
                index=i;
            }
        }
        for(int i=index;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=min;
        return a;
    }
    public static void main(String args[]){
        Scanner myscanner = new Scanner(System.in);
        int n=myscanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=myscanner.nextInt();
        }
        a=metod(a);
        for(int i=0;i<n-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print(a[n-1]);
    }
}
