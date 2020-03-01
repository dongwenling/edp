//输入一行字符，然后算一下数字几个，字母几个，空格几个，其他字符几个
import java.util.Scanner;

public class Js {
    public static void main(String args[]){
        int number=0;
        int letter=0;
        int konge=0;
        int other=0;
        System.out.println("请输入一串字符：");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] c=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(c[i])){
                number++;
            }else if(Character.isLetter(c[i])){
                letter++;
            }else if(Character.isSpaceChar(c[i])){
                konge++;
            }else {
                other++;
            }


        }
        System.out.println("数字："+number);
        System.out.println("字母："+letter);
        System.out.println("空格："+konge);
        System.out.println("其他："+other);

    }
}
