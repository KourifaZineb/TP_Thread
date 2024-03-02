package org.example;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        ClasseThread c1 = new ClasseThread("T1");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);

        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(t2.getState());//Blocked
    }
}
