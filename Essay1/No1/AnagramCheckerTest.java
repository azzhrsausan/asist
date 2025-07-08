package Essay1.No1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramCheckerTest {

    @Test
    public void testAnagramTrue() {
        // lengkapi unittestnya disini
        assertEquals(true, AnagramChecker.isAnagram("Silent", "Listen"));
    }

    @Test
    public void testAnagramFalse() {
        // lengkapi unittestnya disini
        assertEquals(false, AnagramChecker.isAnagram("Hakozaki", "Rikimaru"));
    }

    @Test
    public void testAnagramWithDifferentCases() {
        // String1 = "LISTEN"; String2 = "silent"; >> anagram

        // String1 = "Triangle"; String2 = "Integral" >> anagram
        
        // lengkapi unittestnya disini
        assertEquals(true, AnagramChecker.isAnagram("LISTEN", "silent"));
        assertEquals(true, AnagramChecker.isAnagram("Triangle", "Integral"));
    }
}