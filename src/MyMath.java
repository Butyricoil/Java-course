public class MyMath {

    public static final float PI = 3.141592653589793f;

    public static int Sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
