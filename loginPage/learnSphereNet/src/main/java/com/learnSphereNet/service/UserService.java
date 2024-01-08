//in this class perform CRUD operation

package com.learnSphereNet.service;

import com.learnSphereNet.entity.Users;

//this class main purpose is adding a new user to database 

public interface UserService {
	String addUser(Users user);
/*           |       |     |
         one of    entity  reference of entity class
         method   class
         name    
*/
	boolean checkEmail(String email);
}
