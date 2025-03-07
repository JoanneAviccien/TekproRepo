abstract class Perahu {
    private final String tipePerahu;
    private final String tahun;
    private final String ukuranPerahu;

    //Constructor
    public Perahu(String type, String year, String size){
        this.tipePerahu = type;
        this.tahun = year;
        this.ukuranPerahu = size;
    }

    //Also going to be morphed later
    public void displayBoatSpecs(){
        System.out.println("Spek perahu tidak diketahui");
    }

    //Getter
    public String getTipePerahu() {
        return tipePerahu;
    }

    public String getUkuranPerahu() {
        return ukuranPerahu;
    }

    public String getTahunPerahu() {
        return tahun;
    }

}
