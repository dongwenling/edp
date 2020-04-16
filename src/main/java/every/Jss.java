package every;

import java.util.Scanner;

public class Jss {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int abc=0;
        int num=0;
        int es=0;
        int other=0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(Character.isDigit(c[i])){
                num++;
            }else if(Character.isLetter(c[i])){
                abc++;
            }else if(Character.isSpaceChar(c[i])){
                es++;
            }else{
                other++;
            }
        }
        System.out.println("字母："+abc+"数字："+num+"特殊："+es+"other:"+other);
    }
}
