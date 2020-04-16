package every;

import java.util.Scanner;

public class Aaa {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=ji(a,i);
        }
        System.out.println("sum="+sum);

    }
    public static int  ji(int a,int len){
        System.out.println("----------len="+len);
        int s=0;
        for(int j=1;j<=len;j++){
            s+=a*Math.pow(10,(j-1));
            System.out.println("j="+j);
            System.out.println("s="+s);
        }

        return s;
    }
}
