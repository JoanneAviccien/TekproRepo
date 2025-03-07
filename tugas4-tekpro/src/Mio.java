public class Mio extends Motor
        implements Mesin, Transmissi, AttrMotor, Frame{

    public Mio(String jenisMotor, String tahun, String model, boolean roadLegal){
        super(jenisMotor, tahun, model, roadLegal);
    }

    @Override
    public void displayMotoSpecs() {
        System.out.println("======================== Spesifikasi Motor Mio ============================");
        System.out.println("Jenis Motor: " + getJenisMotor());
        System.out.println("Tahun: " + getTahun());
        System.out.println("Model: " + getModel());
        System.out.println("Road Legal: " + isRoadLegal());
        velg();
        spion();
        knalpot();
        jenisBan();
        jokMotor();
        tipeStang();
        teknologiTambahan();
        fairingMotor();
        warnaMotor();
        tipeStang();
        teknologiTambahan();
        bahanFrame();
        jenisFrame();
        System.out.println("Spesifikasi Mesin Mio");
        langkah();
        kapasitas();
        kompresi();
        pembakaran();
        jumlahSilinder();
        horsepower();
        torque();
        jenisTransmisi();
        tipePenggerak();
        jumlahTransmisi();
    }

    @Override
    public void velg() {
        System.out.println("Velg: Racing(5 Spoke)");
    }

    @Override
    public void spion() {
        System.out.println("Spion: Kanan dan Kiri");
    }

    @Override
    public void knalpot() {
        System.out.println("Knalpot: Stock");
    }

    @Override
    public void jenisBan() {
        System.out.println("Jenis Ban: Medium Compound");
    }

    @Override
    public void jokMotor() {
        System.out.println("Jok: Kulit Sintetis");
    }

    @Override
    public void tipeStang() {
        System.out.println("Tipe Stang: Scooter");
    }

    @Override
    public void teknologiTambahan() {
        System.out.println("Teknologi Tambahan: Blue Core");
    }

    @Override
    public void fairingMotor() {
        System.out.println("Fairing: tidak ada");
    }

    @Override
    public void warnaMotor() {
        System.out.println("Warna Motor: Putih");
    }

    @Override
    public void bahanFrame() {
        System.out.println("Bahan Frame: Alumunium");
    }

    @Override
    public void jenisFrame() {
        System.out.println("Jenis Frame: Monocoque");
    }

    @Override
    public void langkah() {
        System.out.println("Langkah Mesin: 4-Tak");
    }

    @Override
    public void kapasitas() {
        System.out.println("Kapasitas Mesin: 110cc");
    }

    @Override
    public void kompresi() {
        System.out.println("Kompresi Mesin: 9:1");
    }

    @Override
    public void pembakaran() {
        System.out.println("Pembakaran: Karburator");
    }

    @Override
    public void jumlahSilinder() {
        System.out.println("Jumlah Silinder: 1");
    }

    @Override
    public void horsepower() {
        System.out.println("Horsepower: 9.38hp");
    }

    @Override
    public void torque() {
        System.out.println("Torsi: 9nm");
    }

    @Override
    public void jenisTransmisi() {
        System.out.println("Jenis Transmissi: CVT");
    }

    @Override
    public void tipePenggerak() {
        System.out.println("Tipe Penggerak: CVT Belt");
    }

    @Override
    public void jumlahTransmisi() {
        System.out.println("Jumlah Transmissi: -");
    }
}
