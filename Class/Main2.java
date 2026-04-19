class Mahasiswa2 {
String nama;
String nim;
void tampilkanNama() {
    System.out.println("Nama: " + nama);
}
void tampilkanNim() {
    System.out.println("NIM: " + nim);
}
void olahraga() {
    System.out.println("Olahraga favorit: Sepak Bola");
}
}
public class Main2 {
    public static void main(String[] args) {
        Mahasiswa2 mahasiswa1 = new Mahasiswa2();
        mahasiswa1.nama = "Alvaro";
        mahasiswa1.nim = "123456789";
        
        mahasiswa1.tampilkanNama();
        mahasiswa1.tampilkanNim();
        mahasiswa1.olahraga();
        Mahasiswa2 mahasiswa2 = new Mahasiswa2();
        mahasiswa2.nama = "Ahmar";
        mahasiswa2.nim = "987654321";
        mahasiswa2.tampilkanNama();
        mahasiswa2.tampilkanNim();
        mahasiswa2.olahraga();
        Mahasiswa2 mahasiswa3 = new Mahasiswa2();
        mahasiswa3.nama = "Iqbal";
        mahasiswa3.nim = "456789123";
        mahasiswa3.tampilkanNama();
        mahasiswa3.tampilkanNim();
        mahasiswa3.olahraga();
    }

}