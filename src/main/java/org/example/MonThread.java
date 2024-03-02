package org.example;

import java.sql.SQLOutput;

public class MonThread extends Thread{

    public MonThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 10000; i++){
            System.out.println(getName()+ " " + i);
        }
    }
}
