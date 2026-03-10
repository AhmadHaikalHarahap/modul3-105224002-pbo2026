import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan angka desimal pertama: ");
        double bil1 = scan.nextDouble();

        System.out.print("Masukkan angka desimal kedua: ");
        double bil2 = scan.nextDouble();

        System.out.print("Masukkan operator matematika (+, -, *, /): ");
        char op = scan.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Hasil: " + (bil1 + bil2));
                break;
            case '-':
                System.out.println("Hasil: " + (bil1 - bil2));
                break;
            case '*':
                System.out.println("Hasil: " + (bil1 * bil2));
                break;
            case '/':
                if (bil1 == 0 || bil2 == 0) {
                    System.out.println("Error: Pembagian tidak dapat dengan nol");
                } else {
                    System.out.println("Hasil: " + (bil1 / bil2));
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
        }

        scan.close();
    }
}