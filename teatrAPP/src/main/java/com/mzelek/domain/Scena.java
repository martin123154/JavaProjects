package main.java.com.mzelek.domain;

public class Scena {

	private int scena_id;
	private String nazwa;
	private String wielkosc;
	private int numer;
	public Scena() {}
	
	public Scena (String nazwa, String wielkosc, int numer)
	{
		super();
		this.nazwa = nazwa;
		this.wielkosc = wielkosc;
		this.numer = numer;
	}
	
	public int getScena_id() {
		return scena_id;
	}
	public void setScena_id(int scena_id) {
		this.scena_id = scena_id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getWielkosc() {
		return wielkosc;
	}
	public void setWielkosc(String wielkosc) {
		this.wielkosc = wielkosc;
	}
	public int getNumer() {
		return numer;
	}
	public void setNumer(int numer) {
		this.numer = numer;
	}
}
