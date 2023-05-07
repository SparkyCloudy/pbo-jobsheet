package pnb.pbo1.uts.hotel;

import java.math.BigInteger;

public class FlowerEast extends pnb.pbo1.uts.utils.HotelBintang7 {

	public FlowerEast(BigInteger biaya, BigInteger kamar) {
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
		System.out.println("""
				•One Complex Villa & Residences
				""");
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
				• Premium Suite
				• Deluxe Suite
				• Executive Suite
				""";
	}

	@Override
	protected String restaurant() {
		return "• (tidak ada) \n";
	}

	@Override
	protected String service() {
		return """
				• Harbour City
				• Beauty & Spa
				• Cafe
				• Fallin Waters Golf Club & Residences
				""";
	}
}
