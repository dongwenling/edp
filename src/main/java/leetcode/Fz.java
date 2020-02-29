//1234   变成4321实现反转
package leetcode;

import java.util.Scanner;

public class Fz {
    public static void main(String args[]){
    System.out.println("请输入一串数字，并且对其进行翻转");
    Scanner sc=new Scanner(System.in);
    int str=sc.nextInt();
    String a="";
    while(str!=0) {
        a = a + str % 10;
        str = str / 10;
    }
    System.out.println(a);


    }

}


