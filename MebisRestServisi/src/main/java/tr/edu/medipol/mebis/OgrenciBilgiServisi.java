package tr.edu.medipol.mebis;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciBilgiServisi {
	
	private static List<String> ogrenciler = new ArrayList<>();
	static {
		ogrenciler.add("Gokhan");
		ogrenciler.add("Murat");
		ogrenciler.add("Beyda");
		ogrenciler.add("Simge");
	}
	
	@GetMapping("/tumbilgiler")
	public synchronized List<String> tumBilgiler(){
		return ogrenciler;
	}

	@GetMapping("/ogrenciEkle/{ogrenciAdi}")
	public synchronized List<String> ogrenciEkle(@PathVariable String ogrenciAdi) {
		ogrenciler.add(ogrenciAdi);
		return ogrenciler;
	}
	@GetMapping("/ogrenciSil/{ogrenciAdi}")
	public synchronized List<String> ogrenciSil(@PathVariable String ogrenciAdi) {
		ogrenciler.remove(ogrenciAdi);
		return ogrenciler;
	}
	
	@GetMapping("/ogrenciGuncelle")
	public synchronized List<String> ogrenciGuncelle(@RequestParam String eskiAd, @RequestParam String yeniAd) {
		ogrenciler.remove(yeniAd);
		ogrenciler.add(eskiAd);
		return ogrenciler;

	}
}
