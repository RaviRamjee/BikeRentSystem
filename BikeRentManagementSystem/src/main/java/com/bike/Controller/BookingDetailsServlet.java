package com.bike.Controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bike.bean.BookingDetails;
import com.bike.model.BookingDetailsImpl;

@WebServlet(
	    name = "BookingDetailsServlet",
	    urlPatterns = {"/BookingDetailsServlet"}
	)
   public class BookingDetailsServlet extends HttpServlet
    {
	  @Override
	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {

	    response.setContentType("text/plain");
	    response.setCharacterEncoding("UTF-8");
	    
	    //creating BookingDetails object
	    BookingDetails bd=new BookingDetails();
	    
	    //set data by setter method of class BookingDetails
	    bd.setBookingd_id(201);
	    bd.setBookingd_name("Harendra");
	    bd.setBookingd_email("haren@gmail.com");
	    bd.setBookingd_phone("7598379793");
	    bd.setBookingd_dlno("HADHKJHSKJ6876443");
	    bd.setBookingd_dob("13-04-1994");
	    bd.setBookingd_pickup_type("At Branch");
	    
	  //creating BookingDetailsImpl class object for calling "crud" methods
	    BookingDetailsImpl bdImpl=new BookingDetailsImpl();
	    bdImpl.insert(bd,201);  //calling insert method for insert data in entity
	    
	  //Retrieving all the data by key
	    bdImpl.getAllBookingDetails(201);
	    
	  //deleting the records from entity
	    bdImpl.delete(201);
	}	

}
