public class Main {
    public static void main(String [] args) {
        Produk p1 = new Elektronik("Samsung", 100000, 5, 2);
        Produk p2 = new Makanan("Bakso", 1000, 100, 3);
        Kasir k = new Kasir("Maman");

        p1.tampilInfo();

        k.tampilIdentitas();
        k.prosesBelanja(p1, 3);

    }
}
