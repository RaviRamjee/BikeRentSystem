package com.bike.model;

import java.util.ArrayList;

import com.bike.bean.User;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class UserImpl {
	
	//getting datastore service
	DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
	
	public void insert(User u,int id)
	{
		    //creating Entity class object for creating entity kind in datastore
		    Entity e=new Entity("User",id);
		    
		    //setting property for "Entity" with the of getter method
		    e.setProperty("Id",u.getId());
		    e.setProperty("Name", u.getName());
		    e.setProperty("Email_id", u.getEmailid());
		    e.setProperty("Password", u.getPassword());
		    e.setProperty("Mobile_no", u.getMobile_no());
		    ds.put(e);
	}
	
	public void getAllUser(int id)
	{
		Key key=KeyFactory.createKey("User",id);
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
		Key key=KeyFactory.createKey("User",id);
		ds.delete(key);
	}

}
