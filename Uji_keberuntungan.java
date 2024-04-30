import java.util.Scanner;

public class Uji_keberuntungan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.println("Uji keberuntunganmu di sini dengan memilih nomor (1-5) =");
            int nomorGacha = scanner.nextInt();

            switch (nomorGacha) {
                case 1:
                    System.out.println("Anda mendapatkan Rare Item!");
                    break;
                case 2:
                    System.out.println("Anda mendapatkan Common Item!");
                    break;
                case 3:
                    System.out.println("Anda mendapatkan Super Rare Item!");
                    break;
                case 4:
                    System.out.println("Gacha lu ampas mas. XD");
                    break;
                case 5:
                    System.out.println("Anda mendapatkan Super Super Rare Item!!");
                
            }

            //blok else-if untuk menangani nilai yang di luar rentang (1-5)
            if (nomorGacha < 1 || nomorGacha > 5) {
                System.out.println("Tidak ada apa-apa di sini, balik sana!");
            }

            // Menanyakan apakah pengguna ingin mencoba lagi
            System.out.println("Apa ingin mencoba lagi? (ya/tidak)");
            String jawaban = scanner.next();
            if (jawaban.equalsIgnoreCase("tidak")) {
                ulang = false; // Jika jawaban adalah "tidak", keluar dari loop while
            }
        }
    }
}