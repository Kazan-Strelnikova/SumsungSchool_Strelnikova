package kkk;


import java.util.Scanner;

class Num{
    int n;
    void input() {
        Scanner msc = new Scanner(System.in);
        n=msc.nextInt();
    }
    String bin(){
        return Integer.toBinaryString(n);
    }
    String oct(){
        return Integer.toOctalString(n);
    }
    String nex(){
        return Integer.toHexString(n);
    }
    String bytee(){
        if(n>=-128 && n<=127){
            return "YES";
        }else{
            return "NO";
        }
    }String shortt(){
        if(n>=-32768 && n<=32767){
            return "YES";
        }else{
            return "NO";
        }
    }
}

public class kkk {
    public static void main(String [] args) {
        Num num = new Num();
        num.input();
        System.out.println(num.bin());
        System.out.println(num.oct());
        System.out.println(num.nex());
        System.out.println(num.bytee());
        System.out.println(num.shortt());
    }
}
