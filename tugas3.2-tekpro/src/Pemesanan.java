public class Pemesanan {
    private Customer pelanggan;
    private Ticket tiket;

    public Pemesanan(Customer pelanggan, Ticket tiket) {
        this.pelanggan = pelanggan;
        this.tiket = tiket;
    }

    public Customer getCustomer() {
        return pelanggan;
    }

    public Ticket getTiket() {
        return tiket;
    }
}
