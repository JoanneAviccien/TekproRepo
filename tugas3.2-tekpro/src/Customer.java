public class Customer {
    private final String nama;
    private final String email;

        public Customer(String nama, String email) {
            this.email = email;
            this.nama = nama;
        }

        public String getNama(){
            return nama;
        }
    }
