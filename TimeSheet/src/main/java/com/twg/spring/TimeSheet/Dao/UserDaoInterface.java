package com.twg.spring.TimeSheet.Dao;

import com.twg.spring.TimeSheet.Entities.User;

public interface UserDaoInterface {

	public void save(User user);
    public User findByUsername(String str);
}
