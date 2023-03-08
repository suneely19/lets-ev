package com.india.letsev.service;

import com.india.letsev.dto.AdminDto;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.repository.AdminRepository;

public class AdminService {

    private AdminRepository repository;
    public AdminService(){
        repository=new AdminRepository();
    }


    public boolean createAdminTable()throws LetsEVGeneralException{
        try {
            return repository.createAdminTable();
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while creating Admin table",e);
        }

    }


    public int AdminRegister(AdminDto adminDto) throws LetsEVGeneralException {
        try{
            return repository.registerAdmin(adminDto);
        }catch(LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while registering the admin ",e);
        }
    }
}
