package Essay2.No3;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestEmployee {
    
    EmployeOO employeeTest = new EmployeOO("Vegapunk", "Peneliti", 55, 25000000);

    @Test
    public void testGet()
    {
        assertEquals("Vegapunk", employeeTest.getNama());
        assertEquals("Peneliti", employeeTest.getPosisi());
        assertEquals(55, employeeTest.getUmur());
        assertEquals(25000000, employeeTest.getGaji());
    }

    @Test
    public void testNaikPenalti()
    {
        employeeTest.naikGaji(5000000);
        assertEquals(30000000, employeeTest.getGaji());

        employeeTest.kenaPenalti(10000000);
        assertEquals(20000000, employeeTest.getGaji());
    }

}
