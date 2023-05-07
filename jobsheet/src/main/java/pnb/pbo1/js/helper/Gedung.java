package pnb.pbo1.js.helper;

public class Gedung
{
    private String devName;
    private int floorQty;

    public Gedung()
    {
        System.out.println("Pencakar langit telah dibangun");
    }

    public Gedung(String devname)
    {
        this.devName = devname;
        if (devname != null)
        {
            System.out.println("Pencakar langit telah dibangun" + getDevName());
        }
        else
        {
            System.out.print("Pencakar langit telah dibangun");
        }
    }

    public Gedung(int floorQty)
    {
        this(null);
        this.floorQty = floorQty;
        System.out.println(getFloorQty());
    }

    private String getDevName()
    {
        return String.format(" oleh: %s", devName);
    }

    private String getFloorQty()
    {
        return String.format(" dengan jumlah lantai: %d", floorQty);
    }
}
