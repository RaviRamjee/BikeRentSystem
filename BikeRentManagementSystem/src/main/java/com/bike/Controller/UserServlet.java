package com.bike.Controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bike.bean.User;
import com.bike.model.UserImpl;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@WebServlet(
	    name = "UserServlet",
	    urlPatterns = {"/UserServlet"}
	)
public class UserServlet extends HttpServlet
{
	@Override
	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {

	    response.setContentType("text/plain");
	    response.setCharacterEncoding("UTF-8");
	    
	    //creating object of userPojo class
	    User u=new User();
	    
	    //set data by setter method of class User
	    u.setId(101);
	    u.setName("Ravi");
	    u.setEmailid("ravi@gamil.com");
	    u.setPassword("12345");
	    u.setMobile_no("9058966887");
	   
	    //creating UserImpl class object for calling "crud" methods
	    UserImpl userImp=new UserImpl();
	    userImp.insert(u,101);    //calling insert method for insert data in entity
	   
	   
	//********************************************
	    
	    //Retrieving all the data by key
	     userImp.getAllUser(101);
	   
	    //deleting the records from entity
	     userImp.delete(101);
	   
     }
}
