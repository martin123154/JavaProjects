package com.teatr.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQueries({
        @NamedQuery(name = "przedstawienie.getAll", query = "Select p from Przedstawienie p"),
        @NamedQuery(name = "przedstawienie.getByID", query = "Select p from Przedstawienie p where p.idPrzedstawienie = :idPrzedstawienie"),
        @NamedQuery(name = "przedstawienie.getByIdScena", query = "Select p from Przedstawienie p where p.scena = :idScena"),
       
})
public class Przedstawienie {

    private Long idPrzedstawienie;
    private String tytul;       
    private String data_rozp;
    private String data_zak;  

    private Scena scena;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getIdPrzedstawienie() {
        return idPrzedstawienie;
    }
    public void setIdPrzedstawienie(Long idPrzedstawienie) {
        this.idPrzedstawienie = idPrzedstawienie;
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

    @ManyToOne
    @JoinColumn(name = "idScena")
    public Scena getScena() {
        return scena;
    }
    public void setScena(Scena scena) {
        this.scena = scena;
    }


   

}
