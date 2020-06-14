package com.itcast.Array;

import com.itcast.entity.Student;
import org.junit.Test;

public class MyArray {


    /**
     * 测试比较Comparable接口的方法
     */
    @Test
    public void test(){
        Student stu = new Student("张三",18);
        Student  stu2 = new Student("李四",20);
        System.out.println(MyArray.max(stu,stu2));
    }


    public static Comparable max(Comparable c1,Comparable c2){
        int result = c1.compareTo(c2);
        if(result >= 0){
            return c1;
        }else {
            return c2;
        }
    }





}
