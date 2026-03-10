public class IterasiLewatiKelipatan {
    public static void main(String[] args) {
        System.out.println("Angka yang tidak terlewati (bukan kelipatan 3 atau 5):");

        for (int angka = 1; angka <= 50; angka++) {
            if (angka % 3 == 0 || angka % 5 == 0) {
                continue;
            }
            System.out.print(angka + " ");
        }

        System.out.println();
    }
}