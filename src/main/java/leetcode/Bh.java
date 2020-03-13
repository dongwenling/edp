package leetcode;

public class Bh {
    public static void main(String args[]){
        String str1="qwerr";
        String str2="wertq";
        System.out.println(bh(str1,str2));
    }
    public static boolean bh(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        if(s1==s2) return true;
            s1+=s1;
            return s1.contains(s2);

    }
}
