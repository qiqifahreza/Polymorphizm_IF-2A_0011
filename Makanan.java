public class Makanan extends Produk {
    private int kadaluarsa;

    public Makanan(String nama, double harga, int stok, int kadaluarsa) {
        super(nama, harga, stok);
        this.kadaluarsa = kadaluarsa;
    }

    @Override
    public double hitungAkhir(int jmlhBeli) {
        System.out.println("Total harga = " + hitungTotalHarga(jmlhBeli));
        return hitungTotalHarga(jmlhBeli) * 0.85;
    }

    @Override 
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Masa Kadaluarsa: " + kadaluarsa + " Tahun");
    }
}
