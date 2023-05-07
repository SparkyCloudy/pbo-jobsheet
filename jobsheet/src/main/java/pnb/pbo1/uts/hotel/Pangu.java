package pnb.pbo1.uts.hotel;

import java.math.BigInteger;

public class Pangu extends pnb.pbo1.uts.utils.HotelBintang7 {

	public Pangu(BigInteger biaya, BigInteger kamar) {
		super(biaya, kamar);
	}

	@Override
	public void infoFasilitas() {
		System.out.println();
		System.out.printf("• Biaya per-Malam: %s \n",
				super.rupiah.format(biayaPenginapan())
		);

		System.out.printf("• Jumlah Kamar: %s \n\n",
				jumlahKamar()
		);

		System.out.printf("Tipe Kamar: \n%s\n",
				tipeKamar()
		);

		System.out.printf("Restoran: \n%s\n",
				restaurant()
		);

		System.out.printf("Service: \n%s\n",
				service()
		);

		System.out.println("Fasilitas Termewah: ");
		fasilitasTermewah();
	}

	@Override
	protected void fasilitasTermewah() {
		System.out.println("• (tidak ada)");
	}

	@Override
	protected BigInteger biayaPenginapan() {
		return super.jumlahBiaya;
	}

	@Override
	protected BigInteger jumlahKamar() {
		return super.jumlahKamar;
	}

	@Override
	protected String tipeKamar() {
		return """
				• Executive Junior Suite
				• Premium Junior Suite
				• Grand Corner Suite
				• Grand Deluxe Suite
				• Premium Corner Suite
				• Premium Suite
				""";
	}

	@Override
	protected String restaurant() {
		return """
				• Chinese Restaurant dengan konsep Chiu Chow dan Cantonese
				  cuisine yang ekslusif \n
				""";
	}

	@Override
	protected String service() {
		return """
				• Service 24 hours in Dining Room
				• Cafe
				• Tour Service
				""";
	}
}
