package com.mj.spring.rest.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<User>();
	
	static {
		users.add( new User(1, "John", new Date()));
		users.add( new User(2, "Adam", new Date()));		
		users.add( new User(3, "Smith", new Date()));
		users.add( new User(4, "Leo", new Date()));
	}
	//
	public List<User> findAll(){
		return users;
	}
//
	public User findUser(int id) {
		for(User usr : users) {
			if(usr.getId() == id) {
				return usr;
			}
		}
		return null;
	}
	//
	public User save(User user) {
		users.add(user);
		return user;
	}
	
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			if(user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}
