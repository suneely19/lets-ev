package com.india.letsev.repository;

import com.india.letsev.constants.QueryConstants;
import com.india.letsev.exception.LetsEVDBException;
import com.india.letsev.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.Statement;

public class AdminRepository {

    public boolean createAdminTeable() throws LetsEVDBException{
        try{
            Connection connection=ConnectionUtil.getConnection();
            Statement statement=connection.createStatement();
          return statement.execute(QueryConstants.CREATE_ADMIN_QUERY);

        }catch (Exception e){
            throw new LetsEVDBException("Exception occured while creating the Admin table",e);

        }

    }
}
