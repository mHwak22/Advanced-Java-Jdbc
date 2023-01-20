package com.DAl;

import java.sql.SQLException;

import com.pojo.Users;

public interface UserDAL {
		
	Users validate(String unserName, String UserPassword) throws SQLException;
}
