//实现一个算法，确定一个字符串 s 的所有字符是否全都不同。示例 1：
//
//输入: s = "leetcode"
//输出: false
//示例 2：
//
//输入: s = "abc"
//输出: true

package leetcode;

import java.util.Scanner;

public class Pdwy {
    public static void main(String args[]){
        System.out.println("输入一段字符，判断是否有重合");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        int i=0;
        char[] arr=new char[]{};
        arr=str.toCharArray();
        System.out.println(arr);
        while (i < len){
            for(int j=i+1;j<len;j++){
                if(arr[i]==arr[j]){
                    System.out.println("false:有重合");
                    System.exit(0);
                }
            }
            i++;
        }
        System.out.println("true没有重合");

    }
}
