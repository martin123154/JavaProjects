package com.mzelek.hibernate.model.service;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mzelek.hibernate.model.domain.Przedstawienie;
import com.mzelek.hibernate.model.domain.Scena;

@Component
@Transactional
public class PrzedstawienieManagerImpl implements PrzedstawienieManager {
	
	@Autowired
	private SessionFactory session;
	
	public SessionFactory getSessionFactory(){
		return session;
	}
	
	public void setSessionFactory(SessionFactory session){
		this.session = session;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Przedstawienie> getAllPrzedstawienia() {
		return session.getCurrentSession().getNamedQuery("Przedstawienie.getAll").list();
	}

	@Override
	public Przedstawienie getPrzedstawienieById(Przedstawienie przedstawienie) {
		return (Przedstawienie) session.getCurrentSession().get(Przedstawienie.class, przedstawienie.getId());
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Przedstawienie> getPrzedstawienieByTytul(String tytul) {
		return session.getCurrentSession().getNamedQuery("Przedstawienie.getByTytul").setString("tytul", tytul).list();
	}

	@Override
	public List<Przedstawienie> getPrzedstawienieByScena(Scena scena) {
		Scena s = (Scena) session.getCurrentSession().get(Scena.class, scena.getId());
		return s.getPrzedstawienia();
	}
	@Override
	public void addPrzedstawienie(Przedstawienie przedstawienie) {
		przedstawienie.setId(null);
		session.getCurrentSession().persist(przedstawienie);	
	}

	@Override
	public void addPrzedstawienieToScena(Przedstawienie przedstawienie, Scena scena) {
		Scena s = (Scena) session.getCurrentSession().get(Scena.class, scena.getId());
		s.getPrzedstawienia().add(przedstawienie);
	}
	@Override
	public void editPrzedstawienie(Przedstawienie przedstawienie) {
		session.getCurrentSession().update(przedstawienie);
	}

	@Override
	public void removePrzedstawienie(Przedstawienie przedstawienie) {
		session.getCurrentSession().delete(przedstawienie);	
	}

}
