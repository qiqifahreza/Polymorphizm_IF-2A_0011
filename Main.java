public class Main {
    public static void main(String [] args) {
        Produk p1 = new Elektronik("Samsung", 100000, 5, 2);
        Produk p2 = new Makanan("Bakso", 1000, 100, 3);
        Kasir kasir = new Kasir("Maman");

        p1.tampilInfo();

        kasir.tampilIdentitas();
        kasir.prosesBelanja(p1, 3);

        System.out.println("\n\n");

        p2.tampilInfo();

        kasir.tampilIdentitas();
        kasir.prosesBelanja(p2, 11);

    }
}
