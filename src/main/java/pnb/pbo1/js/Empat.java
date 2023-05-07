package pnb.pbo1.js;

import pnb.pbo1.js.helper.Cat;
import pnb.pbo1.js.helper.Gedung;
import pnb.pbo1.utils.Jobsheet;

public class Empat
{
    String text;
    Jobsheet js4 = new Jobsheet("Jobsheet 4");

    // Constructor Jobsheet 4 Nomer 2
    public Empat(String text)
    {
        this.text = text;
        nomer1js4();
        nomer2js4();
        nomer3js4();
        nomer4js4();
        nomer5js4();
    }

    private void nomer1js4()
    {
        System.out.println(js4.soal("""
                Buatlah implementasi class and object dengan menggunakan object lainnya
                contoh: mobil, sepeda, meja dan lain sebagainya. Buatlah object yang berbeda
                dari teman kalian!
                """));
        System.out.println("\"Diatas Merupakan bentuk Implementasi Class 'Jobsheet' dan Object 'js' secara sederhana\"");
        System.out.println();
    }

    private void nomer2js4()
    {
        System.out.println(js4.soal("""
                Buatlah 2 macam constructor dari kelas yang kalian buat pada jobsheet 3, satu
                tidak berisi parameter dan satu berisi parameter. Jelaskan source code serta
                hasil program tersebut.
                """));
        System.out.println(text);
        System.out.println();
    }

    private void nomer3js4()
    {
        System.out.println(js4.soal("""
                Jelaskan dengan memberikan hasil screenshot program serta solusi yang
                diperlukan jika program error ketika kita menjalankan code berikut di main
                method:
                Cat cat = new Cat("Whiskers", 5);
                Cat cat = new Cat("Whiskers");
                Cat cat = new Cat();
                """));
        System.out.println("Constructor 1");
        System.out.println("Nama Kucing: " + new Cat("Whiskas", 5).name);
        System.out.println("Usia Kucing: " + new Cat("Whiskas", 5).age);
        System.out.println();
    }

    private void nomer4js4()
    {
        System.out.println(js4.soal("""
                Buatlah kelas GedungTinggi dan buatlah constructor yang berisi pengumuman
                ketika GedungTinggi selesai dibuat. Untuk melakukan ini, Anda perlu
                memanggil constructor kelas GedungTinggi dalam main method dan berikan
                output dengan menggunakan System.out.println() atau System.out.print()
                dengan kata-kata “Pencakar langit telah dibangun". Berikan screenshot
                source code dan hasil program serta penjelasan mengenai program yang Anda buat.
                """));
        new Gedung();
        System.out.println();
    }

    private void nomer5js4()
    {
        System.out.println(js4.soal("""
                Modifikasi kelas GedungTinggi dengan menambah 2 constructor dengan
                ketentuan sebagai berikut:
                a. Constructor memiliki parameter jumlahLantai
                b. Constructor memiliki parameter developerName
                Jelaskan apa yang terjadi jika kita memanggil kode berikut di main method:
                """));
        new Gedung();
        new Gedung("Prajna Paramahansa");
        new Gedung(50);
        System.out.println();
    }
}
