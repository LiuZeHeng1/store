package com.itcast.Array1;

import org.junit.Test;

import java.util.Arrays;

/**
 * 数组封装类
 */
public class MyArray {
    //数组本身
    private long[] arr;
    //有效数据长度
    private int elements;


    public MyArray() {
        arr = new long[10];
    }

    public MyArray(int maxsize) {
        arr = new long[maxsize];
    }


    /**
     * 添加数据
     */
    public void insert(long value){
        arr[elements] = value;
        elements++;
    }

    /**
     * 有序添加  思路
     *              在arr 数组 中 查找是否有比添加 的元素大的值在
     *                 有则 让出大的元素的位置  给当前添加进来小的元素 , 数组中大的元素先后移一位
     */

    public void insertOrderly(long value){
        int i;
        for ( i = 0; i < elements; i++){
            if (arr[i] > value){
                break;
            }
        }

        // 循环往后移
        for (int j = elements; j > i ; j--) {
            arr[j] = arr[j - 1];
        }

        //给让出的位置进行赋添加进来的值
        arr[i] = value;
        elements++;
    }

    /**
     * 显示数据
     */
    public void display(){
        System.out.print("[");
        for (int i = 0; i < elements; i++) {
            if(i == elements-1){
                System.out.print(" "+arr[i]+" ");
            }else{
                System.out.print(" " + arr[i] + ",");
            }
        }
        System.out.println("]");
    }

    /**
     * 根据值查找数据下标
     */
    public int search(long value){
        int i;
        for (i = 0; i < elements ; i++) {
            if(arr[i] == value){
                break;
            }
        }
        if(i == elements ){
            return -1;
        }else {
            return i;
        }
    }

    /**
     * 根据下标查找值
     */
    public long getIndex(int value){
        if (value >= elements || value < 0){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            return arr[value];
        }
    }

    /**
     * 删除数据
     */
    public void delete(int index){
        if ( index >= elements || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            for (int i = index; i < elements; i++) {
                 arr[index] = arr[index+1];
            }
            elements--;
        }
    }

    /**
     * 根据元素进行删除元素
     *      删除位置的后面的元素赋给当前元素,都向前走一步
     * @param value
     * @return
     */
    public boolean deleteElement(long value){
        boolean flag = false;
        for (int i = 0; i < elements; i++) {
            if (arr[i] == value){
                for (int j = i; j < elements ; j++) {
                    arr[j] = arr[j+1];
                }
                elements--;
                flag = true;
            }
        }
        return flag;
    }

    /**
     *  修改指定元素下标的值
     * @param value
     * @param newValue
     * @return
     */
    public boolean update(int value,long newValue){
        boolean flag = false;
        if (value >= elements || value < 0 ){
            flag = false;
            throw new IndexOutOfBoundsException();
        }else{
            arr[value] = newValue;
            flag = true;
        }
        return  flag;
    }


    /**
     * 在指定位置插入
     *      循环查找该下标  在该下标的后面所有元素向后移
     */
    public void byInsert(int index,long value){
        if(index >= elements || index < 0){
            throw new IndexOutOfBoundsException();
        }else{
           int i;
            for ( i = 0; i < elements; i++) {
                if( i == index){
                    break;
                }
            }

            for (int j = elements; j > i; j--) {
                arr[j] = arr[j - 1];
            }

            arr[i] = value;
            elements++;
        }
    }

    public void sort(){
        Arrays.sort(arr);
    }




}
