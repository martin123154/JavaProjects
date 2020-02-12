package main.java.com.mzelek.service;

import java.util.ArrayList;
import java.util.List;

import main.java.com.mzelek.domain.Przedstawienie;

public class PrzedstawienieManager {

	
	private List<Przedstawienie> przedstawienia = new ArrayList<Przedstawienie>();
	private int idPrzedstawienie = 0;
	public void add(Przedstawienie przedstawienie) {
		Przedstawienie nowePrzedstawienie = new Przedstawienie(przedstawienie.getTytul(), przedstawienie.getData_rozp(), przedstawienie.getData_zak(), przedstawienie.getScena_id() );
		idPrzedstawienie++;
		nowePrzedstawienie.setPrzedstawienie_id(idPrzedstawienie);
		przedstawienia.add(nowePrzedstawienie);
	}
	


	public List<Przedstawienie> getAllPrzedstawienie() {
		return przedstawienia;
	}
}
