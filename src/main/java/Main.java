import Tasks.OddEven;
import Tasks.Operators;
import org.junit.Assert;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println(((Object)b).getClass().getName());
        String str = String.valueOf(b);
        System.out.println(str.getClass());

        Operators.fiveNumbers();

        int num = 33;

        System.out.println((byte) num & 1);

    }

}
