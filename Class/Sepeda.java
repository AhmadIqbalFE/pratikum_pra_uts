public class Sepeda {
private String merk;
private int kecepatan;

public Sepeda(String merk, int kecepatan) {
    this.merk = merk;
    this.kecepatan = kecepatan;
}

public void ubahKecepatan(int kecepatanBaru) {
    this.kecepatan = kecepatanBaru;
}
public void tampilkanInfo() {
    System.out.println("Merk: " + merk);
    System.out.println("kecepatan: " + kecepatan + "km/jam");
}

public static void main(String[] args) {
    Sepeda sepeda = new Sepeda("Polygon", 20);
    sepeda.tampilkanInfo();
    sepeda.ubahKecepatan(30);
    sepeda.tampilkanInfo();
}
}
