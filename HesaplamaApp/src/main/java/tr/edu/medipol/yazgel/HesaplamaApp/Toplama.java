package tr.edu.medipol.yazgel.HesaplamaApp;

import java.math.BigDecimal;

public class Toplama implements Hesap{

	@Override
	public String sonucuBul(String sayi1, String sayi2) {
		// TODO Auto-generated method stub
		return new BigDecimal(sayi1).add(new BigDecimal(sayi2)).toString();
	}

}
