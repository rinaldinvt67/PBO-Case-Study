public class MobilBensin extends Kendaraan {
    private double biayaBBM; // Tambahan biaya bensin awal

    public MobilBensin(String platNomor, String merk, double hargaSewaPerHari, double biayaBBM) {
        super(platNomor, merk, hargaSewaPerHari);
        this.biayaBBM = biayaBBM;
    }

    // Implementasi method abstract dari superclass
    @Override
    public double hitungTotalSewa(int hari) {
        return (hargaSewaPerHari * hari) + biayaBBM;
    }
}