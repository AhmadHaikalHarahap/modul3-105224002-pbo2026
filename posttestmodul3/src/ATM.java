import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long uang = 500000;
        final long BATAS_SALDO = 50000;
        int menu;

        do {
            System.out.println("\n=== MENU ATM ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo saat ini: Rp" + uang);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah setor tunai: Rp");
                    long jumlahSetor = scan.nextLong();
                    if (jumlahSetor > 0) {
                        uang = uang + jumlahSetor;
                        System.out.println("Setor tunai berhasil. Saldo sekarang: Rp" + uang);
                    } else {
                        System.out.println("Nominal setor tidak valid.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan jumlah tarik tunai: Rp");
                    long jumlahTarik = scan.nextLong();
                    if (jumlahTarik <= 0) {
                        System.out.println("Nominal tarik tidak valid.");
                    } else if (jumlahTarik > uang) {
                        System.out.println("Saldo tidak mencukupi untuk penarikan.");
                    } else if ((uang - jumlahTarik) < BATAS_SALDO) {
                        System.out.println("Penarikan dibatalkan: saldo minimal harus Rp" + BATAS_SALDO);
                    } else {
                        uang = uang - jumlahTarik;
                        System.out.println("Tarik tunai berhasil. Saldo sekarang: Rp" + uang);
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih. Program ATM selesai.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid.");
            }

        } while (menu != 4);

        scan.close();
    }
}