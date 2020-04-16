package every;

import java.util.Scanner;

// 1 1 2 3 5 8 13...
public class Tz {
    public static void main(String args[]){
        System.out.println("输入月份：");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("兔子总数："+tz(num));

    }
    public static int tz(int num){
        if(num==1||num==2){
            return 1;
        }

        return tz(num-1)+tz(num-2);
    }
}
