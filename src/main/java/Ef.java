//二分法
import java.util.Scanner;

public class Ef {
    public static void main(String args[]){
        int[] arr=new int[]{19,23,78,90};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        System.out.println("请输入您的key值：");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int min=0;
        int max=arr.length-1;
        while(max>=min) {
            int mid=(min+max)/2;
            if (arr[mid] > key) {
                max =mid-1;
            }else if (arr[mid]<key){
                min=mid+1;
            }else {
                System.out.println("有key:"+arr[mid]+"下标为："+mid);
                System.exit(0);
            }
        }
        System.out.println("没有");




    }
}
