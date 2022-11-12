package Tasks;

import java.util.Scanner;

public class Operators {
    public static void fiveNumbers() {
        char ch = 'h';
        for (int i = 0; i < 5; i++) {
            System.out.print(ch);
            ch++;
        }
    }
    public static void tenLines() {
        int i = 1;
        do {
            System.out.println(String.format("Task%d", i));
            i++;
        }
        while (i <= 10);
    }
    public static void printNumbers() {
        int i = 0;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
        while (i <= 100);
    }

    public static void printTenLines() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(String.format("Task%d", i));

        }
    }

    public static void numberFrom0to10() {
        int num = isInteger();
        if (num > 0 && num < 10) {
            System.out.println("Positive number less than 10 or zero");
        } else {
            System.out.println("Positive number greater than 10 or negative");
        }
    }

    public static void evenOdd() {
        int num = isInteger();
        if (num % 2 != 0) {
            System.out.println("You entered " + num);
        }
    }

    public static int isInteger() {
        boolean condition = true;
        Scanner scanner = null;
        while (condition) {
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                condition = false;
            }
        }
        return scanner.nextInt();
        //int x = scanner.nextInt();
        //int x = Integer.parseInt(scanner.nextLine());
    }
}
