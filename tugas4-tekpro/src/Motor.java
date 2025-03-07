abstract class Motor {
    private final String jenisMotor;
    private final String tahun;
    private final String model;
    private final boolean roadLegal;

    //Constructor
    public Motor(String type, String year, String modelMotor, boolean legalitas) {
        this.jenisMotor = type;
        this.tahun = year;
        this.model = modelMotor;
        this.roadLegal = legalitas;
    }

    //Going to be morphed later
    public void displayMotoSpecs(){
        System.out.println("Spek motor tidak diketahui");
    }

    //Getter
    public String getJenisMotor() {
        return jenisMotor;
    }

    public String getModel() {
        return model;
    }

    public String getTahun() {
        return tahun;
    }

    public boolean isRoadLegal(){
        return roadLegal;
    }

}
