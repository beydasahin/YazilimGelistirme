package tr.edu.medipol.yazgel.HesaplamaApp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ToplamaTest {

	@Test
	public void testPozitifSayiToplama() {
		
		Hesap toplama = new Toplama();
		String sayi1 = "100";
		String sayi2 = "12";
		String sonuc = toplama.sonucuBul(sayi1, sayi2);
		
		assertEquals("112",sonuc);
	}
	
public void testNegaatifSayiToplama() {
		
		Hesap toplama = new Toplama();
		String sayi1 = "-100";
		String sayi2 = "-12";
		String sonuc = toplama.sonucuBul(sayi1, sayi2);
		
		assertEquals("-112",sonuc);
	}
}
