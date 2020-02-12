package test.java;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;




import org.junit.Test;

import main.java.com.mzelek.jdbc.model.*;

public class WystepManagerTest {
	AktorManager aktorManager = new AktorManager();
	PrzedstawienieManager przedstawienieManager = new PrzedstawienieManager();
	WystepManager wystepManager = new WystepManager();
	
	private final static int aktor_id = 1;
	private final static int przedstawienie_id = 1;
	private final static int aktor_id_2 = 2;
	private final static int przedstawienie_id_31 = 3;
	private final static int aktor_id_3 = 2;
	private final static int przedstawienie_id_3 = 3;
	private final static int aktor_id_4 = 2;
	private final static int przedstawienie_id_4 = 3;
	private final static int aktor_id_5 = 2;
	private final static int przedstawienie_id_5 = 3;
	private final static String IMIE_3 = "Mariusz";
	private final static String NAZWISKO_3 = "Kalamaga";
	private final static String PESEL_3 = "94111307333";
	private final static String TYTUL_3 = "Damy i Koszary";
	private final static String DATA_ROZP_3 = "2015-11-11 12:30";
	private final static String DATA_ZAK_3 = "2015-11-11 14:30";



@Test
public void checkConnection(){
	assertNotNull(WystepManager.getConnection());
}

@Test
public void DodajAktora(){
	Aktor aktor = new Aktor(IMIE_3, NAZWISKO_3, PESEL_3);
	
	aktorManager.WyczyœæTabeleAktor();
	assertEquals(1,aktorManager.DodajAktora(aktor));
	
	
	List<Aktor> aktorzy = aktorManager.Poka¿Aktora();
	
	
	Aktor aktorRetrieved = aktorzy.get(0);
	
	
	
	assertEquals(IMIE_3, aktorRetrieved.getImie());
	assertEquals(NAZWISKO_3, aktorRetrieved.getNazwisko());
	assertEquals(PESEL_3, aktorRetrieved.getPesel());
}
@Test
public void DodajPrzedstawienie(){
	Przedstawienie przedstawienie = new Przedstawienie(TYTUL_3, DATA_ROZP_3, DATA_ZAK_3);
	
	przedstawienieManager.WyczyœæTabelePrzedstawienie();
	assertEquals(1,przedstawienieManager.DodajPrzedstawienie(przedstawienie));
	
	List<Przedstawienie> przedstawienia = przedstawienieManager.Poka¿Przedstawienie();
	Przedstawienie przedstawienieRetrieved = przedstawienia.get(0);
	
	assertEquals(TYTUL_3, przedstawienieRetrieved.getTytul());
	assertEquals(DATA_ROZP_3, przedstawienieRetrieved.getData_rozp());
	assertEquals(DATA_ZAK_3, przedstawienieRetrieved.getData_zak());
}

@Test

public void dodajWystep(){
	Wystep wystep = new Wystep(aktor_id, przedstawienie_id);
	Wystep wystepek = new Wystep(aktor_id_2, przedstawienie_id);
	Wystep wystep3 = new Wystep(aktor_id_2, przedstawienie_id_31);
	
	WystepManager.wyczyscTabeleWystep();
	assertEquals(1, WystepManager.dodajWystep(wystep));
	assertEquals(1, WystepManager.dodajWystep(wystepek));
	assertEquals(1, WystepManager.dodajWystep(wystep3));
	WystepManager.wyczyscTabeleWystep();
			
	
}
@Test
public void ZnajdzAktoraPoPrzedstawieniu()
{
	Wystep wystep = new Wystep(aktor_id, przedstawienie_id);
	WystepManager.wyczyscTabeleWystep();
	Wystep wystepRetrieved = null;
	assertEquals(1,WystepManager.dodajWystep(wystep));
	wystep = WystepManager.pokazWystep().get(0);
	wystepRetrieved = wystepManager.pokazAktoraPoPrzedstawieniu(wystep);
	
    assertEquals(wystep.getAktor_id(), wystepRetrieved.getAktor_id());
    assertEquals(wystep.getPrzedstawienie_id(), wystepRetrieved.getPrzedstawienie_id());
}

@Test
    public void ZnajdzWystepPoAktorze(){
    	Wystep wystep = new Wystep(aktor_id, przedstawienie_id);
    	Wystep wystep2 = new Wystep(aktor_id_2, przedstawienie_id_31);
    	Wystep wystep3 = new Wystep(aktor_id_3, przedstawienie_id_3);
    	Wystep wystep4 = new Wystep(aktor_id_4, przedstawienie_id_4);
    	Wystep wystep5 = new Wystep(aktor_id_5, przedstawienie_id_5);
    	WystepManager.wyczyscTabeleWystep();
    
    	assertEquals(1,WystepManager.dodajWystep(wystep));
    	assertEquals(1,WystepManager.dodajWystep(wystep2));
    	assertEquals(1,WystepManager.dodajWystep(wystep3));
    	assertEquals(1,WystepManager.dodajWystep(wystep4));
    	assertEquals(1,WystepManager.dodajWystep(wystep5));
   
    	List<Wystep> wystepy = WystepManager.pokazWystep();
    
    	assertEquals(5, wystepy.size());

    	List<Wystep> wystepy2 = wystepManager.pokazWystepPoAktorze(wystep2);
    	assertEquals(4, wystepy2.size());
    	
    	//List<Wystep> wystepy2 = wystepManager.pokazWystepPoAktorze(
    	
   
    	//  assertEquals(wystep.getAktor_id(), wystepRetrieved.getAktor_id());
    		 
    
	 
    	
    	  

    	}
 
    


	
@Test
public void usunWystep(){
	Wystep wystep = new Wystep(aktor_id, przedstawienie_id);
	WystepManager.wyczyscTabeleWystep();
	assertEquals(1, WystepManager.dodajWystep(wystep));
	
	List<Wystep> wystepy = WystepManager.pokazWystep();
	Wystep wystepRetrieved = wystepy.get(0);
	assertEquals(1, WystepManager.UsunjedenrekordWystep(wystepRetrieved));
	
	
	List<Wystep> wystepy2 = WystepManager.pokazWystep();
	assertEquals(0, wystepy2.size());
}	

@Test
public void DropTable()
{
	wystepManager.dropTableWystep();
}

	
}

