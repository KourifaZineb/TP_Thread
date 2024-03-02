package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MonThread t1 = new MonThread("T1");
        MonThread t2 = new MonThread("T2");
        System.out.println(t1.getState());//New
        t1.start();
       // t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getState());//Runnable
        t1.join();
        System.out.println(t1.getState());//Terminated
        //t2.start();
       // t2.setPriority(Thread.MIN_PRIORITY);
        //System.out.println("Fin");
    }
}