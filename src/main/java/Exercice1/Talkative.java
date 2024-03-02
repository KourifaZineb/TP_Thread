package Exercice1;

public class Talkative implements Runnable{

    private int id;

    public Talkative(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("Thread : " + id + " increm : " + i);
        }
    }
}
