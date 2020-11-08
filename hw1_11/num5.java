package hw1_11;

import java.util.Scanner;

public class num5 {
    public static class Help{
        public static int k=0;
    }
    static String metod(int a,int[] b,int c) {
        String res="";
        for(int j=0;j<c;j++){
            b[j]= Help.k;
            if(Help.k<10){
                res+="  "+ Help.k;
            }else{
                res+=" "+ Help.k;
            }
            Help.k++;
        }
        return res;
    }
    static String metod2(int a,int[] b,int c) {
        String res="";
        for(int j=c-1;j>-1;j--){
            b[j]= Help.k;
            if(Help.k<10){
                res="  "+ Help.k+res;
            }else{
                res=" "+ Help.k+res;
            }
            Help.k++;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner msc = new Scanner(System.in);
        int n = msc.nextInt();
        int m = msc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(metod(i, a[i], m));
            }else{
                System.out.println(metod2(i, a[i], m));
            }
        }
        Help.k=0;
    }
}
