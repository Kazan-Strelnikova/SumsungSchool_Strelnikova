package hw1_9;

import java.util.Scanner;

public class num5 {
    static double metod(int a[]) {
        double s = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 999 && a[i] < 10000) {
                s += a[i];
                count++;
            }
        }
        if(count==0){
            return -1;
        }else{
            return s/count;
        }
    }
    public static void main(String args[]){
        Scanner myscanner = new Scanner(System.in);
        int n=myscanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=myscanner.nextInt();
        }
        System.out.printf("%.2f", metod(a));
    }
}
