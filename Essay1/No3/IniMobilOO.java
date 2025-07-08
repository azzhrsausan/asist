package Essay1.No3;

public class IniMobilOO{    
    public static void main(String[] args)
    {
        MobilOO mob1 = new MobilOO("Camry", "Sedan", 0);
        System.out.println(mob1.getSpeed());
        mob1.setSpeed(100);
        System.out.println(mob1.accelerate(50));
        System.out.println(mob1.brake(25));
        System.out.println(mob1.displayCarInfo());
    }
}