package leetcode;

import java.util.Scanner;

public class Ys {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] arr=s.toCharArray();
        String str=ys(arr);
        if(str.length()<s.length()){
            System.out.println(str);
        }else {
            System.out.println(s);
        }

    }
    public  static String ys(char[] arr){
        int count=1;
        String s="";
        for(int i=0;i<arr.length-1;){
            while (i<arr.length-1&&arr[i]==arr[i+1]){
                count+=1;
                i++;
            }
            //System.out.print(arr[i]+""+count);
            s+=arr[i]+""+count;
            count=1;i++;
            if(i==arr.length-1&&arr[i]!=arr[i-1]){
                //System.out.print(arr[i]+""+count);
                s+=arr[i]+""+count;
            }
        }
        return s;
    }
}
