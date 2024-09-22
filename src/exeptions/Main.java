package exeptions;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int a = rand.nextInt(0, 2);
            int b = rand.nextInt(0, 2);
            System.out.println(a + " ");
            System.out.print(b + " ");
        }
        int a = rand.nextInt();
        int b = rand.nextInt();
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic exception");
        } catch (Exception e) {
            System.out.println("Error: Unknown exception");
        } finally {
        }
    }
}