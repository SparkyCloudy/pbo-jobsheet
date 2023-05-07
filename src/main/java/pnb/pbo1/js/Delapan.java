package pnb.pbo1.js;

import pnb.pbo1.js.helper.Animal;
import pnb.pbo1.utils.Jobsheet;

public class Delapan {

	Jobsheet js = new Jobsheet("Jobsheet 8");
	public Delapan() {
		System.out.println(js.soal("""
				Class Bat mewarisi Class Animal. Pada saat memanggil method move() pada
				object Bat, method akan menampilkan "I’m running!". Ubahlah method move()
				pada class Bat sehingga menampilkan "I'm flying!". Jangan rubah apapun pada
				main method.
				"""));
		var bat = new Bat();
		bat.move();
	}
}

class Bat extends Animal {
	@Override
	public void move() {
		System.out.println("I'm flying!");
		System.out.println();
	}
}
