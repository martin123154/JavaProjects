package main.java.com.mzelek.jdbc.model;

	//import java.util.Date;

	public class Przedstawienie {
//pola
		private int przedstawienie_id = 1;
		private String tytul;
		private String data_rozp;
		private String data_zak;

		public Przedstawienie ()
		{
		
		}
		
		//konstruktor
	public Przedstawienie (String tytul, String data_rozp, String data_zak)
	{
		super();
		this.setTytul(tytul);
		this.setData_rozp(data_rozp);
		this.setData_zak(data_zak);
	}
//gettery i settery
	public int getPrzedstawienie_id() {
		return przedstawienie_id;
	}
	public void setPrzedstawienie_id(int przedstawienie_id) {
		this.przedstawienie_id = przedstawienie_id;
	}

	public String getTytul() {
		return tytul;
	}
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public String getData_rozp() {
		return data_rozp;
	}
	public void setData_rozp(String data_rozp) {
		this.data_rozp = data_rozp;
	}
	public String getData_zak() {
		return data_zak;
	}
	public void setData_zak(String data_zak) {
		this.data_zak = data_zak;
	}


	}
