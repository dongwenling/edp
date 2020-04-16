package every;

import java.util.Scanner;

public class Eff {
    public static void main(String args[]){
        int[] arr=new int[]{10,23,45,67,89};
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ef(arr,num);

    }
    public static void ef(int[] arr,int num){
        int len=arr.length-1;
        int min=0;
        int max=len;

        while (min<=max){
            int mid=(min+max)/2;
            if(arr[mid]>num){
                max=mid-1;
            }else if(arr[mid]<num){
                min=mid+1;
            }else {
                System.out.println("key:"+mid);
                System.exit(0);
            }

        }
        System.out.println("没有这个值");
    }
}
