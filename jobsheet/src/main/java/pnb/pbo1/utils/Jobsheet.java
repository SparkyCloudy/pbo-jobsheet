package pnb.pbo1.utils;

public class Jobsheet
{
    private int number;

    public Jobsheet(String text)
    {
        System.out.println(text);
    }
    public String soal(String text)
    {
        return String.format("%d. %s.", ++number, text);
    }

}
