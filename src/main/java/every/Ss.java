package every;

public class Ss {
    public static void main(String args[]){

        for(int i=100;i<200;i++){
            boolean b=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    b=false;
                }
            }
            if(b==true){
                System.out.println("这是素数："+i);
            }
        }

    }
}
