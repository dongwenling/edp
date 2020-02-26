//100-200以内的素数
public class Ss {
    public static void main(String args[]){
        boolean bool=true;
        int count=0;
        for(int i=100;i<=200;i++){
            bool=true;
           for(int j=2;j<i;j++){
               if(i%j==0){
                   bool=false;
               }
           }
           if(bool==true){
               System.out.println("这是素数："+i);
               count++;
           }

        }
        System.out.println("count："+count);
    }
}
