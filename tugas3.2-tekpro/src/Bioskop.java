import java.util.ArrayList;
import java.util.List;

public class Bioskop {
    private final List<Film> daftarFilm;
    private final List<Ticket> daftarTicket;
    private final List<Pemesanan> daftarOrder;

    //Constructor
    public Bioskop() {
        this.daftarFilm = new ArrayList<>();
        this.daftarTicket = new ArrayList<>();
        this.daftarOrder = new ArrayList<>();
    }

    public void displayFilm() {
        System.out.println("Daftar Film: ");
        for (Film film : daftarFilm) {
            System.out.println("Judul: " + film.getJudul() + "\nRating: " + film.getRatingUmur() + "\nGenre: " + film.getGenre() + "\nDurasi: " + film.getDurasi() + " Jam\n");
        }
    }

    public Ticket getNonton(String judulFilm) {
        for (Ticket cek : daftarTicket) {
            if (cek.getDetailFilm().getJudul().equalsIgnoreCase(judulFilm)) {
                return cek;
            }
            else {
                System.out.println("Maaf, film tersedia di bioskop.");
            }
        }
        return null;
    }

    public void setFilm(Film tayang){
        daftarFilm.add(tayang);
    }

    public void setTicket(Ticket ticketFilm){
        daftarTicket.add(ticketFilm);
    }

    public void setOrder(Customer pelanggan, Ticket ticket) {
        Pemesanan pemesanan = new Pemesanan(pelanggan, ticket);
        daftarOrder.add(pemesanan);
        System.out.println("Pemesanan berhasil dibuat.");
    }

    public void displayOrder() {
        System.out.println("Detail Pemesanan:");
        for (Pemesanan order : daftarOrder) {
            System.out.println("Nama Pelanggan: " + order.getCustomer().getNama());
            System.out.println("Film: " + order.getTiket().getDetailFilm().getJudul());
            System.out.println("Jadwal Tayang: " + order.getTiket().getJadwalTayang());
            System.out.println("Jumlah Tiket: " + order.getTiket().getJumlahTiket());
            System.out.println("Total Harga: " + order.getTiket().total());
        }
    }
}
