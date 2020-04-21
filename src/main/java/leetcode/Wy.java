package leetcode;

import java.util.Scanner;

public class Wy {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){

                    System.out.println("有重复的");
                    System.exit(0);
                }
            }
        }
        System.out.println("没有重复的");


    }
}
