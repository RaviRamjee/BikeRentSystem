package com.bike.model;

import com.bike.bean.Booking;
import com.bike.bean.User;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class BookingImpl 
{
	   //getting datastore service
		DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
		
		public void insert(Booking b,int id)
		{
			 //creating Entity class object for creating entity kind in datastore
		    Entity e=new Entity("Booking",id);
		    
		    //setting property for "Entity" with the of getter method
		    e.setProperty("Booking_id",b.getBooking_bike_id());
		    e.setProperty("Booking_details_id", b.getBooking_details_id());
		    e.setProperty("Booking_pickup_date", b.getBooking_pickup_date());
		    e.setProperty("Booking_drop_date", b.getBooking_drop_date());
		    e.setProperty("Booking_bike_id", b.getBooking_bike_id());
		    e.setProperty("Booking_status", b.getBooking_status());
		    e.setProperty("BookingTime", b.getBookingTime());
		    e.setProperty("Topupselected", b.getTopupselected());
		    ds.put(e);
			
        }
		
		public void getAllBooking(int id)
		{
			Key key=KeyFactory.createKey("Booking",id);
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
			Key key=KeyFactory.createKey("Booking",id);
			ds.delete(key);
		}

}
