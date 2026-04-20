class Matematika {
    int pertambahan (int a, int b) {
        return a + b;
    }
    int pengurangan(int a, int b) {
        return a - b;
    }
    int perkalian(int a, int b) {
        return a * b;
    }
    double pembagian(int a, int b) {
        return (double) a / b;
    }
}

public class MatematikaBeraksi {
    public static void main(String[] args) {
    Matematika matematika = new Matematika();
    int hasilPertambahan = matematika.pertambahan(20, 20);
    int hasilPengurangan = matematika.pengurangan(10, 5);
    int hasilPerkalian = matematika.perkalian(10, 20);
    double hasilPembagian = matematika.pembagian(21, 2);
    System.out.println("Pertambahan: " + hasilPertambahan);
    System.out.println("Pengurangan: " + hasilPengurangan);
    System.out.println("Perkalian: " + hasilPerkalian);
    System.out.println("Pembagian: " + hasilPembagian);
    }
}