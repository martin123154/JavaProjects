package com.mzelek.hibernate.model.domain;

import javax.persistence.*;

@Entity
@NamedQueries({
      @NamedQuery(name = "Przedstawienie.getAll", query = "SELECT p FROM Przedstawienie p"),
  	@NamedQuery(name = "Przedstawienie.getByTytul", query = "Select p from Przedstawienie p where p.tytul= :tytul")
})

public class Przedstawienie implements java.io.Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
  private String tytul;
  private String data_rozp;
  private String data_zak;
  

	public Przedstawienie(){}
	
	public Przedstawienie(String tytul, String data_rozp, String data_zak){
		this.tytul = tytul;
		this.data_rozp = data_rozp;
		this.data_zak = data_zak;
	}
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

@Column(nullable = false)
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

  