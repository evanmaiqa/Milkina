import java.io.IOException;
import java.util.Scanner;

public class ScannerTwo {
    public static void returnCodeOfSymbol() throws IOException {
        int num = System.in.read();
        System.out.println(String.format("Code of symbol %s is %d", (char) num, num));
    }
    public static void returnInteger() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter an integer:");
        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            System.out.println("You entered " + x);
        } else {
            System.out.println("You entered not an integer!");
        }
    }
    public static void returnString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter string:");
        String str2 = scanner.nextLine();
        System.out.println(str1 + " " + str2);
    }
}
