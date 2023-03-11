package com.india.letsev.repository;

import com.india.letsev.constants.QueryConstants;
import com.india.letsev.dto.AdminDto;
import com.india.letsev.dto.UserDTO;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.mapper.AdminMapper;
import com.india.letsev.mapper.UserMapper;
import com.india.letsev.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class UserRepository {


    public boolean createUserTable() throws LetsEVDBException{
        try{
            Connection connection=ConnectionUtil.getConnection();
            Statement statement=connection.createStatement();
            return statement.execute(QueryConstants.CREATE_USER_QUERY);
        }catch (Exception e){
            System.out.println(e);
            throw new LetsEVDBException("Execption occured while creating the user table",e);
        }
    }
    public int registerUser(UserDTO userDTO) throws LetsEVDBException {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try{
            connection= ConnectionUtil.getConnection();
            preparedStatement =connection.prepareStatement(QueryConstants.INSERT_USER_QUERY);
            preparedStatement= UserMapper.userInsertMapper(preparedStatement,userDTO);
         return preparedStatement.executeUpdate();


        }catch (Exception e){
            throw new LetsEVDBException("Exception occured while registering the User", e);
        }finally {
            try {
                preparedStatement.close();
                connection.close();
            }catch (Exception e){
                throw new LetsEVDBException("Exception occured while closing the connection",e);
            }
        }
    }

    public UserDTO getUser(int id) throws LetsEVDBException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(QueryConstants.GET_USER_QUERY);
            preparedStatement.setInt(1,id);
            ResultSet resultSet=preparedStatement.executeQuery();
            return UserMapper.populateUserFromResultSetMapper(resultSet);
        } catch (Exception e) {
            System.out.println(e);
            throw new LetsEVDBException("Exception occurred while Fetching the User");

        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                throw new LetsEVDBException("Exception occurred while closing the connection");

            }
        }
    }

    public List<UserDTO> getAllUsers() throws LetsEVDBException {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionUtil.getConnection();
            statement=connection.createStatement();

            ResultSet resultSet=statement.executeQuery(QueryConstants.GET_ALL_USER_QUERY);
            return UserMapper.populateAllUsersFromResultSetMapper(resultSet);
        } catch (Exception e) {
            System.out.println(e);
            throw new LetsEVDBException("Exception occurred while Fetching the All User");

        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                throw new LetsEVDBException("Exception occurred while closing the connection");

            }
        }
    }

    public int updateUser(UserDTO userDTO) throws LetsEVDBException{
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection=ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(QueryConstants.UPDATE_USER_QUERY);
            preparedStatement= UserMapper.userUpdateMapper(preparedStatement,userDTO);
            return preparedStatement.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
            throw new LetsEVDBException("Exception occurred while Updating the User");

        }finally {
            try{
                preparedStatement.close();
                connection.close();
            }catch (Exception e){
                throw new LetsEVDBException("Exception occurred while closing the connection");

            }
        }
    }

    public boolean deleteUser(int id) throws LetsEVDBException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(QueryConstants.DELETE_USER_QUERY);
            preparedStatement.setInt(1,id);
            boolean flag=preparedStatement.execute();
            return flag;
        } catch (Exception e) {
            System.out.println(e);
            throw new LetsEVDBException("Exception occurred while Deleting the User");

        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                throw new LetsEVDBException("Exception occurred while closing the connection");

            }
        }
    }


}
