package com.mzelek.hibernate.model.service;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import com.mzelek.hibernate.model.domain.Scena;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/beans.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
@Transactional
public class ScenaManagerTest {

	private final String scena_nazwa = "Czerwona";
	private final String scena_wielkosc = "Wielka";
	private final String scena_nazwa2 = "Zielona";
	private final String scena_wielkosc2 = "Mała";
	
	
	private final List<Long> addedSceny = new ArrayList<Long>();
	
	@Autowired
	ScenaManager scenaM;
	
	   @Before
	    public void checkAddedSceny() {

	        List<Scena> sceny = scenaM.getAllSceny();

	        for(Scena scena : sceny)
	            addedSceny.add(scena.getId());
	    }
	   
	//  @After
	    public void removeSceny() {

	    	List<Scena> sceny = scenaM.getAllSceny();

	        boolean usun;

	        for(Scena scena : sceny) {
	            usun = true;
	            for (Long scena2 : addedSceny)
	                if (scena.getId() == scena2) {
	                usun = false;
	                break;
	                }
	            if(usun)
	                scenaM.removeScena(scena);
	        }
	    }
	   

	//	@Test
		public void checkAddScena(){
			
			int n = scenaM.getAllSceny().size();
			
			Scena scena = new Scena(scena_nazwa, scena_wielkosc);
			scenaM.addScena(scena);
			
			Scena scenaRetrived = scenaM.getScenaById(scena);
			assertEquals(scena.getId(), scenaRetrived.getId());
			assertEquals(scena_nazwa, scenaRetrived.getNazwa());
			assertEquals(scena_wielkosc, scenaRetrived.getWielkosc());
			
			assertEquals(n+1, scenaM.getAllSceny().size());
		}
		
		@Test
		public void checkEditScena(){
			
			Scena scena = new Scena(scena_nazwa, scena_wielkosc);
			scenaM.addScena(scena);
			
			Scena scenaRetrived = scenaM.getScenaById(scena);
			assertEquals(scena.getId(), scenaRetrived.getId());
			assertEquals(scena_nazwa, scenaRetrived.getNazwa());
			assertEquals(scena_wielkosc, scenaRetrived.getWielkosc());
			
			scenaRetrived.setNazwa(scena_nazwa2);
			scenaRetrived.setWielkosc(scena_wielkosc2);
			scenaM.editScena(scenaRetrived);
			
			Scena scenaRetrived2 = scenaM.getScenaById(scenaRetrived);
			assertEquals(scenaRetrived.getId(), scenaRetrived2.getId());
			assertEquals(scena_nazwa2, scenaRetrived2.getNazwa());
			assertEquals(scena_wielkosc2, scenaRetrived2.getWielkosc());
			
		}
	//	@Test
		public void checkRemoveScena() {
			
			Scena scena = new Scena(scena_nazwa, scena_wielkosc);
			scenaM.addScena(scena);
			
			int n = scenaM.getAllSceny().size();
		
			Scena scenaRetrived = scenaM.getScenaById(scena);
			assertEquals(scena.getId(), scenaRetrived.getId());
			assertEquals(scena_nazwa, scenaRetrived.getNazwa());
			assertEquals(scena_wielkosc, scenaRetrived.getWielkosc());
			
			scenaM.removeScena(scena);

			assertNull(scenaM.getScenaById(scenaRetrived));
			assertEquals(n-1, scenaM.getAllSceny().size());
			}
}
