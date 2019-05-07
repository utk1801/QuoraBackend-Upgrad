package com.upgrad.quora.service.dao;

import com.upgrad.quora.service.entity.UsersEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDao {


    @PersistenceContext
    private EntityManager entityManager;


    public UsersEntity createUser(UsersEntity usersEntity){
        entityManager.persist(usersEntity);
        return usersEntity;
    }



}