package org.example;

public class ClasseThread implements Runnable{

    private String name;
    private int nb;

    public ClasseThread(String name) {
        this.name = name;
    }

    /*@Override
    public synchronized void run() {
        for (int i = 0; i < 100000; i++){
            nb++;
            System.out.println(name+ " " + nb);
        }
    }*/

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++){
            synchronized (this) {
                nb++;
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(name+ " " + nb);
        }
    }
}
