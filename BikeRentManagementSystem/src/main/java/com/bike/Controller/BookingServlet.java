package com.bike.Controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bike.bean.Booking;
import com.bike.model.BookingImpl;

@WebServlet(
	    name = "BookingServlet",
	    urlPatterns = {"/BookingServlet"}
	)
  public class BookingServlet extends HttpServlet
  {
	@Override
	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {

	    response.setContentType("text/plain");
	    response.setCharacterEncoding("UTF-8");
	    
	    Booking b=new Booking();
	    
	    b.setBooking_id(110);
	    b.setBooking_details_id(201);
	    b.setBooking_pickup_date("24-03-2020");
	    b.setBooking_drop_date("26-03-2020");
	    b.setBooking_bike_id(101);
	    b.setBooking_status("Active");
	    b.setBookingTime("12:00 PM");
	    b.setTopupselected("100 KM");
	    
	    BookingImpl bookImpl=new BookingImpl();
	    
	    bookImpl.insert(b,110); //calling insert method for insert data in entity
	    
	    //Retrieving all the data by key
	     bookImpl.getAllBooking(101);
	   
	    //deleting the records from entity
	     bookImpl.delete(101);

   }
}
