package com.twg.spring.TimeSheet.Business;

import com.twg.spring.TimeSheet.Entities.User;

public interface UserBusinessInterface {
	
	public void save(User user);
	
	public User findByUsername(String str);

}
