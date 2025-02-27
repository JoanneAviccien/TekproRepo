import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    private List<Jajanan> menuMakanan;

    public Restaurant(){
        this.menuMakanan = new ArrayList<>();
    }
    
    public void addMenu(String namaMakanan, double hargaMakanan, int stok){
        menuMakanan.add(new Jajanan(namaMakanan, hargaMakanan, stok));
    }

    public void getOrder(String namaMakanan) {
        Scanner getQty = new Scanner(System.in);
        System.out.println("Anda mau pesan berapa banyak?");
        int qty = getQty.nextInt();
        for (Jajanan makanan : menuMakanan) {
            if (makanan.getNamaMakanan().equalsIgnoreCase(namaMakanan)) {
                if (!makanan.isOutOfStock() && makanan.getStok() >= qty) {
                    makanan.setStok(makanan.getStok() - qty);
                    System.out.println("Pesanan berhasil: " + makanan.getNamaMakanan() + " seharga Rp" + makanan.getHargaMakanan());
                } else if (makanan.getStok() < qty) {
                    System.out.println("Stok makanan tidak dapat memenuhi permintaan...");
                } else {
                    System.out.println("Maaf, " + makanan.getNamaMakanan() + " sudah habis.");
                }
                return;
            }
        }
        System.out.println("Maaf, " + namaMakanan + " tidak tersedia di menu.");
    }
    
    public void tampilMenuMakanan() {
        int no = 1;
        for(Jajanan makanan : menuMakanan){
            if(!makanan.isOutOfStock()){
                System.out.println(no + ". " + makanan.getNamaMakanan() + "\tRp." + makanan.getHargaMakanan() + "\tStok Makanan = " + makanan.getStok());
                no++;
            }
            else {
                System.out.println(makanan.getNamaMakanan() + "\tSudah Habis!");
            }
        }
    }


}