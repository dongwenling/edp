package leetcode;

public class Crt {
    public static void cr(String str,int len){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<len;i++){
            if(str.charAt(i)!=' '){
                sb.append(str.charAt(i));
            }else {
                sb.append("%20");
            }
        }
        System.out.println(sb.toString());
    }
    public static void  main(String args[]){
        String str="sad sdadad dad";
        int len=str.length();
        cr(str,len);

    }
}
