import java.util.*;

//输入：wer
//      qwerty
//输出:erw
public class Bh{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        sol(str1,str2);
    }
    public static void sol(String str1,String str2){
        if(str1==null||str2==null){
            return;
        }
        List<Character> list=new ArrayList<>();
        for(char c:str1.toCharArray()){
            if(str2.contains(String.valueOf(c))&&!list.contains(c)){
                list.add(c);
            }
        }
        Collections.sort(list);
        for(Character cc:list){
            System.out.print(cc);
        }
    }

}


