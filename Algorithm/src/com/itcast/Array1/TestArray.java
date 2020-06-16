package com.itcast.Array1;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestArray {

    @Test
    public void test(){
        MyArray myArray = new MyArray();
        myArray.insert(22);
        myArray.insert(23);
        myArray.insert(25);
        myArray.insert(27);

        //查询该数组中的所有有效数据
        myArray.display();

        //根据值查找下标
        //System.out.println(myArray.search(23));
        //根据下标查找值
        System.out.println("下标查找值:"+myArray.getIndex(0));


        //根据下标删除
        //myArray.delete(0);
       // myArray.display();

        //根据元素删除
        boolean flag = myArray.deleteElement(27);
        System.out.println("返回值:"+flag);

        myArray.display();


        //修改数据
        boolean flag2 = myArray.update(0,99);
        myArray.display();
        System.out.println("修改:"+flag2);

        //插入

       // Arrays.sort();
    }

    @Test
    public void test2(){
        MyArray  array = new MyArray();

        //添加数据 有序添加
        array.insertOrderly(10);
        array.insertOrderly(2);
        array.insertOrderly(5);

        array.display();

        //指定位置插入
        array.byInsert(2,80);
        array.display();

        //升序
        array.sort();
        array.display();

     //   long log = {11l,22,33};
    }
}
