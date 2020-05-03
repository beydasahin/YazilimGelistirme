package tr.edu.medipol.aracyaz.ornekMavenProje;

public class MetinDuzenleme {

	public static void main(String[] args) {
	
		
		
		
		

		String sonuc = new MetinDuzenleme().harfleriBuyut("medipol");
        System.out.println(sonuc);
	}
	
	public String harfleriBuyut(String orjinalMetin) {
		
		return orjinalMetin.toLowerCase();
	}
	

}
