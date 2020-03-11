package leetcode;

import java.util.Scanner;

public class Cr {
    public static String cr(String str,int len){
        return str.substring(0,len).replaceAll(" ","%20");
    }
    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        String s=sc.next();
        String s="sda dsadsad dasda";
        int len=s.length();
        System.out.println(s);
        System.out.println(len);
        System.out.println(cr(s,len));

    }
}
