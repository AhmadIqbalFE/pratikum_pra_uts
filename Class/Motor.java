public class Motor {
    private String warna;
    private String merk;

    // Constructor
    public Motor(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }

    // Method tampilkan info
    public void tampilkanInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Merk: " + merk);
    }

    // Main method
    public static void main(String[] args) {
        Motor motor = new Motor("Merah", "Honda");
        motor.tampilkanInfo();
    }
}