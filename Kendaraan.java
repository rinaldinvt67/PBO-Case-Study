public abstract class Kendaraan {
    protected String platNomor;
    protected String merk;
    protected double hargaSewaPerHari;

    public Kendaraan(String platNomor, String merk, double hargaSewaPerHari) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    public void tampilkanInfo() {
        System.out.println("Plat Nomor  : " + platNomor);
        System.out.println("Merk        : " + merk);
        System.out.println("Harga/Hari  : Rp " + hargaSewaPerHari);
    }

    public abstract double hitungTotalSewa(int hari);
}