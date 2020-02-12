package com.teatr.domain;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "scena.getAll", query = "Select s from Scena s"),
        @NamedQuery(name = "scena.getByID", query = "Select s from Scena s where s.idScena = :idScena")
})
public class Scena {

    private Long idScena;
    private String nazwa;
    private String wielkosc;

    private List<Przedstawienie> przedstawienia = new ArrayList<Przedstawienie>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getIdScena() {
        return idScena;
    }
    public void setIdScena(Long idScena) {
        this.idScena = idScena;
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

   

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "scena")
    @JsonIgnore
    public List<Przedstawienie> getPrzedstawienia() {
        return przedstawienia;
    }
    public void setPrzedstawienia(List<Przedstawienie> przedstawienia) {
        this.przedstawienia = przedstawienia;
    }

}
