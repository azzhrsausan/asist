package Essay2.No1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PangramCheckerTest {

    @Test
    public void testKalimatPangram() {
        String kalimat = "The quick brown fox jumps over the lazy dog";
        assertEquals(true, PangramChecker.isPangram(kalimat));
    }

    @Test
    public void testKalimatBukanPangram() {
        String kalimat = "Hello world";
        assertEquals(false, PangramChecker.isPangram(kalimat));
    }

    @Test
    public void testCaseInsensitive() {
        String kalimat = "The Quick Brown Fox Jumps Over The Lazy Dog";
        assertTrue(PangramChecker.isPangram(kalimat));
    }

    @Test
    public void testKalimatDenganKarakterNonAlfabet() {
        String kalimat = "The quick brown fox jumps over the lazy dog 123456!!!";
        assertTrue(PangramChecker.isPangram(kalimat));
    }

    // @Test
    // public void testMainKalimatPangram() {
    //     String input = "The quick brown fox jumps over the lazy dog\n";
    //     ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    //     System.setIn(in);

    //     ByteArrayOutputStream out = new ByteArrayOutputStream();
    //     System.setOut(new PrintStream(out));

    //     PangramChecker.main(new String[]{});

    //     String output = out.toString().toLowerCase();
    //     assertTrue(output.contains("kalimat adalah pangram"));
    // }

    // @Test
    // public void testMainKalimatBukanPangram() {
    //     String input = "Hello world\n";
    //     ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    //     System.setIn(in);

    //     ByteArrayOutputStream out = new ByteArrayOutputStream();
    //     System.setOut(new PrintStream(out));

    //     PangramChecker.main(new String[]{});

    //     String output = out.toString().toLowerCase();
    //     assertTrue(output.contains("kalimat bukan pangram"));
    // }
}
