package hw1_11;

import java.util.Scanner;

public class num4 {
    static String metod(int a,int[] b,int c) {
        String res="";
        for(int j=0;j<c;j++){
            int d=a*j;
            b[j]=d;
            if(d<10){
                res+="   "+d;
            }else if(d>9 && d<100){
                res+="  "+d;
            }else{
                res+=" "+d;
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner msc = new Scanner(System.in);
        int n = msc.nextInt();
        int m = msc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n-1;i++){
            System.out.println(metod(i,a[i],m));
        }
        System.out.print(metod((n-1),a[n-1],m));
    }
}
