package com.itcast.ch03;

import org.junit.Test;
import org.junit.runner.notification.RunListener;

import java.util.HashSet;

public class MyQueueTest {
    /**
     * 队列
     *      特点: 是先进先出.. 还可以联合链表做实践
     */
    @Test
    public void test(){
        MyQueue myQueue = new MyQueue(2);
        myQueue.insert(11);
        myQueue.insert(22);


        while(!myQueue.isEmpty()){
            System.out.println("移除的元素"+myQueue.remove());
        }
        System.out.println(myQueue.isEmpty());
        myQueue.insert(66);
        myQueue.insert(77);

        System.out.println("第一个:"+myQueue.remove());
        System.out.println("第二个:"+myQueue.remove());

    }



}
