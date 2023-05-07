package pnb.pbo1.utils;

public class Latihan
{
    private int number;

    public Latihan(String text)
    {
        System.out.println(text);
    }
    public String soal(String text)
    {
        return String.format("%d. %s.", ++number, text);
    }
}
