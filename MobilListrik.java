public class MobilListrik extends Kendaraan implements KendaraanListrik {    
    public MobilListrik(String platNomor, String merk, double hargaSewaPerHari) {
        super(platNomor, merk, hargaSewaPerHari);
    }

    // Implementasi method dari Interface
    @Override
    public double hitungDiskonPajak() {
        return 50000; // Diskon flat untuk kendaraan listrik
    }

    // Implementasi method abstract dari superclass
    @Override
    public double hitungTotalSewa(int hari) {
        // Biaya sewa dikurangi diskon pajak kendaraan listrik
        return (hargaSewaPerHari * hari) - hitungDiskonPajak();
    }
}