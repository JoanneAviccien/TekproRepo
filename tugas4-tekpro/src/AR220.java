public class AR220 extends Perahu
        implements Mesin, Transmissi, AttrPerahu, Frame{
    
    public AR220(String type, String year, String size){
        super(type,year,size);
    }

    @Override
    public void displayBoatSpecs() {
        System.out.println("======================== Spesifikasi Perahu AR220 =========================");
        System.out.println("Tipe Perahu: " + getTipePerahu());
        System.out.println("Tahun: " + getTahunPerahu());
        System.out.println("Ukuran Perahu: " + getUkuranPerahu());
        jumlahKursi();
        jenisFrame();
        bahanFrame();
        warnaPerahu();
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
    public void jumlahKursi() {
        System.out.println("Jumlah Kursi: 10");
    }

    @Override
    public void warnaPerahu() {
        System.out.println("Warna: Hitam");
    }

    @Override
    public void bahanFrame() {
        System.out.println("Bahan Frame: Carbon Fiber");
    }

    @Override
    public void jenisFrame() {
        System.out.println("Jumlah Frame: Motorboat Frame");
    }

    @Override
    public void langkah() {
        System.out.println("Langkah Mesin: 4-tak");
    }

    @Override
    public void kapasitas() {
        System.out.println("Kapasitas Mesin: 1049cc");
    }

    @Override
    public void kompresi() {
        System.out.println("Kompresi Mesin:");
    }

    @Override
    public void pembakaran() {
        System.out.println("Pembakaran: Injeksi");
    }

    @Override
    public void jumlahSilinder() {
        System.out.println("Jumlah Silinder: 6");
    }

    @Override
    public void horsepower() {
        System.out.println("Horsepower: 230hp");
    }

    @Override
    public void torque() {
        System.out.println("Jumlah Kursi: 80Nm");
    }

    @Override
    public void jenisTransmisi() {
        System.out.println("Jenis Transmisi: -");
    }

    @Override
    public void tipePenggerak() {
        System.out.println("Propulsion: Jet Drive");
    }

    @Override
    public void jumlahTransmisi() {
        System.out.println("Jumlah Transisi: -");
    }
}
