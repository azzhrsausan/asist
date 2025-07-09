package Essay2.No1;

import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        
        if (isPangram(kalimat)) {
            System.out.println("Kalimat adalah pangram.");
        } else {
            System.out.println("Kalimat bukan pangram.");
        }
    }

    public static boolean isPangram(String kalimat) {
        kalimat = kalimat.toLowerCase();
        
        kalimat = kalimat.replaceAll("\\s", "");
        
        boolean[] huruf = new boolean[26]; 
        
        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a'; 
                huruf[index] = true;
            }
        }

        // 🧩 Penjelasan Kodenya:
        // java
        // Copy code
        // for (int i = 0; i < kalimat.length(); i++) {
        // ➡️ Loop untuk setiap karakter dalam string kalimat.

        // java
        // Copy code
        //     char c = kalimat.charAt(i);
        // ➡️ Ambil satu huruf di posisi ke-i dari kalimat. Misalnya huruf 'a', 'b', dst.

        // java
        // Copy code
        //     if (c >= 'a' && c <= 'z') {
        // ➡️ Cek apakah c adalah huruf kecil (a sampai z).
        // Kalau huruf besar atau spasi, nggak diproses.

        // java
        // Copy code
        //         int index = c - 'a';
        // ➡️ Ini cerdas banget! Misalnya:

        // Kalau c = 'a', maka index = 0 ('a' - 'a')

        // Kalau c = 'b', maka index = 1 ('b' - 'a')

        // ... sampai z = 25

        // Jadi index adalah nomor urut huruf, dari a (0) sampai z (25).

        // java
        // Copy code
        //         huruf[index] = true;
        // ➡️ Tandai bahwa huruf ke-index (a–z) sudah muncul di kalimat.

        // Misalnya: huruf[7] = true artinya huruf 'h' muncul.

        // 🔁 Akhirnya...
        // Setelah loop selesai, array huruf[26] akan berisi true/false sesuai huruf mana aja yang muncul.
        
        for (boolean ada : huruf) {
            if (ada != true) {
                return false;  
            }
        }
        
        return true;
    }
}
