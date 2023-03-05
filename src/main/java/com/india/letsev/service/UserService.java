package com.india.letsev.service;

import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.repository.UserRepository;

public class UserService {
    UserRepository repository;
    public UserService(){
        repository=new UserRepository();
    }

    public boolean createUserTable() throws LetsEVGeneralException {
        try{
            return repository.createUserTable();
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occured while creating User table", e);
        }
    }
}
