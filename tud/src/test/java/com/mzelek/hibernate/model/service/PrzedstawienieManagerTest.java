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
import com.mzelek.hibernate.model.domain.Przedstawienie;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/beans.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
@Transactional
public class PrzedstawienieManagerTest {
	
	
	private final String scena_nazwa = "Biała";
	private final String scena_wielkosc = "Niewielka";
	private final String przedstawienie_tytul = "Kanikuły";
	private final String przedstawienie_data_rozp = "11-10-2014 12:30";
	private final String przedstawienie_data_zak = "11-10-2014 14:30";
	private final String przedstawienie_tytul2 = "Ośli plac";
	private final String przedstawienie_data_rozp2 = "11-10-2014 16:30";
	private final String przedstawienie_data_zak2 = "11-10-2014 17:30";
	private final String przedstawienie_tytul3 = "Katamarana";
	private final String przedstawienie_data_rozp3 = "11-10-2014 18:30";
	private final String przedstawienie_data_zak3 = "11-10-2014 20:30";
	
	
	private final List<Long> addedSceny = new ArrayList<Long>();
	private final List<Long> addedPrzedstawienia = new ArrayList<Long>();
	
	@Autowired
	ScenaManager scenaM;
	
	@Autowired
	PrzedstawienieManager przedstawienieM;
	
	 @Before
	    public void checkAdded() {

	        List<Scena> sceny = scenaM.getAllSceny();
	        List<Przedstawienie> przedstawienia = przedstawienieM.getAllPrzedstawienia();

	        for(Scena scena : sceny)
	            addedSceny.add(scena.getId());

	        for(Przedstawienie przedstawienie : przedstawienia)
	            addedPrzedstawienia.add(przedstawienie.getId());
	    }
	
	 @After
	    public void removeAll() {

	    	List<Scena> sceny = scenaM.getAllSceny();
	    	List<Przedstawienie> przedstawienia = przedstawienieM.getAllPrzedstawienia();
	    	
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
	        
	        for(Przedstawienie przedstawienie : przedstawienia) {
	            usun = true;
	            for (Long przedstawienie2 : addedPrzedstawienia)
	                if (przedstawienie.getId() == przedstawienie2) {
	                usun = false;
	                break;
	                }
	            if(usun)
	            	przedstawienieM.removePrzedstawienie(przedstawienie);
	        }
	    }
	 
	 @Test
		public void checkAddPrzedstawienie(){
			
			int n = przedstawienieM.getAllPrzedstawienia().size();
			
			Przedstawienie przedstawienie = new Przedstawienie(przedstawienie_tytul, przedstawienie_data_rozp, przedstawienie_data_zak);
			przedstawienieM.addPrzedstawienie(przedstawienie);
			
			Przedstawienie przedstawienieRetrived = przedstawienieM.getPrzedstawienieById(przedstawienie);
			assertEquals(przedstawienie.getId(), przedstawienieRetrived.getId());
			assertEquals(przedstawienie_tytul, przedstawienieRetrived.getTytul());
			assertEquals(przedstawienie_data_rozp, przedstawienieRetrived.getData_rozp());
			assertEquals(przedstawienie_data_zak, przedstawienieRetrived.getData_zak());
			
			assertEquals(n+1, przedstawienieM.getAllPrzedstawienia().size());
		}
	 
	 @Test
		public void checkEditPrzedstawienie(){
			
		 Przedstawienie przedstawienie = new Przedstawienie(przedstawienie_tytul, przedstawienie_data_rozp, przedstawienie_data_zak);
		 przedstawienieM.addPrzedstawienie(przedstawienie);
			
		 Przedstawienie przedstawienieRetrived = przedstawienieM.getPrzedstawienieById(przedstawienie);
			assertEquals(przedstawienie.getId(), przedstawienieRetrived.getId());
			assertEquals(przedstawienie_tytul, przedstawienieRetrived.getTytul());
			assertEquals(przedstawienie_data_rozp, przedstawienieRetrived.getData_rozp());
			assertEquals(przedstawienie_data_zak, przedstawienieRetrived.getData_zak());
			
			przedstawienieRetrived.setTytul("koszmar");
			przedstawienieRetrived.setData_rozp("11-11-2011");
			przedstawienieRetrived.setData_zak("11-11-2012");
			przedstawienieM.editPrzedstawienie(przedstawienieRetrived);
			
			Przedstawienie przedstawienieRetrived2 = przedstawienieM.getPrzedstawienieById(przedstawienieRetrived);
			assertEquals(przedstawienieRetrived.getId(), przedstawienieRetrived2.getId());
			assertEquals("koszmar", przedstawienieRetrived2.getTytul());
			assertEquals("11-11-2011", przedstawienieRetrived2.getData_rozp());
			assertEquals("11-11-2012", przedstawienieRetrived2.getData_zak());
		}
	 
	 @Test
		public void checkRemovePrzedstawienie(){
			
		 Przedstawienie przedstawienie = new Przedstawienie(przedstawienie_tytul, przedstawienie_data_rozp, przedstawienie_data_zak);
		 przedstawienieM.addPrzedstawienie(przedstawienie);
			
			int n = przedstawienieM.getAllPrzedstawienia().size();
			
			Przedstawienie przedstawienieRetrived = przedstawienieM.getPrzedstawienieById(przedstawienie);
			assertEquals(przedstawienie.getId(), przedstawienieRetrived.getId());
			assertEquals(przedstawienie_tytul, przedstawienieRetrived.getTytul());
			assertEquals(przedstawienie_data_rozp, przedstawienieRetrived.getData_rozp());
			assertEquals(przedstawienie_data_zak, przedstawienieRetrived.getData_zak());
			
			przedstawienieM.removePrzedstawienie(przedstawienie);

			assertNull(przedstawienieM.getPrzedstawienieById(przedstawienieRetrived));
			assertEquals(n-1, przedstawienieM.getAllPrzedstawienia().size());
		}
	
	 @Test
		public void checkAddPrzedstawienieToScena(){
			
		 Przedstawienie przedstawienie = new Przedstawienie(przedstawienie_tytul2, przedstawienie_data_rozp2, przedstawienie_data_zak2);
		 przedstawienieM.addPrzedstawienie(przedstawienie);
			
		 Przedstawienie przedstawienieRetrived = przedstawienieM.getPrzedstawienieById(przedstawienie);
			assertEquals(przedstawienie.getId(), przedstawienieRetrived.getId());
			assertEquals(przedstawienie_tytul2, przedstawienieRetrived.getTytul());
			assertEquals(przedstawienie_data_rozp2, przedstawienieRetrived.getData_rozp());
			assertEquals(przedstawienie_data_zak2, przedstawienieRetrived.getData_zak());
			
			Przedstawienie przedstawienie2 = new Przedstawienie(przedstawienie_tytul2, przedstawienie_data_rozp2, przedstawienie_data_zak2);
			przedstawienieM.addPrzedstawienie(przedstawienie2);
			
			Przedstawienie przedstawienieRetrived2 = przedstawienieM.getPrzedstawienieById(przedstawienie2);
			assertEquals(przedstawienie2.getId(), przedstawienieRetrived2.getId());
			assertEquals(przedstawienie_tytul2, przedstawienieRetrived2.getTytul());
			assertEquals(przedstawienie_data_rozp2, przedstawienieRetrived2.getData_rozp());
			assertEquals(przedstawienie_data_zak2, przedstawienieRetrived2.getData_zak());
			
			Scena scena = new Scena(scena_nazwa, scena_wielkosc);
			scenaM.addScena(scena);
			
			Scena scenaRetrived = scenaM.getScenaById(scena);
			assertEquals(scena.getId(), scenaRetrived.getId());
			assertEquals(scena_nazwa, scenaRetrived.getNazwa());
			assertEquals(scena_wielkosc, scenaRetrived.getWielkosc());
			
			List<Przedstawienie> przedstawieniaOnScena = przedstawienieM.getPrzedstawienieByScena(scenaRetrived);
			int n = przedstawieniaOnScena.size();
			
			przedstawienieM.addPrzedstawienieToScena(przedstawienieRetrived, scenaRetrived);
			przedstawienieM.addPrzedstawienieToScena(przedstawienieRetrived2, scenaRetrived);
			
			assertEquals(n+2, przedstawieniaOnScena.size());
			
			for(Przedstawienie p : przedstawieniaOnScena){
				Przedstawienie przedstawienie3 = przedstawienieM.getPrzedstawienieById(p);
				assertEquals(p.getId(), przedstawienie3.getId());
				assertEquals(p.getTytul(), przedstawienie3.getTytul());
				assertEquals(p.getData_rozp(), przedstawienie3.getData_rozp());
				assertEquals(p.getData_zak(), przedstawienie3.getData_zak());
			}
		}
	
	
	
}
