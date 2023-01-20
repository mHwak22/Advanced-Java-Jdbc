package com.pages;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAl.UserDALImpl;
import com.utils.DButils;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       UserDALImpl uobj;
    
    public LoginServlet() {
        super();
       
    }


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		super.doPost(req, resp);
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}


	@Override
	public void init() throws ServletException {
	
		try {
			DButils.openConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
