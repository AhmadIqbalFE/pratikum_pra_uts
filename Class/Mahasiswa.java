package Class;
public class Mahasiswa {
private String nama;
private int sks;

public Mahasiswa(String nama, int sks) {
    this.nama = nama;
    this.sks = sks;
}

public void setSks(int sks) {
    this.sks = sks;
}
public int getSks() {
    return sks;
}
public void tampilkanInfo() {
    System.out.println("Nama: " + nama);
    System.out.println("SKS: " + sks);
}

public static void main(String[] args) {
    Mahasiswa mahasiswa = new Mahasiswa("Budi", 24);
    mahasiswa.tampilkanInfo();
    mahasiswa.setSks(30);
    mahasiswa.tampilkanInfo();
}
}
