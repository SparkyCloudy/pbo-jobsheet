package pnb.pbo1.latihan.dua;

import pnb.pbo1.latihan.dua.helper.Cat;
import pnb.pbo1.utils.Latihan;

public class Dua {
    private final Latihan lat = new Latihan("Latihan 2");

    public Dua() {
        nomer1();
    }

    private void nomer1() {
        System.out.println(lat.soal("""
                Silakan modifikasi class Cat dari https://codegym.cc/groups/posts/getters-and-setters
                agar dapat menampilkan error ketika membuat object baru seperti contoh:
                Cat smudge = new Cat ("", -1000, -1000)
                                
                error yang ditampilkan:
                Error! Name can't be empty.
                Error! Age can't be negative.
                Error! Weight can't be negative.
                                
                Tambahkan juga kondisi tersebut pada method setName(String name) dan setWeight(int weight);
                pembuktian ketika menjalankan program:
                smudge.getName menampilkan null
                smudge.getAge menampilkan 0
                smudge.getWeight menampilkan 0
                """));
        var cat = new Cat("", -1000, -1000, false);
        System.out.printf("Cat's object: %s \n", cat);
        System.out.printf("Cat's object counter: %s \n", cat.getObjectCounter());
        System.out.printf("Cat's name: %s \n", cat.getName());
        System.out.printf("Cat's age: %s \n", cat.getAge());
        System.out.printf("Cat's weight: %s \n", cat.getWeight());
        System.out.println();

        System.out.printf("Cat's object: %s \n", cat);
        System.out.printf("Cat's object counter: %s \n",
                cat.getObjectCounter());
        System.out.printf("Cat's name: %s \n", cat.getName());
        System.out.printf("Cat's age: %s \n", cat.getAge());
        System.out.printf("Cat's weight: %s \n", cat.getWeight());
        System.out.println();

        cat.setterStatus("Smudge", 5, 4);
        System.out.printf("Cat's object: %s \n", cat);
        System.out.printf("Cat's object counter: %s \n",
                cat.getObjectCounter());
        System.out.printf("Cat's name: %s \n", cat.getName());
        System.out.printf("Cat's age: %s \n", cat.getAge());
        System.out.printf("Cat's weight: %s \n", cat.getWeight());
        System.out.println();

        cat.setterStatus("Shiro", -10000, 5);
        System.out.printf("Cat's object: %s \n", cat);
        System.out.printf("Cat's object counter: %s \n",
                cat.getObjectCounter());
        System.out.printf("Cat's name: %s \n", cat.getName());
        System.out.printf("Cat's age: %s \n", cat.getAge());
        System.out.printf("Cat's weight: %s \n", cat.getWeight());
        System.out.println();
    }
}
