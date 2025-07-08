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
        
        for (boolean ada : huruf) {
            if (ada != true) {
                return false;  
            }
        }
        
        return true;
    }
}
