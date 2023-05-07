package pnb.pbo1.uts.utils;

import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class HotelBintang7 {

	protected BigInteger jumlahBiaya;
	protected BigInteger jumlahKamar;

	Locale indoCurrency = new Locale("id", "ID");
	protected NumberFormat rupiah = NumberFormat.getCurrencyInstance(indoCurrency);

	protected HotelBintang7(BigInteger biaya, BigInteger kamar) {
		this.jumlahBiaya = biaya;
		this.jumlahKamar = kamar;
	}

	public abstract void infoFasilitas();

	protected abstract void fasilitasTermewah();

	protected abstract BigInteger biayaPenginapan();

	protected abstract BigInteger jumlahKamar();

	protected abstract String tipeKamar();

	protected abstract String restaurant();

	protected abstract String service();
}
