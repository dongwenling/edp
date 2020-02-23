//冒泡排序
import java.util.Scanner;
public class Mp {
    public static void main(String args[]){
        int[] arr=new int[4];
        System.out.println("请输入几位数，并对其进行冒泡排序！");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            int s = sc.nextInt();
            arr[i]=s;
        }
        for(int n=0;n<3;n++){
            for(int m=0;m<arr.length-1-n;m++){
                if(arr[m]>arr[m+1]){
                    int tmp=arr[m];
                    arr[m]=arr[m+1];
                    arr[m+1]=tmp;
                }

            }
        }
        for(int k=0;k<4;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
