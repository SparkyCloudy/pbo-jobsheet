package pnb.pbo1.js;

import pnb.pbo1.utils.Jobsheet;

public class Dua {
    Jobsheet js = new Jobsheet("Jobsheet 2");

    public Dua() {
        nomer1();
    }

    private void nomer1() {
        System.out.println(js.soal("""
                Buatlah masing-masing 3 method dari String dan gunakan dalam program
                kalian. Contoh: menggunakan toUpperCase, toLowerCase, length; Note:
                terdapat banyak method dalam class String, gunakan method selain yang
                disebutkan pada soal ini!
                """));

        String nama = "Satria";
        System.out.println("Nama: " + nama);
        System.out.println("Nama Tambahan: " + nama
                .concat("gama"));

        System.out.println("Apakah \"Satria\" dan \"Satriagama\" adalah orang yang sama? " + nama
                .matches("Satria"));

        System.out.println("Nama Ganti: " + nama
                .replaceAll(nama, "Prajna" + "\n"));
    }

}
