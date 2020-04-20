package tr.edu.medipol.Mebis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Anasayfa")
public class TestBolumu {
	@Test
	
	public void tumOgrencilerTest() {
	
	List<String> ogrenciler = new ArrayList<>();
		 {
			 String ogrencİsim1 ="Beyda";
			 String ogrencİsim2 ="Ahmet";
			 String ogrencİsim3 ="Melek";
			 String ogrencİsim4 ="Memet";
			 String ogrencİsim5 ="Memati";
			 String ogrencİsim6 ="Muhtarim";
		ogrenciler.add(ogrencİsim1);
		ogrenciler.add(ogrencİsim2);
		ogrenciler.add(ogrencİsim3);
		ogrenciler.add(ogrencİsim4);
		ogrenciler.add(ogrencİsim5);
		ogrenciler.add(ogrencİsim6);
			assertEquals("Beyda",ogrencİsim1);
			assertEquals("Ahmet",ogrencİsim2);
			assertEquals("Melek",ogrencİsim3);
			assertEquals("Memet",ogrencİsim4);
			assertEquals("Memati",ogrencİsim4);
			assertEquals("Muhtarim",ogrencİsim4);
		}
	}
@GetMapping("/ogrenciEkle/{ogrenciAdi}")
@Test
public void   OgrenciEklemeTest() {
	List<String> ogrenciler = new ArrayList<>();
	 {
		 String ogrencİsim1 ="Beyda";
		 String ogrencİsim2 ="Ahmet";
		 String ogrencİsim3 ="Melek";
		 String ogrencİsim4 ="Memet";
		 String ogrencİsim5 ="Memati";
		 String ogrencİsim6 ="Muhtarim";
	 }
	 String yeniogrenci="Selim";
	 ogrenciler.add(yeniogrenci);
	 //Then
	 assertEquals(yeniogrenci,"Selim");
}
@GetMapping("/ogrenciSil/{ogrenciAdi}")
@Test	
public void OgrenciSilmeTesti() {
		List<String> ogrenciler = new ArrayList<>();
		 {
			 String ogrencİsim1 ="Beyda";
			 String ogrencİsim2 ="Ahmet";
			 String ogrencİsim3 ="Melek";
			 String ogrencİsim4 ="Memet";
			 String ogrencİsim5 ="Memati";
			 String ogrencİsim6 ="Muhtarim";
			 ogrenciler.remove(ogrencİsim3);
			 assertEquals(ogrencİsim1,"Beyda");
		 }			
}
@GetMapping("/ogrenciGuncelle")
@Test
public void OgrenciGuncellemeTesti() {
	List<String> ogrenciler = new ArrayList<>();
	 {
		 String ogrencİsim1 ="Beyda";
		 String ogrencİsim2 ="Ahmet";
		 String ogrencİsim3 ="Melek";
		 String ogrencİsim4 ="Memet";
		 String ogrencİsim5 ="Memati";
		 String ogrencİsim6 ="Muhtarim";
		 ogrencİsim1 = "Beyda";
		 ogrenciler.remove(ogrencİsim1);
			ogrenciler.add(ogrencİsim1);
			assertEquals(ogrencİsim4,"Memet");	
	 } 
}
@GetMapping("/ogrenciNotEkleVeGuncelle")
@Test
public void ogrenciNotEklemeGuncellemeTesti() {
	List<String> ogrenciler = new ArrayList<>();
	 {
		 String ogrencİsim1 ="Beyda";
		 String ogrencİsim2 ="Ahmet";
		 String ogrencİsim3 ="Melek";
		 String ogrencİsim4 ="Memet";
		 String eklenenNot="50";
		 String guncelNot ="80";		
		 ogrenciler.remove(ogrencİsim1+" "+eklenenNot);
			ogrenciler.add(ogrencİsim1+" "+eklenenNot.replace(eklenenNot, guncelNot));
			ogrenciler.remove(ogrencİsim1+" "+eklenenNot);
			assertEquals(ogrencİsim2,"Ahmet");
			assertEquals(eklenenNot,"50");
			assertEquals(guncelNot,"80");
			
	 }
	
}

}
