package tr.edu.medipol.aracyaz.ornekMavenProje;

import org.junit.*;

public class MetinDuzenlemeTest {
	@Test
	public void testharfleriBuyut() {
		
		
		MetinDuzenleme m= new MetinDuzenleme();
		String orjinalMetin ="medipol";
		String beklenenSonuc = "MEDİPOL";
		
		String  gercekSonuc= m.harfleriBuyut(orjinalMetin);
		
		Assert.assertEquals(beklenenSonuc, gercekSonuc);
	}
	

}
