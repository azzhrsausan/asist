public class DecimalToBinaryConverter {
    // Metode rekursif untuk mengonversi bilangan desimal positif ke biner
    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "";
        }
        return decimalToBinary(n/2) + (n % 2);
    }

    public static void main(String[] args) {
        int number = 10; // Contoh bilangan positif
        String binary = decimalToBinary(number);

        // Jika hasilnya kosong (untuk n = 0), set menjadi "0"
        if (binary.isEmpty()) {
            binary = "0";
        }

        System.out.println("Biner dari " + number + " adalah: " + binary);
    }
}
