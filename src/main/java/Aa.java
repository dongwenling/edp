//2+22+222+2222+......
import java.util.Scanner;

public class Aa {
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的值");
        int num=sc.nextInt();
        System.out.println("请输入您的次数");
        int count=sc.nextInt();
        int sum=0;
        for(int i=1;i<=count;i++){
             sum+=aa(i,num);
        }
        System.out.println("sum:"+sum);


    }

    private static int aa(int i,int num) {
        int tmp=num;
        for(int j=2;j<=i;j++){
            tmp+=num*Math.pow(10,j-1);
        }
        System.out.print (tmp+" ");
        return tmp;
    }
}
