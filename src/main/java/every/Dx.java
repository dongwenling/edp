package every;

import java.util.Scanner;

public class Dx {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] c=s.toCharArray();
        int len=c.length;
        String ss="";
        for(int i=len-1;i>=0;i--){
            ss+=c[i];
        }
        System.out.println(ss);
    }
}
