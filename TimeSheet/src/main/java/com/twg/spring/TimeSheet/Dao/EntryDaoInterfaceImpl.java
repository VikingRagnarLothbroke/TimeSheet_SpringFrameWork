package com.twg.spring.TimeSheet.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.twg.spring.TimeSheet.Entities.Entry;

@Component
public class EntryDaoInterfaceImpl implements EntryDaoInterface {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public void saveentry(Entry entry) {
		
		hibernateTemplate.save(entry);
	}

	@Override
	public List<Entry> findByUserId(int id) {
		
     DetachedCriteria criteria=DetachedCriteria.forClass(Entry.class);
		
	    criteria.add(Restrictions.eq("userid", id));
	    
	    List<Entry> totalentries=null;
	    
	    try {
			totalentries=(List<Entry>)hibernateTemplate.findByCriteria(criteria);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return totalentries;
	}

	@Override
	public Entry findById(int id) {
		
		 return hibernateTemplate.get(Entry.class, id);
	}

	@Override
	@Transactional
	public void update(Entry entry) {
		
		hibernateTemplate.update(entry);
	}

	@Override
	@Transactional
	public void delete(Entry entry) {
		
		hibernateTemplate.delete(entry);
	
	}
}
