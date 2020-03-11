//给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
//示例 1：
//
//        输入: s1 = "abc", s2 = "bca"
//        输出: true
//        示例 2：
//
//        输入: s1 = "abc", s2 = "bad"
//        输出: false
package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Cp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(s1.length()==s2.length()){
            //Arrays.sort()可以对数组进行排序
            //str.toCharArray()可以把字符串变成数组
            char[] c1=s1.toCharArray();
            char[] c2=s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            for(int i=0;i<c1.length;i++){
                if(c1[i]!=c2[i]){
                    System.out.println("不能");
                    return ;
                }
            }
            System.out.println("可以");
            return;
        }else {
            System.out.println("不能");
            return ;
        }
    }
}
