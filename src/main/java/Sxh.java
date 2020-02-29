//水鲜花 1+27+125=153
public class Sxh {
    public static void main(String args[]){
        System.out.println("请找到100到999之间的水仙花");
        for(int i=100;i<1000;i++){
            int a=i%10;
            int b=i/10%10;
            int c=i/100;
            if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==i){
                System.out.println("这是个水仙花数字："+i);
            }
        }
    }
}
