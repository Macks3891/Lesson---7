public class Main {
    public static void main(String[] args) {
        byte aByte = 127;
        short aShort = 32767;
        int anInt = 2147483647;
        long aLong = 9223372036854775807L;
        float aFloat = 3.4e+38f;
        double aDouble = 1.7e+308;
        char aChar = 'A';
        boolean aBoolean = true;

        int a = 10;
        int b = 5;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
        System.out.println("Остаток: " + remainder);

    }
}