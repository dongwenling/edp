package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Cpp {
    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        canP(s);

    }
    public static boolean canP(String str) {
        if (str == null || str.length() < 1) {
            return false;
        }
        char[] chars = str.toCharArray();
        HashSet<Character> characters = new HashSet<Character>();
        for (Character character : chars) {
            if(characters.contains(character)){
            characters.remove(character);
        }else {
            characters.add(character);
        }
        }
        return characters.size()<=1;

    }
}
