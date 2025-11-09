package com.itheima.a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        // ----------------------- Runtime类 --------------------------
        /*
            注意 : Runtime不可以实例化对象, 只能通过静态方法( getRuntime )获取对象
            public static Runtime getRuntime()   获取当前系统的运行时环境对象
            public void exit(int status)   结束当前进程 , 停止虚拟机
            public int availableProcessors()    获取当前系统的CPU核数 , 线程数
            public long maxMemory()   获取当前JVM能从系统的最大内存( 单位 : byte )
            public long totalMemory()   获取当前JVM已经从系统中获取使用的总内存( 单位 : byte )
            public long freeMemory()   获取当前JVM剩余的内存( 单位 : byte )
            public Process exec(String command)  -- throws IOException   运行cmd命令
        */

        // 1. 获取当前系统的运行时环境对象 Runtime
        //Runtime r = Runtime.getRuntime();

        //2. exit(int status)   停止虚拟机
        //Runtime.getRuntime().exit(0);

        //3. availableProcessors()    获取当前系统的CPU核数 , 线程数
        System.out.println("当前电脑为" + Runtime.getRuntime().availableProcessors() + "核CPU");

        //4. maxMemory()   获取当前JVM能从系统最大内存( 单位 : byte )
        System.out.println("当前JVM能从系统最大内存为" + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "兆G");

        //5. totalMemory()   获取当前JVM已经从系统中获取使用的总内存( 单位 : byte )
        System.out.println("当前JVM已经从系统中获取使用的总内存为" + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "兆G");

        //6. freeMemory()   获取当前JVM剩余的内存( 单位 : byte )
        System.out.println("当前JVM剩余的" + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "兆G");

        //7. exec(String command)  -- throws IOException   运行cmd命令
        //Process 是一个抽象类 -- 用来封装操作系统的进程
        //Process process = Runtime.getRuntime().exec("notepad");
        //shutdown : 关机命令    ---  得加上参数才能执行  ( -s : 默认在一分钟后关机  /   -s -t 指定时间  : 指定多久时间后关机)
        //-a : 取消关机操作命令   /   -r : 关机并重启

        //shutdown -s -t 3600 : 表示一小时后关机
        Process process = Runtime.getRuntime().exec("shutdown -a");
    }
}
