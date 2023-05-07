package pnb.pbo1.js;

import pnb.pbo1.utils.Jobsheet;

/**
 * Abstract dan class untuk nomer 1
 * @abstract : A
 * @class : B, C
 */
abstract class A {

	abstract void firstMethod();

	void secondMethod() {
		System.out.println("SECOND");
		firstMethod();
	}
}

abstract class B extends A {

	void firstMethod() {
		System.out.println("FIRST");
		thirdMethod();
	}

	abstract void thirdMethod();
}

class C extends B {

	@Override
	void thirdMethod() {
		System.out.println("THIRD");
	}
}

/**
 * Interface dan class untuk nomer 2
 * @interface P, Q
 * @class R
 */
interface  P {

	String p = "PPPP";

	String methodP();
}

interface Q extends P {

	String q = "QQQQ";

	String methodQ();
}

class R implements P, Q {

	@Override
	public String methodP() {
		return q + p;
	}

	@Override
	public String methodQ() {
		return p + q;
	}
}

/**
 * Interface dan Class untuk nomer 3
 * @interface : X
 * @class : Y
 */
interface X {

	char c = 'A';

	char methodX();
}

class Y implements X {

	static {
		System.out.println("Ini Static block: " + c);
	}

	public char methodX() {
		char c = this.c;
		return ++c;
	}
}

/**
 * Interface dan Class untuk nomer 4
 * @interface : X2
 * @class : Y2, Z
 */
interface X2 {

	void method();
}

class Y2 {

	public void method() {
		System.out.println("CLASS Y2");
	}
}

class Z extends Y2 implements X2 {}

/**
 * Main class Jobsheet 9
 * @author Prajna Paramahansa
 */
public class Sembilan {

	Jobsheet js = new Jobsheet("Jobsheet 9");
	public Sembilan() {
		satu();
		dua();
		tiga();
		empat();
	}

	private void satu() {
		C c = new C();
		System.out.println(js.soal("""
				Jelaskan apa yang terjadi pada source code dibawah ini!
				"""));
		System.out.println("Hasil output:");
		c.firstMethod();
		c.secondMethod();
		c.thirdMethod();
		System.out.println();
	}

	private void dua() {
		Q r = new R();
		System.out.println(js.soal("""
				Jelaskan apa yang terjadi pada source code dibawah ini!
				"""));
		System.out.println("Hasil output:");
		System.out.println(r.methodP());
		System.out.println(r.methodQ() + "\n");
	}

	private void tiga() {
		X y = new Y();
		System.out.println(js.soal("""                                     
				Jelaskan apa yang terjadi pada source code dibawah ini!
				"""));
		System.out.println("Hasil output:");
		System.out.println(y.methodX());
		System.out.println(y.c);
		System.out.println(X.c + "\n");
	}

	private void empat() {
		X2 x2 = new Z();
		System.out.println(js.soal("""                                     
				Jelaskan apa yang terjadi pada source code dibawah ini!
				"""));
		System.out.println("Hasil output:");
		x2.method();
		System.out.println();
	}
}