public class Elektronik extends Produk {
    private int masaGaransi;

    public Elektronik(String nama, double harga, int stok, int masaGaransi) {
        super(nama, harga, stok);
        this.masaGaransi = masaGaransi;
    }

    @Override
    public double hitungAkhir(int jmlhBeli) {
        System.out.println("Total harga = " + hitungTotalHarga(jmlhBeli));
        return hitungTotalHarga(jmlhBeli) * 0.85;
    }

    @Override 
    public void tamplInfo() {
        super.tampilInfo();
        System.out.println("Masa Garansi: " + masaGaransi + " Tahun");
    }
}
