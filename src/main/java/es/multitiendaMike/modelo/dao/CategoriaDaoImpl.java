package es.multitiendaMike.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.multitiendaMike.hibernate.Playlist;

@Repository
public class CategoriaDaoImpl implements IPlayListDao {
	
	
    @PersistenceContext 
    private EntityManager em;
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Playlist> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from playlist").getResultList();
	}

}