package com.teatr.service;

import com.teatr.PrzedstawienieDAO;
import com.teatr.domain.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class PrzedstawienieDAOImpl implements PrzedstawienieDAO {

    @PersistenceContext
    EntityManager em;

    public Przedstawienie addPrzedstawienie(Przedstawienie przedstawienie)
    {
        em.persist(przedstawienie);
        em.flush();

        return przedstawienie;
    }

    public void deletePrzedstawienie(Przedstawienie przedstawienie)
    {
        em.remove(em.getReference(Przedstawienie.class, przedstawienie.getIdPrzedstawienie()));
    }

    public Przedstawienie updatePrzedstawienie(Przedstawienie przedstawienie)
    {
        return (Przedstawienie)em.merge(przedstawienie);
    }

    public List<Przedstawienie> getAllPrzedstawienia()
    {
        return em.createNamedQuery("przedstawienie.getAll").getResultList();
    }

    public Przedstawienie getPrzedstawienieByID(Long id)
    {
        return em.find(Przedstawienie.class, id);
    }

    public List<Przedstawienie> getPrzedstawieniaByScenaID(Scena scena)
    {
        return em.createNamedQuery("przedstawienie.getByIdScena").setParameter("idScena", scena.getIdScena()).getResultList();
    }


}