package pnb.pbo1;

public class Main {

    public static void main(String[] args) {
        ujian();
    }

    private static void latihan() {
        new pnb.pbo1.latihan.satu.Satu();
        new pnb.pbo1.latihan.dua.Dua();
    }

    private static void jobhseet() {
        new pnb.pbo1.js.Satu();
        new pnb.pbo1.js.Dua();
        new pnb.pbo1.js.Tiga();
        new pnb.pbo1.js.Empat("Ini adalah JS4");
        new pnb.pbo1.js.Lima();
        new pnb.pbo1.js.Enam();
        new pnb.pbo1.js.Delapan();
        new pnb.pbo1.js.Sembilan();
    }

    private static void ujian() {
        new pnb.pbo1.uts.UTS();
    }
}