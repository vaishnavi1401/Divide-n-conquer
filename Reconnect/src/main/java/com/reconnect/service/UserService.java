package com.reconnect.service;


import java.io.FileNotFoundException;

import com.reconnect.dao.UserDaoInterface;
import com.reconnect.model.City;
import com.reconnect.model.User;
import com.reconnect.model.UserLogin;
import com.reconnect.utility.UserDAOFactory;

public class UserService implements UserServiceInterface {

	public UserDaoInterface ud;
	
	public UserService(){
		
		ud=UserDAOFactory.createobject();
	}
	
	public int loginValidation(UserLogin ul) {
		
		return ud.loginValidation(ul);
	}

	public int registerUserCity(City c) {
		return ud.registerUserCity(c);
	}

	public int registerUserCred(UserLogin ul) {
		return ud.registerUserCred(ul);
	}

	public boolean checkEmailUnique(String email) {
		return ud.checkEmailUnique(email);
	}

	public boolean registerUserDetail(User usr, int city_id, int cred_id) throws FileNotFoundException {
		return ud.registerUserDetail(usr, city_id,cred_id);
	}

}
