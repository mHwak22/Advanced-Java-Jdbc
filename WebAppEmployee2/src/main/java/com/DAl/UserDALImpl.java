package com.DAl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.Users;
import com.utils.DButils;

public class UserDALImpl implements  UserDAL{

	private Connection con;
	private PreparedStatement psmt;
	
	public UserDALImpl() {
			
			//| userId | userName | userPassword |
			try {
				con=DButils.getCon();
		
				psmt=con.prepareStatement("select * from users where userName =? and userPassword=?");
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
	}
	
	@Override
	public Users validate(String userName, String UserPassword) throws SQLException {
	System.out.println("inside validate .... UserDALImpl");
	Users user;
	psmt.setString(1, userName);
	psmt.setString(2, UserPassword);
	
	ResultSet rest =psmt.executeQuery();
	while(rest.next()) {
		user = new Users(rest.getInt("userId"), rest.getString("userName"), rest.getString("userPassword"));
		return user;
	}
		return null;
	}

}
