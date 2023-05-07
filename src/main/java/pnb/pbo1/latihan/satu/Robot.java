package pnb.pbo1.latihan.satu;

public class Robot
{
    public static int robotCounter;
    public int id;
    public String model;
    public int productionYear;
    public static final String vendor = "Bali State Polytechnic";

    public Robot(String model, int productionYear)
    {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }

    public void displayInformation()
    {
        System.out.printf("I am robot %d of %d. Model: %s. I was manufactured by %s in year %d.%n",
                id, robotCounter, model, vendor, productionYear);
    }
}
