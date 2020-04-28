package leetcode;

public class Oea {
    public static boolean Oea(String str1,String str2){
        if(str1==null||str2==null)return false;
        int len1=str1.length();
        int len2=str2.length();
        if(str1.length()<str2.length()) return Oea(str2,str1);

        for(int i=0;i<len2;i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return str1.substring(i+1).equals(str2.substring(len1==len2?i+1:i));
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(Oea("pale","pal"));
    }
}
