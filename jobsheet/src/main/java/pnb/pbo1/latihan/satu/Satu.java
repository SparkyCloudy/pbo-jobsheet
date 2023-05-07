package pnb.pbo1.latihan.satu;

import pnb.pbo1.utils.Latihan;

public class Satu
{
    Latihan lat = new Latihan("Latihan 1");
    public Satu()
    {
        nomer1();
        nomer2();
        nomer3();
    }

    private void nomer1()
    {
        System.out.println(lat.soal("""
                Hapus keyword static sebanyak yang seharusnya dilakukan tanpa mengubah
                fungsionalitas program. Tambahkan System.out.println() pada main method agar
                ditampilkan data seperti berikut:
                
                Robot yang dibuat oleh Bali State Polytechnic sebanyak 5
                """));
        var robot1 = new Robot("RCV-322", 2019);
        var robot2 = new Robot("JavaTron-008", 2017);
        var robot3 = new Robot("BugDestroyer-007", 1998);
        var robot4 = new Robot("Gundam-14", 2004);
        var robot5 = new Robot("Eve-2", 2012);

        robot1.displayInformation();
        robot2.displayInformation();
        robot3.displayInformation();
        robot4.displayInformation();
        robot5.displayInformation();


        System.out.printf("Robot yang dibuat oleh %s sebanyak %d %n%n",
                Robot.vendor, Robot.robotCounter);
    }

    private void nomer2()
    {
        System.out.println(lat.soal("""
                Terdapat class Window yang memiliki method changeSize, yang dapat
                mengubah ukuran jendela sesuai dengan parameter inputan dari method
                tersebut. Tetapi jika Anda menjalankan program, Anda akan melihat bahwa
                method ini tidak berfungsi. Anda perlu memperbaiki bug agar metode ini
                berfungsi. Persyaratan: Jangan ubah deklarasi dan inisialisasi property dari
                kelas Window. Jangan ubah deklarasi metode changeSize atau nama
                parameternya.
                """));

        var window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }

    private void nomer3()
    {
        System.out.println(lat.soal("""
                Terdapat class MainClass.java yang berisi main method dan Person.java seperti
                berikut. Ubahlah hanya satu kata dari class Person agar program dapat berjalan!
                """));
        var person = new Person("Prajna", "Paramahansa");
        System.out.println("Dossier:");
        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("Full name: " + person.getFullName());
        System.out.println();
    }
}
