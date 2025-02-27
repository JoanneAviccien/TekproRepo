import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args){
        Restaurant menu = new Restaurant();
        Scanner getOpsi = new Scanner(System.in);


        menu.addMenu("Udang Keju", 9_500, 15);
        menu.addMenu("Cakue", 1_500, 10);
        menu.addMenu("Bacang", 3_500, 15);
        menu.addMenu("Agar-Agar", 1_500, 20);

        while (true) {
            System.out.println("\nMenu Makanan:");
            menu.tampilMenuMakanan();

            System.out.print("\nMasukkan nama makanan yang ingin dipesan (atau ketik 'keluar' untuk keluar): ");
            String opsi = getOpsi.nextLine();

            if (opsi.equalsIgnoreCase("keluar")) {
                System.out.println("Terimakasih telah berbelanja");
                break;
            }
            menu.getOrder(opsi);
        }
        getOpsi.close();
    }
}