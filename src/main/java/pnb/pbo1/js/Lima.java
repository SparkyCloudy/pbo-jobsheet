package pnb.pbo1.js;

import pnb.pbo1.js.helper.Book;
import pnb.pbo1.utils.Jobsheet;

public class Lima
{
    Jobsheet js = new Jobsheet("Jobsheet 5");
    public Lima()
    {
        nomer1();
    }

    private void nomer1()
    {
        System.out.println(js.soal("""
                Berikan contoh penggunaan keyword package, import package, public, private,
                static dan this pada project kalian dan beri penjelasan mengenai fungsi dari
                keyword tersebut!
                """));
        var buku2 = new Book();
        System.out.printf("Nama Buku: %s %n", buku2.getName());
        var buku = new Book("Buku Java 17", "Prajna Letter", 60);

        System.out.println("Object 1: " + buku);
        System.out.printf("Nama Buku: %s \n", buku.getName());
        System.out.printf("Nama Penerbit: %s \n", buku.getPenerbit());
        System.out.printf("Jumlah Halaman: %s \n", buku.getHalaman());
        System.out.println();

        System.out.println("Object 2: " + buku2);
        System.out.printf("Nama Buku: %s \n", buku2.getName());
        System.out.printf("Nama Penerbit: %s \n", buku2.getPenerbit());
        System.out.printf("Jumlah Halaman: %s \n", buku2.getHalaman());
        System.out.println();
    }
}
