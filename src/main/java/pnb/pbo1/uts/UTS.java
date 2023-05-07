package pnb.pbo1.uts;

import pnb.pbo1.uts.hotel.*;
import pnb.pbo1.uts.utils.*;

import java.math.BigInteger;

import java.util.Scanner;

public class UTS {

	Scanner input = new Scanner(System.in);

	public UTS() {
		initProgram();
	}

	private void initProgram() {
		System.out.println("""
				Silahkan pilih informasi mengenai Hotel!
				1. Pangu 7 Star Hotel
				2. The Flower of the Eas Kish Island
				3. Burj al Arab Hotel
				""");
		System.out.print("Pilihan: ");

		int pilihan = input.nextInt();
		switch (pilihan) {
			case 1 -> info(new Pangu(new BigInteger("10000000"),
					new BigInteger("234")));
			case 2 -> info(new FlowerEast(new BigInteger("50000000"),
					new BigInteger("200")));
			case 3 -> info(new BurjArab(new BigInteger("250000000"),
					new BigInteger("202")));
			default -> {
				System.out.println("Pilihan hanya ada 3! \n");
				initProgram();
			}
		}
	}

	private void info(HotelBintang7 hotelName) {
		hotelName.infoFasilitas();
	}
}
