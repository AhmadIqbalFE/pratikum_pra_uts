public class Motor2 {
    private String warna;
    private String merk;

    public Motor2(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void tampilkanInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Merk: " + merk);
    }

    public static void main(String[] args) {
        Motor2 motor = new Motor2("Hitam", "Yamaha");
        motor.tampilkanInfo();

        motor.setWarna("Biru");
        motor.setMerk("Suzuki");
        motor.tampilkanInfo();
    }
}