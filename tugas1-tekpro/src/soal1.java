import java.util.Scanner;

class soal1 {
    public static void main(String[] args) {
        long fit = 0;
        try {
            Scanner input = new Scanner(System.in);
            fit = input.nextLong();
            System.out.println(fit + " can be fitted in: ");

            if (fit >= Byte.MIN_VALUE && fit <= Byte.MAX_VALUE) {
                System.out.println("* Byte");
                System.out.println("* Short");
                System.out.println("* Integer");
                System.out.println("* Long");
            } else if (fit >= Short.MIN_VALUE && fit <= Short.MAX_VALUE) {
                System.out.println("* Short");
                System.out.println("* Integer");
                System.out.println("* Long");
            } else if (fit >= Integer.MIN_VALUE && fit <= Integer.MAX_VALUE) {
                System.out.println("* Integer");
                System.out.println("* Long");
            } else if (fit >= Long.MIN_VALUE && fit <= Long.MAX_VALUE) {
                System.out.println("* Long");
            }
        } catch (Exception e) {
            System.out.println(fit + " can't be fitted anywhere.");
        }
    }
}