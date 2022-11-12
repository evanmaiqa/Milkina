package Tasks;

public class Garland {
    public static String addZero(String str) {
        int length = str.length();
        StringBuilder strb = new StringBuilder(str);
        for (int i = 0; i < 32 - length; i++) {
            strb = strb.insert(0, "0");
        }
        return strb.toString();
    }
    public static String insertSpace(String str) {
        return new StringBuilder(str).insert(8, " ").insert(17, " ").insert(26, " ").toString();
    }
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//
//        System.out.println(insertSpace(addZero(Integer.toBinaryString(a))) + " (" + a + ")");
//        System.out.println(insertSpace(addZero(Integer.toBinaryString(b))) + " (" + b + ")");


        for (int i = 0; i <= 16; i++) {
            System.out.println(insertSpace(addZero(Integer.toBinaryString(i))) + " (" + i + ")");
        }

    }

}
