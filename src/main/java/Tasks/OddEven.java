package Tasks;

public class OddEven {
    public static void oddEven(int num) {
        if (((byte)num & 1) == 1) {
            System.out.println(String.format("Number %d is odd", num));
        } else {
            System.out.println(String.format("Number %d is even", num));
        }
    }
}
