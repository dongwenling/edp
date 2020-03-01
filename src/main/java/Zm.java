//输入一行字母进行排序
import java.util.Scanner;

public class Zm {
    public static void main(String args[]){
        System.out.println("请输入一串字母");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s="";
        char[] c=str.toCharArray();
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            s+=c[i];
        }
        System.out.println(s);

    }
}
