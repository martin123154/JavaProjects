package com.mzelek.hibernate.model.service;

import java.util.List;

import com.mzelek.hibernate.model.domain.Scena;

public interface ScenaManager {
	
	List<Scena> getAllSceny();
	Scena getScenaById(Scena scena);
	void addScena(Scena scena);
	void editScena(Scena scena);
	void removeScena(Scena scena);
}
