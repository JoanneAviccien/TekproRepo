import java.util.Scanner;

public class bioskopMain {

    public static void main (String[] args){
        Bioskop bioskop = new Bioskop();
        System.out.println("Masukan Nama anda: ");
        Scanner getNama = new Scanner(System.in);
        String namaPelanggan = getNama.nextLine();
        System.out.println("Masukan E-mail anda: ");
        Scanner getEmail = new Scanner(System.in);
        String emailPelanggan = getEmail.nextLine();

        //Construct
        Film tayang1 = new Film("Neon Genesis Evangelion: The End of Evangelion", "Drama", 1, "R", 30_000);
        Film tayang2 = new Film("A Clockwork Orange", "Crime", 2, "NC-17", 35_000);
        Film tayang3 = new Film("Blue Velvet", "Mystery", 2, "R", 25_000);


        //Setter
        bioskop.setFilm(tayang1);
        bioskop.setFilm(tayang2);
        bioskop.setFilm(tayang3);
        bioskop.displayFilm();

        System.out.println("Masukan Jumlah tiket yang di inginkan: ");
        Scanner getJumlah = new Scanner(System.in);
        int jumlahTicket = getJumlah.nextInt();

        //Constructor
        Ticket ticket1 = new Ticket(tayang1, "19:30", jumlahTicket);
        Ticket ticket2 = new Ticket(tayang2, "20:00", jumlahTicket);
        Ticket ticket3 = new Ticket(tayang3, "19:30", jumlahTicket);
        Customer pelanggan = new Customer(namaPelanggan, emailPelanggan);
        bioskop.setTicket(ticket1);
        bioskop.setTicket(ticket2);
        bioskop.setTicket(ticket3);

        System.out.println("Masukan film yang akan anda saksikan: ");
        Scanner getWatch = new Scanner(System.in);
        String akandiTonton = getWatch.nextLine();
        Ticket pilihan = bioskop.getNonton(akandiTonton);

        bioskop.setOrder(pelanggan, pilihan);
        bioskop.displayOrder();



    }

}