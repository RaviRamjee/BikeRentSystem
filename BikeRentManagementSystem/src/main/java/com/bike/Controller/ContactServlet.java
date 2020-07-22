package com.bike.Controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bike.bean.Contact;
import com.bike.bean.User;
import com.bike.model.ContactImpl;
import com.bike.model.UserImpl;

@WebServlet(
	    name = "ContactServlet",
	    urlPatterns = {"/ContactServlet"}
	)
public class ContactServlet extends HttpServlet
{
	@Override
	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {

	    response.setContentType("text/plain");
	    response.setCharacterEncoding("UTF-8");
	    
	  //creating object of ContactPojo class
	    Contact c=new Contact();
	    
	    //set data by setter method of class User
	    c.setContact_id(301);
	    c.setContact_name("Samrat");
	    c.setContact_email("sam@gmail.com");
	    c.setContact_phone("9823762782");
	    c.setContact_message("How to book a bike");
	    c.setContact_time("12-05-2020");
	    
	  //creating UserImpl class object for calling "crud" methods
	    ContactImpl cImpl=new ContactImpl();
	    cImpl.insert(c,301);    //calling insert method for insert data in entity
	   
	   
	//********************************************
	    
	    //Retrieving all the data by key
	    cImpl.getAllContact(301);
	   
	    //deleting the records from entity
	    cImpl.delete(301);

   }
}
