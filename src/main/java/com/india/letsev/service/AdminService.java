package com.india.letsev.service;

import com.india.letsev.dto.AdminDto;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.repository.AdminRepository;

import java.util.List;

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


    public int adminRegister(AdminDto adminDto) throws LetsEVGeneralException {
        try{
            return repository.registerAdmin(adminDto);
        }catch(LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while registering the admin ",e);
        }
    }

    public AdminDto getAdmin(int id) throws LetsEVGeneralException{
        try{
            return repository.getAdmin(id);
        }catch(LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while Fetching the admin ",e);
        }
    }

    public List<AdminDto> getAllAdmins()throws LetsEVGeneralException{
        try{
            return repository.getAllAdmins();
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occured while fetching all the employees",e);
        }
    }

    public int updateAdmin(AdminDto adminDto) throws LetsEVGeneralException {
        try{
            return repository.updateAdmin(adminDto);
        }catch(LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while Updating the admin ",e);
        }
    }

    public boolean deleteAdmin(int id) throws LetsEVGeneralException{
        try{
            return repository.deleteAdmin(id);
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occured while deleting the Admin",e);
        }
    }
}
