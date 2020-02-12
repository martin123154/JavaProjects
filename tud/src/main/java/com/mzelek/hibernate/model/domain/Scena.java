package com.mzelek.hibernate.model.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

	@Entity
	@NamedQueries({
	        @NamedQuery(name = "Scena.getAll", query = "SELECT s FROM Scena s"),
	})

public class Scena {
    private Long id;
    private String nazwa;
    private String wielkosc;
    private List<Przedstawienie> przedstawienia = new ArrayList<Przedstawienie>();
    
    
public Scena(){}
	
	public Scena(String nazwa, String wielkosc){
		this.nazwa = nazwa;
		this.wielkosc = wielkosc;
	}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Przedstawienie> getPrzedstawienia() {
        return przedstawienia;
    }
  
    public void setPrzedstawienia(List<Przedstawienie> przedstawienia) {
        this.przedstawienia = przedstawienia;
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
}