//现在又一对兔子，3个月生一次，请问n个月后有几只兔子
//1   1   2   3   5   8   13....
import java.util.Scanner;

public class Tz {
    public static void main(String args[]){
        System.out.println("请输入月份：");
        Scanner sc=new Scanner(System.in);
        int mon=sc.nextInt();
        int sum= JsTz(mon);
        System.out.println("第"+mon+"个月的兔子总数为："+sum);

    }
    public  static int JsTz(int m){
        if( m==1 || m==2 ){
            return 1;
        }

        return JsTz(m-1)+ JsTz(m-2);
    }
}
