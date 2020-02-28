public class Px {
    public static void main(String args[]){
        int[] arr=new int[]{12,45,11,23,90,34};
        sort(arr);

    }
    public static void sort(int[] arr){
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
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
}
