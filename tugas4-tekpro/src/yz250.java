public class yz250 extends Motor
        implements Mesin, Transmissi, AttrMotor, Frame {

    private final String edition;
    public yz250(String jenisMotor, String tahun, String model, boolean roadLegal, String jenisEdisi){
        super(jenisMotor, tahun, model, roadLegal);
        this.edition = jenisEdisi;
    }

    @Override
    //Polymorphing
    public void displayMotoSpecs() {
        System.out.println("======================== Spesifikasi Motor YZ250 ==========================");
        System.out.println("Jenis Motor: " + getJenisMotor());
        System.out.println("Tahun: " + getTahun());
        System.out.println("Model: " + getModel());
        System.out.println("Edisi: " + getEdition());
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
        System.out.println("Spesifikasi Mesin YZ250");
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

    //Getter
    public String getEdition(){
        return edition;
    }

    //Interface
    @Override
    public void velg() {
        System.out.println("Velg: Jari-Jari");
    }

    @Override
    public void spion() {
        System.out.println("Spion: Tidak ada");
    }

    @Override
    public void knalpot() {
        System.out.println("Knalpot: Stock 2 Stroke");
    }

    @Override
    public void jenisBan() {
        System.out.println("Jenis Ban: Dirt Bike Tire");
    }

    @Override
    public void jokMotor() {
        System.out.println("Jok: Kulit Sintetis");
    }

    @Override
    public void tipeStang() {
        System.out.println("Tipe Stang: Tracker");
    }

    @Override
    public void teknologiTambahan() {
        System.out.println("Teknologi Tambahan: Ypvs");
    }

    @Override
    public void fairingMotor() {
        System.out.println("Fairing: Half fairing");
    }

    @Override
    public void warnaMotor() {
        System.out.println("Warna Motor: Biru");
    }

    @Override
    public void bahanFrame() {
        System.out.println("Bahan Frame: Alumunium");
    }

    @Override
    public void jenisFrame() {
        System.out.println("Jenis Frame: Diamond Cross");
    }

    @Override
    public void langkah() {
        System.out.println("Langkah Mesin: 2-Tak");
    }

    @Override
    public void kapasitas() {
        System.out.println("Kapasitas Mesin: 249cc");
    }

    @Override
    public void kompresi() {
        System.out.println("Kompresi Mesin: 10:1");
    }

    @Override
    public void pembakaran() {
        System.out.println("Pembakaran: Injektor");
    }

    @Override
    public void jumlahSilinder() {
        System.out.println("Jumlah Silinder: 1");
    }

    @Override
    public void horsepower() {
        System.out.println("Horsepower: 50hp");
    }

    @Override
    public void torque() {
        System.out.println("Torsi: 20nm");
    }

    @Override
    public void jenisTransmisi() {
        System.out.println("Jenis Transmissi: Manual");
    }

    @Override
    public void tipePenggerak() {
        System.out.println("Tipe Penggerak: Rantai");
    }

    @Override
    public void jumlahTransmisi() {
        System.out.println("Jumlah Transmissi: 6 Perpindahan");
    }
}