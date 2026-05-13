public abstract class Produk {
    private String nama;
    private double harga;
    private int stok;

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void setStok(int jmlhBeli) {
        stok -= jmlhBeli;
    }

    public int getStok() { return stok; }

    





}