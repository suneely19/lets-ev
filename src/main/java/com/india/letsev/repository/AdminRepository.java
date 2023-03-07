package com.india.letsev.repository;

import com.india.letsev.constants.QueryConstants;
import com.india.letsev.dto.AdminDto;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.mapper.AdminMapper;
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
            throw new LetsEVDBException("Exception occurred while creating the Admin table",e);

        }

    }

    public int registerAdmin(AdminDto AdminDto) throws LetsEVDBException{
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection=ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(QueryConstants.INSERT_ADMIN_QUERY);

            preparedStatement= AdminMapper.AdminInsertMapper(preparedStatement,AdminDto);

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
