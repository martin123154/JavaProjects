package main.java.com.mzelek.jdbc.model;
//pola
public class Wystep {
private int aktor_id = 1;
private int przedstawienie_id = 1;
//konstruktor

public Wystep()
{
	
}
public Wystep (int aktor_id, int przedstawienie_id)
{
	this.setAktor_id(aktor_id);
	this.setPrzedstawienie_id(przedstawienie_id);
	
}    
//gettery i settery
public int getAktor_id() {
	return aktor_id;
}
public void setAktor_id(int aktor_id) {
	this.aktor_id = aktor_id;
}

public int getPrzedstawienie_id() {
	return przedstawienie_id;
}
public void setPrzedstawienie_id(int przedstawienie_id) {
	this.przedstawienie_id = przedstawienie_id;
}


}