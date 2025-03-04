public class Film {
    private final String Judul;
    private final int Durasi;
    private final String Genre;
    private final String ratingUmur;
    private final double harga;

    // Constructor
    public Film(String judulFilm, String genre, int durasi, String rating, double harga) {
        this.Judul = judulFilm;
        this.Genre = genre;
        this.Durasi = durasi;
        this.ratingUmur = rating;
        this.harga = harga;
    }

    // Getter untuk Judul
    public String getJudul() {
        return Judul;
    }

    // Getter untuk Durasi
    public int getDurasi() {
        return Durasi;
    }

    // Getter untuk Genre
    public String getGenre() {
        return Genre;
    }

    // Getter untuk ratingUmur
    public String getRatingUmur() {
        return ratingUmur;
    }
    public double getHarga() { return harga; };

}
