package com.mzelek.hibernate.model.service;

import java.util.List;

import com.mzelek.hibernate.model.domain.Przedstawienie;
import com.mzelek.hibernate.model.domain.Scena;

public interface PrzedstawienieManager {


	List<Przedstawienie> getAllPrzedstawienia();
	Przedstawienie getPrzedstawienieById(Przedstawienie przedstawienie);
	List<Przedstawienie> getPrzedstawienieByTytul(String tytul);
	List<Przedstawienie> getPrzedstawienieByScena(Scena scena);
	void addPrzedstawienie(Przedstawienie przedstawienie);
	void addPrzedstawienieToScena(Przedstawienie przedstawienie, Scena scena);
	void editPrzedstawienie(Przedstawienie przedstawienie);
	void removePrzedstawienie(Przedstawienie przedstawienie);
}
