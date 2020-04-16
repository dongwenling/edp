package every;

public class Maopao {
    public static void main(String args[]){
        int[] arr=new int[]{13,56,89,23,67};
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for(int m=0;m<len;m++){
            System.out.println(arr[m]);
        }
    }
}
