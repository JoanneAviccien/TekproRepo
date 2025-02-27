public class Jajanan {
    private final String namaMakanan;
    private final double hargaMakanan;
    private int stok;

    public Jajanan(String namaMakanan, double hargaMakanan, int stokMakanan) {
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        stok = stokMakanan;
    }

    public String getNamaMakanan() { return namaMakanan; }

    public double getHargaMakanan() { return hargaMakanan; }

    public int getStok(){ return stok; }

    public void setStok(int newStok) {
        this.stok = newStok;
    }

    public boolean isOutOfStock(){ return stok == 0; }

}
