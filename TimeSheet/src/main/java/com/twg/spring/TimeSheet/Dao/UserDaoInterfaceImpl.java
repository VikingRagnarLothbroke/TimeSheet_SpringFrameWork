package com.twg.spring.TimeSheet.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.twg.spring.TimeSheet.Entities.User;

@Component
public class UserDaoInterfaceImpl implements UserDaoInterface {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	@Transactional
	public void save(User user) {
	   hibernateTemplate.save(user);
		
	}


	@Override
	@Transactional
	public User findByUsername(String username) {
		
		DetachedCriteria criteria=DetachedCriteria.forClass(User.class);
		
	    criteria.add(Restrictions.eq("username", username));
		
		User user=null;
		
		try {
			user=(User)hibernateTemplate.findByCriteria(criteria).get(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

}

