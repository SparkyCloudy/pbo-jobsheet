package pnb.pbo1.latihan.satu;

public class Window
{
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    public void printSize()
    {
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
        System.out.println();
    }
}
