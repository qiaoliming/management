package com.qlm.base.thread;

import org.springframework.stereotype.Component;

/**
* @Description:    通过继承Thread来创建类
* @Author:         qiaoliming
* @CreateDate:     2020/4/23 10:34
*/
//https://my.oschina.net/u/3908739/blog/2245858
@Component
public class MyThread extends Thread {
    public void run(){
        System.out.println("extend Thread");
        testThread();
    }
    private void testThread(){
//        while (true) {
            System.out.println("这是个测试方法---");
//        }
    }
}
