import java.util.Scanner;

public class MesinTiket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vip = 5;
        int festival = 25;
        int tribune = 35;

        int hargaVip = 1500000;
        int hargaFestival = 800000;
        int hargaTribune = 500000;

        int pilih = 0;

        while (pilih != 4) {

            System.out.println("\n=== MENU KIOSK TIKET ===");
            System.out.println("1. VIP (Stok: " + vip + ")");
            System.out.println("2. Festival (Stok: " + festival + ")");
            System.out.println("3. Tribune (Stok: " + tribune + ")");
            System.out.println("4. Matikan Mesin");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();

            if (pilih == 1 || pilih == 2 || pilih == 3) {

                System.out.print("Jumlah tiket yang ingin dibeli: ");
                int jumlah = sc.nextInt();

                int stok = 0;
                int harga = 0;
                int minUmur = 0;

                if (pilih == 1) {
                    stok = vip;
                    harga = hargaVip;
                    minUmur = 18;
                }

                if (pilih == 2) {
                    stok = festival;
                    harga = hargaFestival;
                    minUmur = 15;
                }

                if (pilih == 3) {
                    stok = tribune;
                    harga = hargaTribune;
                    minUmur = 0;
                }

                if (jumlah > stok) {
                    System.out.println("stok tidak cukup!");
                } else {

                    int berhasil = 0;
                    int total = 0;

                    for (int i = 1; i <= jumlah; i++) {

                        int umur;

                        while (true) {
                            System.out.print("masukkan umur tiket ke-" + i + " (-1 untuk batal): ");
                            umur = sc.nextInt();

                            if (umur == -1) {
                                System.out.println("transaksi dibatalkan.");
                                break;
                            }

                            if (umur <= 0 || umur > 120) {
                                System.out.println("umur tidak logis, masukkan lagi.");
                            } else {
                                break;
                            }
                        }

                        if (umur == -1) {
                            break;
                        }

                        if (umur < minUmur) {
                            System.out.println("tidak memenuhi syarat umur.");
                        } else {
                            System.out.println("tiket berhasil.");
                            berhasil++;
                            total = total + harga;

                            if (pilih == 1) {
                                vip = vip - 1;
                            }

                            if (pilih == 2) {
                                festival = festival - 1;
                            }

                            if (pilih == 3) {
                                tribune = tribune - 1;
                            }
                        }
                    }

                    System.out.println("\n=== STRUK PEMBELIAN ===");
                    System.out.println("tiket berhasil: " + berhasil);
                    System.out.println("total bayar: Rp " + total);
                }
            }
        }

        System.out.println("mesin dimatikan.");
    }
}