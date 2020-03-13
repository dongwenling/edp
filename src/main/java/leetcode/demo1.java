package leetcode;

import java.util.HashSet;
import java.util.Iterator;

public class demo1 {
    public static void main(String[] args) {
        HashSet<String> courseSet = new HashSet<String>(); // 创建一个空的 Set 集合
        String course1 = new String("Java入门教程");
        String course2 = new String("Python基础教程");
        String course3 = new String("C语言学习教程");
        String course4 = new String("Golang入门教程");
        courseSet.add(course1); // 将 course1 存储到 Set 集合中
        courseSet.add(course2); // 将 course2 存储到 Set 集合中
        courseSet.add(course3); // 将 course3 存储到 Set 集合中
        courseSet.add(course4); // 将 course4 存储到 Set 集合中
        System.out.println("C语言中文网教程有：");
        Iterator<String> it = courseSet.iterator();

        while (it.hasNext()) {
            System.out.println("《" +  it.next() + "》"); // 输出 Set 集合中的元素
        }
        System.out.println("有" + courseSet.size() + "套精彩教程！");
    }
}
