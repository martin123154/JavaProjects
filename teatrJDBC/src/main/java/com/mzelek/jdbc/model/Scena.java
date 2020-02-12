package main.java.com.mzelek.jdbc.model;

public class Scena {
	private int scena_id = 1;
	private String nazwa;
	private int przedstawienie_id;

	public Scena() {}
	//konstruktor
	public Scena (String nazwa, int przedstawienie_id)
	{
		super();
		this.setNazwa(nazwa);
		this.setPrzedstawienie_id(przedstawienie_id);
	}
	
	//gettery i settery
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
	public int getPrzedstawienie_id() {
		return przedstawienie_id;
	}
	public void setPrzedstawienie_id(int przedstawienie_id) {
		this.przedstawienie_id = przedstawienie_id;
	}
}