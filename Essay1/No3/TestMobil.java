package Essay1.No3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMobil {
    
    MobilOO mob01 = new MobilOO("Wuling", "City Car", 0);
   
    @Test
    public void testGetterSetter()
    {
        //TODO lengkapi method ini untuk menguji semua getter dan setter
        assertEquals("Wuling", mob01.getCarBrand());
        assertEquals("City Car", mob01.getCarModel());
        assertEquals(0, mob01.getSpeed());

        mob01.setSpeed(10);
        assertEquals(10, mob01.getSpeed());

        
    }

    @Test
    public void testAkselBrake()
    {
       //TODO Gunakan method ini menguji method Accelerate dan Brake
       mob01.accelerate(3);
       assertEquals(3, mob01.getSpeed());

       mob01.brake(2);
       assertEquals(1, mob01.getSpeed());
    }

    //NOTE: Method DisplayCarInfo tidak perlu dibuatkan test case
}
