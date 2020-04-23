package com.qlm.base.thread;

import org.springframework.stereotype.Component;

/**
* @Description:    通过实现Runnable创建线程
* @Author:         qiaoliming
* @CreateDate:     2020/4/23 10:32
*/
@Component
public class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        while(true){
//            System.out.println("线程Runnable----");
        }
    }
}
