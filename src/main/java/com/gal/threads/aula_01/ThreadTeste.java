package com.gal.threads.aula_01;

/**
 * JVM que decide qual thread começa e qual termina
 * Temos 2 tipos de threads:
 *  Daemon >
 *  User   > o programa só  irá encerrar a execução quando todas as threads users finalizarem ou chamando o exit()
 */
class ThreadExemplo implements Runnable{
    private char c;

    public ThreadExemplo(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i%100 == 0)
                System.out.println();
        }
    }
}

public class ThreadTeste{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(new ThreadExemplo('A'));
        Thread t2 = new Thread(new ThreadExemplo('C'));
        Thread t3 = new Thread(new ThreadExemplo('B'));
        Thread t4 = new Thread(new ThreadExemplo('D'));
        t1.start();
        t2.start();
        t3.start();
        t4.start();



    }
}
