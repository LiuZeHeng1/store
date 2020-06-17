package com.itcast.ch03;

/**
 *  队列结构模拟
 */
public class MyQueue {
   //底层使用数组
   private  long[] arr;
   //有效数据
    private int elements;
    //队头
    private int strat;
    //队尾
    private int end;

    /**
     * 默认构造
     */

    public MyQueue() {
        arr = new long[10];
        elements = 0;
        strat = 0;
        end = -1;
    }
    //带参构造
    public MyQueue(int maxsize) {
        arr = new long[maxsize];
        elements = 0;
        strat = 0;
        end = -1;
    }

    /**
     * 添加数据  从队尾加入
     */
    public void insert(long value){
        if (end == arr.length-1){
            end = -1;
        }
        arr[++end] = value;
        elements++;
    }

    /**
     * 删除数据  从队头删除
     */
    public long remove(){
        long value = arr[strat++];
        if (strat == arr.length){
            strat = 0;
        }
        elements--;
        return value;
    }


    /**
     * 查看数据 从队头查看
     */
    public long peek(){
        return arr[strat];
    }

    /**
     * 判断是否为空
     */
    public boolean  isEmpty(){
        return elements == 0;
    }

    /**
     * 判断是否满了
     */
    public boolean isFull(){
        return elements == arr.length;
    }



}
