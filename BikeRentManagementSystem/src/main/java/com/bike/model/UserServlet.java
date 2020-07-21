package com.bike.model;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bike.bean.User;
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
	    
	    //creating DatastoreService reference to get datastore object
	    DatastoreService ds=DatastoreServiceFactory.getDatastoreService();

	    //getting data from html form
	    String name=request.getParameter("name");
	    String email=request.getParameter("email");
	    String password=request.getParameter("password");
	    String mobile=request.getParameter("mobile");
	    
	    //creating Entity class object for creating entity kind in datastore
	    Entity e=new Entity("User");
	    //User Pojo class Object
	    User u=new User();
	    
	    //set data by setter method of class User
	    u.setName(name);
	    u.setEmailid(email);
	    u.setPassword(password);
	    u.setMobile_no(mobile);
	    
	    //setting property for "Entity" with the of getter method
	    e.setProperty("Name", u.getName());
	    e.setProperty("Email_id", u.getEmailid());
	    e.setProperty("Password", u.getPassword());
	    e.setProperty("Mobile_no", u.getMobile_no());
	    ds.put(e);
	
	    //redirecting to the Login page
	    response.sendRedirect("./Login.html");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
}
