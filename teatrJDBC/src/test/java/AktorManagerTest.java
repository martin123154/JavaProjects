package test.java;

import static org.junit.Assert.*;

import java.util.List;

import main.java.com.mzelek.jdbc.model.Aktor;
import main.java.com.mzelek.jdbc.model.AktorManager;

import org.junit.Test;
public class AktorManagerTest {
	AktorManager aktorManager = new AktorManager();
	

	private final static String IMIE_1 = "Stefan";
	private final static String NAZWISKO_1 = "Burczymucha";
	private final static String PESEL_1 = "94111307437";
	private final static String Zaktualizowane_imie = "Adam";
	private final static String Zaktualizowane_nazwisko = "Nowak";
	private final static String Zaktualizowany_pesel = "94111322237";
	
	
	@Test
	public void Po��cz(){
		assertNotNull(aktorManager.getConnection());
	}
	
	@Test
	public void Dodaj(){
		
		Aktor aktor = new Aktor(IMIE_1, NAZWISKO_1, PESEL_1);
		
		aktorManager.Wyczy��TabeleAktor();
		assertEquals(1,aktorManager.DodajAktora(aktor));
		
		List<Aktor> aktorzy = aktorManager.Poka�Aktora();
		Aktor aktorRetrieved = aktorzy.get(0);
		
		assertEquals(IMIE_1, aktorRetrieved.getImie());
		assertEquals(NAZWISKO_1, aktorRetrieved.getNazwisko());
		assertEquals(PESEL_1, aktorRetrieved.getPesel());
	}
		@Test 
		public 	void Zmie�()
		{
			Aktor aktor = new Aktor(IMIE_1, NAZWISKO_1, PESEL_1);
			aktorManager.Wyczy��TabeleAktor();
			assertEquals(1,aktorManager.DodajAktora(aktor));
			
			List<Aktor> aktorzy = aktorManager.Poka�Aktora();
			Aktor aktorRetrieved = aktorzy.get(0);
			
			aktorRetrieved.setImie(Zaktualizowane_imie);
			aktorRetrieved.setNazwisko(Zaktualizowane_nazwisko);
			aktorRetrieved.setPesel(Zaktualizowany_pesel);
			
			assertEquals(1, aktorManager.Zmie�Aktora(aktorRetrieved));
			
			List<Aktor> aktorzy2 = aktorManager.Poka�Aktora();
			Aktor aktorRetrieved2 = aktorzy2.get(0);
			
			assertEquals(Zaktualizowane_imie, aktorRetrieved2.getImie());
			assertEquals(Zaktualizowane_nazwisko, aktorRetrieved2.getNazwisko());
			assertEquals(Zaktualizowany_pesel, aktorRetrieved2.getPesel());
		
		}
		
		@Test
		public void Usu�jeden()
		
		{
			Aktor aktor = new Aktor(IMIE_1, NAZWISKO_1, PESEL_1);
			aktorManager.Wyczy��TabeleAktor();
			assertEquals(1,aktorManager.DodajAktora(aktor));
			List<Aktor> aktorzy = aktorManager.Poka�Aktora();
			Aktor aktorRetrieved = aktorzy.get(0);
			assertEquals(1, aktorManager.Usu�jedenrekordAktor(aktorRetrieved));

			
		}
		
	@Test
		public void Usu�Wszystko()
		{
			Aktor aktor = new Aktor(IMIE_1, NAZWISKO_1, PESEL_1);
			aktorManager.Wyczy��TabeleAktor();
			assertEquals(1,aktorManager.DodajAktora(aktor));
			
			List<Aktor> aktorzy = aktorManager.Poka�Aktora();
			Aktor aktorRetrieved = aktorzy.get(0);
			
			assertEquals(IMIE_1, aktorRetrieved.getImie());
			assertEquals(NAZWISKO_1, aktorRetrieved.getNazwisko());
			assertEquals(PESEL_1, aktorRetrieved.getPesel());
			
			aktorManager.Wyczy��TabeleAktor();
		}
		@Test
		public void DropTable()
		{
			aktorManager.DropTableAktor();
		}
	
		
	}

