package pnb.pbo1.js;

import pnb.pbo1.js.helper.City;
import pnb.pbo1.utils.Jobsheet;

public class Enam {

    // Instansiasi 2 Object, city dan jobsheet (js hanya untuk template output)
    Jobsheet js = new Jobsheet("Jobsheet 6");
    City city = new City("Dubai", 71);

    // Constructor untuk dipanggil di Main.java
    public Enam() {
        nomer1();
    }

    private void nomer1() {
        System.out.println(js.soal("""
                Terdapat Class City yang memiliki dua property yaitu name dan temperature.
                Class Solution juga memiliki method showWeather yang menampilkan
                informasi tentang cuaca kota yang diteruskan sebagai argumen untuk method
                tersebut. Terapkan method showWeather, yang akan menampilkan informasi
                dalam format berikut: Today’s temperature in [nama kota] is [suhu kota]
                Persyaratan:
                • Jangan mengubah City class.
                • Kelas Solution harus memiliki metode showWeather dengan parameter City.
                • Metode showWeather harus menggunakan getter dari kelas City.
                • Metode showWeather harus menampilkan teks pada konsol sesuai dengan
                  kondisi tugas.
                """));
        // method dari jawaban di soal
        Solution.showWeather(city);
    }

}

/**
 * Class Solution untuk melakukan showWeather
 */
class Solution {

    // Method yang menjadi jawaban dari pertanyaan nomer1()
    protected static void showWeather(City city) {
        System.out.printf("Today's temperature in %s is %s. \n", city.getName(),
                city.getTemperature());
        System.out.println();
    }
}

