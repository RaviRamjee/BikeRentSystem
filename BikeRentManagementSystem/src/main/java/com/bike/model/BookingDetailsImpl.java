package com.bike.model;

import com.bike.bean.BookingDetails;
import com.bike.bean.User;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class BookingDetailsImpl 
{
	    //getting datastore service
		DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
		
		public void insert(BookingDetails bd,int id)
		{
			    //creating Entity class object for creating entity kind in datastore
			    Entity e=new Entity("BookingDetails",id);
			    
			    //setting property for "Entity" with the of getter method
			    e.setProperty("bookingd_id",bd.getBookingd_id());
			    e.setProperty("bookingd_name",bd.getBookingd_name());
			    e.setProperty("bookingd_email", bd.getBookingd_email());
			    e.setProperty("bookingd_phone", bd.getBookingd_phone());
			    e.setProperty("bookingd_dlno", bd.getBookingd_dlno());
			    e.setProperty("bookingd_dob", bd.getBookingd_dob());
			    e.setProperty("bookingd_pickup_type", bd.getBookingd_pickup_type());
			    ds.put(e);
		}
		
		public void getAllBookingDetails(int id)
		{
			Key key=KeyFactory.createKey("BookingDetails",id);
			Entity e=null;
			try {
				e = ds.get(key);
				System.out.println("the entity value is: "+e);
			} catch (EntityNotFoundException e1) {
				e1.printStackTrace();
			}
		}
		
		public void delete(int id)
		{
			Key key=KeyFactory.createKey("BookingDetails",id);
			ds.delete(key);
		}

}
