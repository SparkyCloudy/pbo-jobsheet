package pnb.pbo1.js;

import pnb.pbo1.utils.Jobsheet;

public class Tiga {
    // Constructor Jobsheet 3
    public Tiga() {
        nomer1js3();
    }

    private void nomer1js3() {
        var js3 = new Jobsheet("Jobsheet 3");
        System.out.println(js3.soal("""
                Buatlah implementasi class and object dengan menggunakan object lainnya
                contoh: mobil, sepeda, meja dan lain sebagainya. Buatlah object yang berbeda
                dari teman kalian!
                """));
        System.out.println("\"Diatas Merupakan bentuk Implementasi Class 'Jobsheet' dan Object 'js' secara sederhana\" \n");
    }
}
