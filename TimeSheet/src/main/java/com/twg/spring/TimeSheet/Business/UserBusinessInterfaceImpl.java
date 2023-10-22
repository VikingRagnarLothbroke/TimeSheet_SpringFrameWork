package com.twg.spring.TimeSheet.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.twg.spring.TimeSheet.Dao.UserDaoInterface;
import com.twg.spring.TimeSheet.Entities.User;

@Component
public class UserBusinessInterfaceImpl implements UserBusinessInterface {
	
	@Autowired
	private UserDaoInterface userDaoInterface;

	public UserDaoInterface getUserDaoInterface() {
		return userDaoInterface;
	}

	public void setUserDaoInterface(UserDaoInterface userDaoInterface) {
		this.userDaoInterface = userDaoInterface;
	}

	@Override
	public void save(User user) {
		
		userDaoInterface.save(user);
		
	}

	@Override
	public User findByUsername(String str) {
	
		return userDaoInterface.findByUsername(str);
	}


}
