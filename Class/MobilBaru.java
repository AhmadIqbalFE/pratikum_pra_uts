public class MobilBaru {
private String warna;
private String merk;

public MobilBaru(String warna, String merk) {
    this.warna = warna;
    this.merk = merk;
}

public void tampilkanInfo() {
    System.out.println("Warna: " + warna);
    System.out.println("Merk: " + merk);
}

public static void main(String[] args) {
    MobilBaru mobil = new MobilBaru("Putih", "Toyota");
    mobil.tampilkanInfo();
}
}
