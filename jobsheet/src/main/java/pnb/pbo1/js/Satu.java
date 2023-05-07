package pnb.pbo1.js;

import pnb.pbo1.utils.Jobsheet;

public class Satu {
    Jobsheet js = new Jobsheet("Jobsheet 1");
    public Satu() {
        nomer1();
        nomer2();
        nomer3();
    }
    private void nomer1() {
        int num1 = 10;
        float myFloat = 0.1f;

        System.out.println(js.soal("Jelaskan mengapa method nomer1() bisa begini"));
        System.out.printf("%.1f %n", num1 + myFloat);
    }

    private void nomer2() {
        int num1 = 2000000000;
        int num2 = 2000000000;
        float myFloat = 0.1f;

        System.out.println(js.soal("Jelaskan mengapa method nomer2() bisa begini"));
        System.out.printf("%.1f %n", (double) num1 + (double) num2 + myFloat);
    }

    private void nomer3() {
        int num1 = 10;
        int num2 = 3;

        System.out.println(js.soal("Jelaskan mengapa method nomer3() bisa begini"));
        System.out.println(Math.pow(num1, num2) + "\n");
    }
}
