package com.qlm.base.config;

import com.qlm.base.thread.MyRunnableThread;
import com.qlm.base.thread.MyThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
* @Description:    StartRunner启动服务加载类
* @Author:         qiaoliming
* @CreateDate:     2020/4/22 10:59
*/
@Component
public class StartRunner implements ApplicationRunner {
    @Autowired
    private MyRunnableThread myRunnableThread;
    @Autowired
    private MyThread myThread;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("启动服务可以在此加载配置文件----");
        //启动线程使用start合适启动有线程调度决定，调用run()只是调用了实例内的一个类
        new Thread(myRunnableThread).start();
        myThread.start();


    }
}
