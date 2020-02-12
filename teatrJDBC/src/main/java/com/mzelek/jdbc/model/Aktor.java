package main.java.com.mzelek.jdbc.model;

public class Aktor {
//pola
	private int aktor_id = 1;
	private String imie;
	private String nazwisko;
	private String pesel;
	public Aktor() {}
	//konstruktor
	public Aktor (String imie, String nazwisko, String pesel)
	{
		super();
		this.setImie(imie);
		this.setNazwisko(nazwisko);
		this.setPesel(pesel);
	}
	
	//gettery i settery
	public int getAktor_id() {
		return aktor_id;
	}
	public void setAktor_id(int aktor_id) {
		this.aktor_id = aktor_id;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
}
	
	
