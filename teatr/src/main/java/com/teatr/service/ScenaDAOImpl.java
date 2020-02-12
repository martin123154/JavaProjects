package com.teatr.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.teatr.ScenaDAO;
import com.teatr.domain.Scena;

@Stateless
public class ScenaDAOImpl implements ScenaDAO {

    @PersistenceContext
    EntityManager em;

    public Scena addScena(Scena scena)
    {
        em.persist(scena);
        em.flush();

        return scena;
    }

    public void deleteScena(Scena scena)
    {
        em.remove(em.getReference(Scena.class, scena.getIdScena()));
    }

    public Scena updateScena(Scena scena)
    {
        return (Scena)em.merge(scena);
    }

    public List<Scena> getAllSceny()
    {
        return em.createNamedQuery("scena.getAll").getResultList();
    }

    public Scena getScenaByID(Long id)
    {
        return em.find(Scena.class, id);
    }
}
