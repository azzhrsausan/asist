package Essay1.No1;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Listen # Silent

        // Input dari pengguna
        System.out.print("Masukkan dua kata/frasa: ");
        String input = scanner.nextLine();
        
        // LENGKAPI PROGRAM INI
        String[] splitted = input.split("#");
        
        String kata1 = splitted[0];
        String kata2 = splitted[1];


        if (isAnagram(kata1, kata2)) {
            System.out.println("input merupakan anagram.");
        } else {
            System.out.println("input bukan merupakan anagram.");
        }
    }

    // Fungsi untuk mengecek apakah dua string adalah anagram
    public static boolean isAnagram(String s1, String s2) {
        
        // // LENGKAPI PROGRAM INI

        s1 = s1.replaceAll("\\s+","");
        s2 = s2.replaceAll("\\s+","");

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // silent
        // listen

        // eilnst

        if(Arrays.equals(arr1,arr2)) {
            return true;
        } else {
            return false;
        }
    }
}