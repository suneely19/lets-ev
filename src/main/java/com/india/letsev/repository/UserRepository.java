package com.india.letsev.repository;

import com.india.letsev.constants.QueryConstants;
import com.india.letsev.dto.UserDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UserRepository {
    public boolean createUserTable() throws LetsEVDBException{
        try{
            Connection connection=ConnectionUtil.getConnection();
            Statement statement=connection.createStatement();
            return statement.execute(QueryConstants.CREATE_USER_QUERY);
        }catch (Exception e){
            throw new LetsEVDBException("Execption occured while creating the user table",e);
        }
    }
    public int registerUser(UserDTO userDTO) throws LetsEVDBException {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try{
            connection= ConnectionUtil.getConnection();
            preparedStatement =connection.prepareStatement(QueryConstants.INSERT_USER_QUERY);

            preparedStatement.setInt(1,userDTO.getId());
            preparedStatement.setString(2, userDTO.getName());
            preparedStatement.setString(3, userDTO.getMailid());
            preparedStatement.setString(3, userDTO.getAddress());
            preparedStatement.setString(4, userDTO.getMobileno());
            preparedStatement.setString(5, userDTO.getMobileno());
            preparedStatement.setString(6, userDTO.getLicence());

            return preparedStatement.executeUpdate();
        }catch (Exception e){
            throw new LetsEVDBException("Exception occured while registering the User", e);
        }finally {
            try {
                preparedStatement.close();
                connection.close();
            }catch (Exception e){
                throw new LetsEVDBException("Exception occured while closing the connection");
            }
        }
    }
}
