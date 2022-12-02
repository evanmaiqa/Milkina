import Tasks.OddEven;
import Tasks.Operators;

public class Main {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println(((Object)b).getClass().getName());
        String str = String.valueOf(b);
        System.out.println(str.getClass());

        Operators.fiveNumbers();

        int num = 33;
        System.out.println("\n 1 is odd \n");
        System.out.println((byte) num & 1);

    }

}
