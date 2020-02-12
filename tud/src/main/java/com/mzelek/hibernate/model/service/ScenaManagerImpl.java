package com.mzelek.hibernate.model.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mzelek.hibernate.model.domain.Scena;

@Component
@Transactional
public class ScenaManagerImpl implements ScenaManager{

	
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
	public List<Scena> getAllSceny(){
		return session.getCurrentSession().getNamedQuery("Scena.getAll").list();
	}
	@Override
	public Scena getScenaById(Scena scena){
		return (Scena) session.getCurrentSession().get(Scena.class, scena.getId());
	}
	
	@Override
	public void addScena(Scena scena){
		scena.setId(null);
		session.getCurrentSession().persist(scena);
	}
	
	@Override
	public void editScena(Scena scena){
		session.getCurrentSession().update(scena);
	}
	
	@Override
	public void removeScena(Scena scena){
		session.getCurrentSession().delete(scena);
	}
	
}
