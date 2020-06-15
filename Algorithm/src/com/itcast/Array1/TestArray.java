package com.itcast.Array1;

import org.junit.Test;

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
        myArray.delete(0);
        myArray.display();

        //根据



    }
}
