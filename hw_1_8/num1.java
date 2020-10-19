package hw1_8;

import java.util.Scanner;

public class num1 {
    public static void main(String args[]){
        Scanner msc = new Scanner(System.in);
        int n = msc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = msc.nextInt();
        }
        int x=msc.nextInt();
        int res=0;
        for (int i=0;i<n;i++){
            if(a[i]==x){
                res = i+1;
                break;
            }
        }
        if(res==0){
            System.out.print("NO");
        }else{
            System.out.print(res);
        }
    }
}
