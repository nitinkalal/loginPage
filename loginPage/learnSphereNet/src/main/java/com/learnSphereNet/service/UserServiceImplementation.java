package com.learnSphereNet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphereNet.entity.Users;
import com.learnSphereNet.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService  {
	
/*either create a constructor or use only @Autowired annotation
 * v use @Autowired because of already created a constructor
 */
    @Autowired
	UserRepository repo;
/*       |           |
 	our repository  reference of repository class
 	class name
 	
 	already we have features in repository class(inbuilt)
 */
	
	@Override
	public String addUser(Users user) {
		repo.save(user);
/*            |
 * save(add), user(entity class reference)
 *  in repo(repository) or database ,
 *  we have to override the addUser() from UserService bcz we
 *  implementing and we should give a body in this class
 */
		return "student added successfully!";
	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}
}


