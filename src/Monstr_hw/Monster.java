package Monstr_hw;

// перегрузка метод и конструктора
public class Monster {
    private int eyes;
    private int arms;
    private int legs;


    public Monster(int eyes, int arms, int legs) {
        this.eyes = eyes;
        this.arms = arms;
        this.legs = legs;
    }

    public Monster(int amount) {
        this(amount, amount, amount);
        ;
    }

    public Monster() {
        this(2, 2, 2);
    }


    public void voice(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println("Grrrrhhhhhhrrrrr...");
        }
    }

    public void voice() {
        this.voice(1);
    }

    public void voice(int amount, String word) {
        for (int i = 0; i < amount; i++) {
            System.out.println(word);
        }
    }

}
