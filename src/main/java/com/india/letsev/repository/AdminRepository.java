package com.india.letsev.repository;

import com.india.letsev.constants.QueryConstants;
import com.india.letsev.dto.AdminDto;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.mapper.AdminMapper;
import com.india.letsev.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class AdminRepository {

    public boolean createAdminTable() throws LetsEVDBException{
        try{
            Connection connection=ConnectionUtil.getConnection();
            Statement statement=connection.createStatement();
          return statement.execute(QueryConstants.CREATE_ADMIN_QUERY);

        }catch (Exception e){
            System.out.println(e);
            throw new LetsEVDBException("Exception occurred while creating the Admin table",e);

        }

    }

    public int registerAdmin(AdminDto AdminDto) throws LetsEVDBException{
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection=ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(QueryConstants.INSERT_ADMIN_QUERY);
            preparedStatement= AdminMapper.adminInsertMapper(preparedStatement,AdminDto);
            return preparedStatement.executeUpdate();

        }catch (Exception e){
            throw new LetsEVDBException("Exception occurred while registering for Admin");

        }finally {
            try{
                preparedStatement.close();
                connection.close();
            }catch (Exception e){
                throw new LetsEVDBException("Exception occurred while closing the connection");

            }
        }
    }

    public AdminDto getAdmin(int id) throws LetsEVDBException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(QueryConstants.GET_ADMIN_QUERY);
            preparedStatement.setInt(1,id);
            ResultSet resultSet=preparedStatement.executeQuery();
            return AdminMapper.populateAdminFromResultSetMapper(resultSet);
        } catch (Exception e) {
            throw new LetsEVDBException("Exception occurred while Fetching the Admin");

        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                throw new LetsEVDBException("Exception occurred while closing the connection");

            }
        }
    }

    public List<AdminDto> getAllAdmins() throws LetsEVDBException {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionUtil.getConnection();
            statement=connection.createStatement();

            ResultSet resultSet=statement.executeQuery(QueryConstants.GET_ALL_ADMIN_QUERY);
            return AdminMapper.populateAllAdminsFromResultSetMapper(resultSet);
        } catch (Exception e) {
            System.out.println(e);
            throw new LetsEVDBException("Exception occurred while Fetching the All Admin");

        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                throw new LetsEVDBException("Exception occurred while closing the connection");

            }
        }
    }


    public int updateAdmin(AdminDto AdminDto) throws LetsEVDBException{
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection=ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(QueryConstants.UPDATE_ADMIN_QUERY);
            preparedStatement= AdminMapper.adminUpdateMapper(preparedStatement,AdminDto);
            return preparedStatement.executeUpdate();

        }catch (Exception e){
            throw new LetsEVDBException("Exception occurred while Updating the Admin");

        }finally {
            try{
                preparedStatement.close();
                connection.close();
            }catch (Exception e){
                throw new LetsEVDBException("Exception occurred while closing the connection");

            }
        }
    }


    public boolean deleteAdmin(int id) throws LetsEVDBException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(QueryConstants.DELETE_ADMIN_QUERY);
            preparedStatement.setInt(1,id);
            boolean flag=preparedStatement.execute();
            return flag;
        } catch (Exception e) {
            System.out.println(e);
            throw new LetsEVDBException("Exception occurred while Deleting the Admin");

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
