package com.learnSphereNet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphereNet.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
/*                                          |          |       |
                                           inbuilt   entity  type of
                                           class     class   entity in the form of wrapper class
 */
}
/*
 * NOTE-here didnt accept primittive data type rather a accept only wrapper primmitive data types
 */

