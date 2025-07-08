package Essay1.No2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class No2Test {
    @Test
    void testInnerArrayChecker() {
        assertEquals(true, No2.innerArrayChecker(new int[]{1,2,4,6}, new int[]{2,4}));
        assertEquals(false, No2.innerArrayChecker(new int[]{1,2,4,6}, new int[]{2,3,4}));

    }
}
