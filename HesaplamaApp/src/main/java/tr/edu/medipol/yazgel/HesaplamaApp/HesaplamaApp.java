package tr.edu.medipol.yazgel.HesaplamaApp;

public class HesaplamaApp {

	public static void main(String[] args) {
		Hesap toplama = new Toplama();
		String sonuc = toplama.sonucuBul("100", "12");
		System.out.println(sonuc);

	}

}
