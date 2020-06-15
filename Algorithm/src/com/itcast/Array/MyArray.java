package com.itcast.Array;

import com.itcast.entity.Student;
import org.junit.Test;

public class MyArray {


    /**
     * 测试比较Comparable接口的方法
     */
    @Test
    public void test() {
        Student stu = new Student("张三", 18);
        Student stu2 = new Student("李四", 20);
        System.out.println(MyArray.max(stu, stu2));
    }

    public static Comparable max(Comparable c1, Comparable c2) {
        int result = c1.compareTo(c2);
        if (result >= 0) {
            return c1;
        } else {
            return c2;
        }
    }


    @Test
    public void test2() {
        /**
         * 冒泡排序
         * 原理:
         *      外层循环比较次数为: 数组长度-1次
         *      两两比较大的往后放,每一次比较后,下一次比较时就会减少一个元素的比较 (最后一个最大的元素)
         *
         *      内层循环控制一轮比较的次数  循环9次 计算内层10个元素一共要比较多少轮   为45轮
         */
        int[] arry = {80, 25, 99, 32, 15};
        for (int i = 0; i < arry.length - 1; i++) {   //循环轮数  公式  数组长度-1  注意是0<4  循环4次 0~3
            for (int y = 0; y < arry.length - 1 - i; y++) { //arry[y+1] 导致越界 arry.length-1 ,,-i 是  每轮比较次数会减少一个元素
                if (arry[y] > arry[y + 1]) {
                    int temp = arry[y];
                    arry[y] = arry[y + 1];
                    arry[y + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + "\t");
        }
    }






}
