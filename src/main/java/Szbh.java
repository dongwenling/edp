import java.util.*;

//输入：2,3,3,4,4,4,5,6
//输出：4,3,2,6,5
public class Szbh{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String[] ss=str1.split(",");
        Map<String,Integer> mm=new HashMap<String,Integer>();
        for(int i=0;i<ss.length;i++){
            if(!mm.containsKey(ss[i])){
            mm.put(ss[i],1);
            }else {
                mm.put(ss[i], mm.get(ss[i]) + 1);
            }
        }
        System.out.println("Map:"+mm);
        sol(mm);
    }
    public static void sol(Map<String,Integer> map){
        List<Map.Entry<String,Integer>> list=new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        String s="";
        for(Map.Entry<String,Integer> i:list){
            s+=i.getKey()+",";
        }
        System.out.println(s.substring(0,s.length()-1));

    }

}


