abstract class Kendaraan {
    abstract void bergerak();
}
class Mobil extends Kendaraan {
    @Override
    void bergerak() {
        System.out.println("Mobil bergerak dengan roda.");
    }
}
class Sepeda extends Kendaraan {
    @Override
    void bergerak() {
        System.out.println("Sepeda bergerak dengan pedal.");
    }
}
public class KendaraanBeraksi {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();

        mobil.bergerak(); // Output: Mobil bergerak dengan roda.
        sepeda.bergerak(); // Output: Sepeda bergerak dengan pedal.
    }
}