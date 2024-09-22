package MultiThreatning;

import java.util.Random;

public class Main2 {

    static boolean flag = true;

    public static void main(String[] args) {

        Random rand = new Random();
        int range = 1_000_000_000;
        int number = rand.nextInt(range);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    int guess = rand.nextInt(range);
                    if (guess == number) {
                        System.out.println("Угадал");
                        flag = false;
                        break;
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++) {
                    if (flag) {
                        System.out.println(i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        });


        thread.start();
        thread2.start();
    }
}
