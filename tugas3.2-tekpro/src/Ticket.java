public class Ticket {
    private Film detailFilm;
    private String jadwalTayang;
    private int jumlahTiket;

    public Ticket(Film film, String jadwalTayang, int jumlahTiket) {
        this.detailFilm = film;
        this.jadwalTayang = jadwalTayang;
        this.jumlahTiket = jumlahTiket;
    }

    public Film getDetailFilm() {
        return detailFilm;
    }

    public String getJadwalTayang() {
        return jadwalTayang;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public double total() {
        return detailFilm.getHarga() * jumlahTiket;
    }

}
