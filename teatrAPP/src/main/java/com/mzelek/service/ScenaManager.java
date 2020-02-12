package main.java.com.mzelek.service;

import java.util.ArrayList;
import java.util.List;

import main.java.com.mzelek.domain.Scena;
public class ScenaManager {

	private List<Scena> sceny = new ArrayList<Scena>();
	private int idScena = 0;
	public void add(Scena scena) {
		Scena nowaScena = new Scena(scena.getNazwa(), scena.getWielkosc(), scena.getNumer() );
		idScena++;
		nowaScena.setScena_id(idScena);
		sceny.add(nowaScena);
	}
	
	public List<Scena> getAllScena() {
		return sceny;
	}
}
