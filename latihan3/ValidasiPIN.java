import java.util.Scanner;

public class ValidasiPIN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pinAsli = "123456";
        int jumlahCoba = 0;
        boolean aksesDiterima = false;

        while (jumlahCoba < 3) {
            System.out.print("Masukkan PIN: ");
            String pinMasuk = scan.nextLine();
            jumlahCoba++;

            if (pinMasuk.equals(pinAsli)) {
                System.out.println("PIN benar. Akses diberikan.");
                aksesDiterima = true;
                break;
            } else {
                System.out.println("PIN salah.");
            }
        }

        if (!aksesDiterima) {
            System.out.println("Akun diblokir");
        }

        scan.close();
    }
}
```
