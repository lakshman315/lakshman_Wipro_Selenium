package day7;

public class AlternatePrint {
    final Object lock = new Object();
    boolean letterTurn = true;

    public static void main(String[] args)
    {
        new AlternatePrint().runThreads();
    }

    void runThreads() {
        Thread t1 = new Thread(() -> {
            for (char c = 'A'; c <= 'Z'; c++) {
                synchronized (lock) {
                    while (!letterTurn) {
                        try { lock.wait(); } catch (InterruptedException e) {}
                    }
                    System.out.println(c);
                    letterTurn = false;
                    lock.notify();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                synchronized (lock) {
                    while (letterTurn) {
                        try { lock.wait(); } catch (InterruptedException e) {}
                    }
                    System.out.println(i);
                    letterTurn = true;
                    lock.notify();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
