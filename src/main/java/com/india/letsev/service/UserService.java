package com.india.letsev.service;

import com.india.letsev.dto.AdminDto;
import com.india.letsev.dto.UserDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.exception.LetsEVGeneralException;
import com.india.letsev.repository.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository repository;
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
    public int UserRegister(UserDTO userDTO) throws LetsEVGeneralException{
        try{
            return repository.registerUser(userDTO);
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while registering the user",e);
        }
    }

    public UserDTO getUser(int id) throws LetsEVGeneralException{
        try{
            return repository.getUser(id);
        }catch(LetsEVDBException e){
            System.out.println(e);
            throw new LetsEVGeneralException("Exception occurred while Fetching the user ",e);
        }
    }

    public List<UserDTO> getAllUsers()throws LetsEVGeneralException{
        try{
            return repository.getAllUsers();
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occured while fetching all the employees",e);
        }
    }

    public int updateUser(UserDTO userDTO) throws LetsEVGeneralException {
        try{
            return repository.updateUser(userDTO);
        }catch(LetsEVDBException e){
            System.out.println(e);
            throw new LetsEVGeneralException("Exception occurred while Updating the user ",e);
        }
    }

    public boolean deleteUser(int id) throws LetsEVGeneralException{
        try{
            return repository.deleteUser(id);
        }catch (LetsEVDBException e){
            throw new LetsEVGeneralException("Exception occurred while deleting the User",e);
        }
    }
}
