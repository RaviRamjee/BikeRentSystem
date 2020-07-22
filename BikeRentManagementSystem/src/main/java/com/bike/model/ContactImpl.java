package com.bike.model;

import com.bike.bean.Contact;
import com.bike.bean.User;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class ContactImpl 
{
	//getting datastore service
		DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
		
		public void insert(Contact c,int id)
		{
			    //creating Entity class object for creating entity kind in datastore
			    Entity e=new Entity("Contact",id);
			    
			    //setting property for "Entity" with the of getter method
			    e.setProperty("contact_id",c.getContact_id());
			    e.setProperty("contact_name", c.getContact_name());
			    e.setProperty("contact_email", c.getContact_email());
			    e.setProperty("contact_phone", c.getContact_phone());
			    e.setProperty("contact_message", c.getContact_message());
			    e.setProperty("contact_time", c.getContact_time());
			    ds.put(e);
		}
		
		public void getAllContact(int id)
		{
			Key key=KeyFactory.createKey("Contact",id);
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
			Key key=KeyFactory.createKey("Contact",id);
			ds.delete(key);
		}

}
