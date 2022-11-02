public class IntegerToBinary {
    /**
     * https://www.youtube.com/watch?v=fA7Mnn7uIJE&list=PLN_SYR3PfTtkj8BQXwYR74m4BL5UxSBF0&index=39
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = ~ b;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("a | b = " + Integer.toBinaryString(c));
        System.out.println("a & b = " + Integer.toBinaryString(d));
        System.out.println("a ^ b = " + Integer.toBinaryString(e));
        System.out.println("~ b = " + Integer.toBinaryString(f));
/*      byte + double -> double
        byte + float -> float
        byte + long -> long
        else:
        int = byte + byte
 */
    }
}
