package com.india.letsev.repository;

import com.india.letsev.constants.QueryConstants;
import com.india.letsev.dto.AdminDto;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class AdminRepository {

    public boolean createAdminTable() throws LetsEVDBException{
        try{
            Connection connection=ConnectionUtil.getConnection();
            Statement statement=connection.createStatement();
          return statement.execute(QueryConstants.CREATE_ADMIN_QUERY);

        }catch (Exception e){
            throw new LetsEVDBException("Exception occured while creating the Admin table",e);

        }

    }

    public int registerAdmin(AdminDto AdminDto) throws LetsEVDBException{
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection=ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(QueryConstants.INSERT_ADMIN_QUERY);

            preparedStatement.setInt(1,AdminDto.getId());
            preparedStatement.setString(2,AdminDto.getName());
            preparedStatement.setString(3,AdminDto.getMailid());
            preparedStatement.setString(4,AdminDto.getAddress());
            preparedStatement.setString(5,AdminDto.getMobile());
            preparedStatement.setInt(6,AdminDto.getExperiance());
            preparedStatement.setDouble(7,AdminDto.getSalary());

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
}
