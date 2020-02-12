package test.java;
import static org.junit.Assert.*;




import main.java.com.mzelek.jdbc.model.Scena;
import main.java.com.mzelek.jdbc.model.ScenaManager;

import org.junit.Test;
public class ScenaManagerTest {
	ScenaManager scenaManager = new ScenaManager();
	private final static String NAZWA = "CZERWONA";
	private final static int PRZEDSTAWIENIE_ID = 1;
	
	@Test
	public void checkConnection(){
		assertNotNull(scenaManager.getConnection());
	}
	
	   @Test
	    public void szukajScenypoPrzedstawieniu()
	    {
			Scena scena = new Scena (NAZWA, PRZEDSTAWIENIE_ID);
			scenaManager.wyczyœæTabeleScena();
			Scena scenaRetrieved = null;
			assertEquals(1,scenaManager.DodajScene(scena));
			
			scena = scenaManager.Poka¿Scene().get(0);
			scenaRetrieved = scenaManager.pokazScenePoPrzedstawieniu(scena);
			

	        assertEquals(scena.getScena_id(), scenaRetrieved.getScena_id());
	        assertEquals(scena.getNazwa(), scenaRetrieved.getNazwa());
	    }

}
