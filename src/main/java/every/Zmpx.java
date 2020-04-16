package every;

import java.util.Arrays;
import java.util.Scanner;

public class Zmpx {
    public  static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String  sc=s.next();
        char[] c=sc.toCharArray();
        Arrays.sort(c);
        for(int i:c){
            System.out.println((char) i);
        }
    }
}
