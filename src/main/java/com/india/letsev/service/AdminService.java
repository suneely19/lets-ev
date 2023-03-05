package com.india.letsev.service;

import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.repository.AdminRepository;

public class AdminService {

    AdminRepository repository;
    public AdminService(){
        repository=new AdminRepository();
    }


    public boolean createAdminTable()throws LetsEVGeneralException{
        try {
            return repository.createAdminTeable();
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occured while creating Admin table",e);
        }

    }




}