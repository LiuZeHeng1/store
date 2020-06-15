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
        arr = new long[5];
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
        if(i == elements){
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
     * 根据元素删除
     */
    public boolean delete(long value){
        boolean flag = false;
        for (int i = 0; i < elements; i++) {
            if (arr[i] == value){
                for (int j = i; j < elements ; j++) {
                    arr[j] = arr[j+1];
                }
                flag = true;
            }
        }
        return flag;
    }


    /**
     * 修改数据
     */






}
