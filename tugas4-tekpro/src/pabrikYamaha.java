public class pabrikYamaha {
    public static void main(String [] args){

        Motor motor1 = new yz250("Motocross", "2006", "yz", false, "Anniversery");
        Motor motor2 = new Mio("Scooter", "2010", "Mio", true);
        Perahu perahu1 = new AR220("Motorboat", "2022", "Medium");

        System.out.println("===========================================================================");
        System.out.println("---------------------------------------------------------------------------");
        motor1.displayMotoSpecs();
        System.out.println("===========================================================================");
        System.out.println("---------------------------------------------------------------------------");
        motor2.displayMotoSpecs();
        System.out.println("===========================================================================");
        System.out.println("---------------------------------------------------------------------------");
        perahu1.displayBoatSpecs();

    }
}