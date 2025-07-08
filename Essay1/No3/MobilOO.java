package Essay1.No3;

public class MobilOO {
    //TODO lengkapi variable dengan visibility private untuk semua
    private String carBrand;
    private String carModel;
    private int currentSpeed;

    public MobilOO( String carBrandss, String carModelss, int speed)
    {
       //TODO
       this.carBrand = carBrandss;
       this.carModel = carModelss;
       this.currentSpeed = speed;

    }

    public String getCarBrand() 
    {
        //TODO
        return this.carBrand;
    }
    public String getCarModel()
    {
        //TODO
        return this.carModel;
    }
    public int getSpeed(){
        //TODO
        return this.currentSpeed;
    }

    public void setSpeed(int CarSpeed){
       //TODO
       this.currentSpeed = CarSpeed;
    }
    public int accelerate(int Increase)
    {
       //TODO
       this.setSpeed(this.currentSpeed + Increase );
        return this.currentSpeed;
    }
    public int brake(int Decrease)
    {
        //TODO
        this.setSpeed(this.currentSpeed - Decrease);
        return this.currentSpeed;
    }
    public String displayCarInfo()
    {
        //TODO
        return "Car: "+carBrand+" "+carModel;
    }
}
