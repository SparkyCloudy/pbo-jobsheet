package pnb.pbo1.js.helper;

public class Book
{
    private static String name;
    private final String penerbit;
    private final int halaman;

    public Book(String name, String penerbit, int halaman)
    {
        Book.name = name;
        this.penerbit = penerbit;
        this.halaman = halaman;
    }

    public Book()
    {
        this.penerbit = null;
        this.halaman = 0;
    }

    public String getName()
    {
        return  name;
    }

    public String getPenerbit()
    {
        return penerbit;
    }

    public int getHalaman()
    {
        return halaman;
    }
}
