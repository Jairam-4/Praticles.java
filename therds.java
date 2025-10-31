class NumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        NumberPrinter t1 = new NumberPrinter();
        t1.start();
    }
}
