public class Main {
    public static void main(String[] args) {
        // Menggunakan array statis
        Kendaraan[] daftarRental = {
            new MobilListrik("B 1234 EV", "Hyundai Ioniq 5", 800000),
            new MobilBensin("DR 5678 XY", "Toyota Avanza", 400000, 150000),
            new MobilBensin("DR 555 ", "Toyota Alphard", 2800000, 300000)
        };

        int durasiSewa = 3; // Contoh sewa selama 3 hari
        System.out.println("=== Struk Rental Kendaraan (" + durasiSewa + " Hari) ===");

        // 5. POLYMORPHISM
        for (Kendaraan k : daftarRental) {
            System.out.println("--------------------------------");
            k.tampilkanInfo();
            
            if (k instanceof KendaraanListrik) {
                KendaraanListrik kl = (KendaraanListrik) k;
                System.out.println("Diskon Pajak: Rp " + kl.hitungDiskonPajak());
            }

            System.out.println("Total Bayar : Rp " + k.hitungTotalSewa(durasiSewa));
        }
    }
}