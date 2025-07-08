package Essay2.No2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class nomorDuaTest {
    // @Test
    // void testIsArrayDominantA() {

    //     assertEquals(false, nomorDua.isArrayDominantA(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
    //     assertEquals(true, nomorDua.isArrayDominantA(new int[]{1, 2, 4}, new int[]{1, 4, 5}));
    // }

    @Test
    void testIsArrayDominantB() {
        assertEquals(false, nomorDua.isArrayDominantB(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        assertEquals(true, nomorDua.isArrayDominantB(new int[]{1, 2, 4}, new int[]{4, 5, 6}));
        assertTrue(nomorDua.isArrayDominantB(new int[]{9, 10, 11}, new int[]{4, 5, 6}));
    }
}

