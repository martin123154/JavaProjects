package test.java;

import static org.junit.Assert.*;

import java.util.List;

import main.java.com.mzelek.jdbc.model.Przedstawienie;
import main.java.com.mzelek.jdbc.model.PrzedstawienieManager;

import org.junit.Test;

public class PrzedstawienieManagerTest {

PrzedstawienieManager przedstawienieManager = new PrzedstawienieManager();
	

	private final static String TYTUL_1 = "Damy i Huzary";
	private final static String DATA_ROZP_1 = "2015-10-10 12:30";
	private final static String DATA_ZAK_1 = "2015-10-10 14:30";
	private final static String ZaktualizowanyTytul = "Dom Z�y";
	private final static String ZaktualizowanaDataRozp = "2015-10-10 12:30";
	private final static String ZaktualizowanaDataZaK = "2015-10-10 15:30";
	
	@Test
	public void Po��cz(){
		assertNotNull(przedstawienieManager.getConnection());
	}
	
	@Test
	public void Dodaj(){
		
		Przedstawienie przedstawienie = new Przedstawienie(TYTUL_1, DATA_ROZP_1, DATA_ZAK_1);
		
		przedstawienieManager.Wyczy��TabelePrzedstawienie();
		assertEquals(1,przedstawienieManager.DodajPrzedstawienie(przedstawienie));
		
		List<Przedstawienie> przedstawienia = przedstawienieManager.Poka�Przedstawienie();
		Przedstawienie przedstawienieRetrieved = przedstawienia.get(0);
		
		assertEquals(TYTUL_1, przedstawienieRetrieved.getTytul());
		assertEquals(DATA_ROZP_1, przedstawienieRetrieved.getData_rozp());
		assertEquals(DATA_ZAK_1, przedstawienieRetrieved.getData_zak());
	}
	
	@Test 
	public 	void Zmie�()
	{
	Przedstawienie przedstawienie = new Przedstawienie(TYTUL_1, DATA_ROZP_1, DATA_ZAK_1);
		
		przedstawienieManager.Wyczy��TabelePrzedstawienie();
		assertEquals(1,przedstawienieManager.DodajPrzedstawienie(przedstawienie));
		
		List<Przedstawienie> przedstawienia = przedstawienieManager.Poka�Przedstawienie();
		Przedstawienie przedstawienieRetrieved = przedstawienia.get(0);
		
		przedstawienieRetrieved.setTytul(ZaktualizowanyTytul);
		przedstawienieRetrieved.setData_rozp(ZaktualizowanaDataRozp);
		przedstawienieRetrieved.setData_zak(ZaktualizowanaDataZaK);
		
		assertEquals(1, przedstawienieManager.Zmie�Przedstawienie(przedstawienieRetrieved));
		
		List<Przedstawienie> przedstawienia2 = przedstawienieManager.Poka�Przedstawienie();
		Przedstawienie przedstawienieRetrieved2 = przedstawienia2.get(0);
		
		assertEquals(ZaktualizowanyTytul, przedstawienieRetrieved2.getTytul());
		assertEquals(ZaktualizowanaDataRozp, przedstawienieRetrieved2.getData_rozp());
		assertEquals(ZaktualizowanaDataZaK, przedstawienieRetrieved2.getData_zak());
	}
	
	@Test
	public void Usu�jeden()
	
	{
	Przedstawienie przedstawienie = new Przedstawienie(TYTUL_1, DATA_ROZP_1, DATA_ZAK_1);
		
		przedstawienieManager.Wyczy��TabelePrzedstawienie();
		assertEquals(1,przedstawienieManager.DodajPrzedstawienie(przedstawienie));
		
		List<Przedstawienie> przedstawienia = przedstawienieManager.Poka�Przedstawienie();
		Przedstawienie przedstawienieRetrieved = przedstawienia.get(0);
		assertEquals(1, przedstawienieManager.Usu�jedenrekordPrzedstawienie(przedstawienieRetrieved));

		
	}
	@Test
	public void Usu�Wszystko()
	{
		Przedstawienie przedstawienie = new Przedstawienie(TYTUL_1, DATA_ROZP_1, DATA_ZAK_1);
		
		przedstawienieManager.Wyczy��TabelePrzedstawienie();
		assertEquals(1,przedstawienieManager.DodajPrzedstawienie(przedstawienie));
		
		List<Przedstawienie> przedstawienia = przedstawienieManager.Poka�Przedstawienie();
		Przedstawienie przedstawienieRetrieved = przedstawienia.get(0);
		
		assertEquals(TYTUL_1, przedstawienieRetrieved.getTytul());
		assertEquals(DATA_ROZP_1, przedstawienieRetrieved.getData_rozp());
		assertEquals(DATA_ZAK_1, przedstawienieRetrieved.getData_zak());
		przedstawienieManager.Wyczy��TabelePrzedstawienie();
	}
	@Test
	public void DropTable()
	{
		przedstawienieManager.DropTablePrzedstawienie();
	}
	
}
