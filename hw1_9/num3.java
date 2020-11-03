package hw1_9;

import java.util.Scanner;

public class num3 {
    static int sum(int a) {
        int l=a/100;
        int r=a%10;
        int c=a/10%10;
        return l+r+c;
    }
    public static void main(String args[]){
        Scanner myscanner = new Scanner(System.in);
        int s=0;
        int k=myscanner.nextInt();
        for(int i=100;i<k;i++){
            if(sum(i)%13==0){
                s++;
            }
        }
        System.out.print(s);
    }
}
