public class IncrementDecrimenet {
    public static void main(String[] args){
        int a = 1;
        int b = a++; // first b = a, second a + a
//        int b = ++a; // first a + a, second b = a
        int c = ++a; // a already = 2, first a + a, second c = a
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        boolean b1 = true, b2 = true;
        System.out.println(b1 &= b2); // b1 = b1 & b2
        System.out.println(b1 != b2); // b1 = b1 ! b2
        System.out.println(b1 ^= b2); // b1 = b1 ^ b2

        int x, y;
        x = -10;
        System.out.println(y = x < 0 ? -x : x);
        System.out.println(x + " equals " + y);


    }
}
