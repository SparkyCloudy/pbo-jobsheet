package pnb.pbo1.uts.hotel;

import java.math.BigInteger;

public class BurjArab extends pnb.pbo1.uts.utils.HotelBintang7 {

	public BurjArab(BigInteger biaya, BigInteger kamar) {
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
	public void fasilitasTermewah() {
		System.out.println("• iPad emas 24 karat bagi para tamu selama " +
				"menginap");
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
				• Royal Suite
				• Jacuzzi Suite
				""";
	}

	@Override
	protected String restaurant() {
		return """
				• Restoran Bawah Laut
				""";
	}

	@Override
	protected String service() {
		return """
				• Service 24 hours in Dining Room
				• Cafe
				• Tour Service
				• Beauty & Spa
				• Golf
				""";
	}
}
