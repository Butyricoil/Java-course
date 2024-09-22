package Work;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String dish = "\"Фунчоза\"";

        Client client = new Client();
        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String dishName) {
                System.out.println("Важе юлюдо: " + dishName);
            }
        }, dish);
    }
}