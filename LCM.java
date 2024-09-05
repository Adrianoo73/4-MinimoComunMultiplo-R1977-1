import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("INGRESE EL PRIMERO NUMERO: ");
        int a = scanner.nextInt();
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        int b = scanner.nextInt();
        scanner.close();

        int result = lcm(a, b);
        System.out.println("EL RESULTADO ES: " + result);
    }

    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}