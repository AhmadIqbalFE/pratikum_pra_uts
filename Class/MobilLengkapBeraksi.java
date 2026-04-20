 class MobilLengkap {
    void hidupkanMobil() {
        System.out.println("Mobil dihidupkan");
    }
    void matikanMobil() {
        System.out.println("Mobil dimatikan");
    }
    void ubahGigi() {
        System.out.println("Gigi mobil diubah");
    }
}
public class MobilLengkapBeraksi {
    public static void main(String[] args) {
        MobilLengkap mobil = new MobilLengkap();
        mobil.hidupkanMobil();
        mobil.ubahGigi();
        mobil.matikanMobil();
    }
}
