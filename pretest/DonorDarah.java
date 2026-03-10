import java.util.Scanner;

public class DonorDarah {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("masukkan usia: ");
        int usia = input.nextInt();

        System.out.print("masukkan berat badan (kg): ");
        float berat = input.nextFloat();

        System.out.print("masukkan kadar hemoglobin: ");
        float hb = input.nextFloat();

        if (usia >= 17) {
            if (usia <= 60) {

                if (berat >= 45) {

                    if (hb >= 12.5) {
                        System.out.println("anda memenuhi syarat untuk donor darah.");
                    } else {
                        System.out.println("tidak boleh donor: Hemoglobin terlalu rendah.");
                    }

                } else {
                    System.out.println("tidak boleh donor: Berat badan kurang dari 45 kg.");
                }

            } else {
                System.out.println("tidak boleh donor: Usia lebih dari batas maksimal.");
            }

        } else {
            System.out.println("tidak boleh donor: Usia kurang dari 17 tahun.");
        }

        input.close();
    }
}