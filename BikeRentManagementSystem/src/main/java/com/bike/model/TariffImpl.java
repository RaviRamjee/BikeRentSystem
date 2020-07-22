package com.bike.model;

import com.bike.bean.Tariff;
import com.bike.bean.User;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class TariffImpl 
{
	    //getting datastore service
		DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
		
		public void insert(Tariff t,int id)
		{
			    //creating Entity class object for creating entity kind in datastore
			    Entity e=new Entity("Tariff",id);
			    
			    //setting property for "Entity" with the of getter method
			    e.setProperty("tariff_id",t.getTariff_id());
			    e.setProperty("tariff_name", t.getTariff_name());
			    e.setProperty("tariff_Details", t.getTariff_Details());
			    e.setProperty("tariff_status", t.getTariff_status());
			    e.setProperty("tariff_CreateTime", t.getTariff_CreateTime());
			    ds.put(e);
		}
		
		public void getAllTariff(int id)
		{
			Key key=KeyFactory.createKey("Tariff",id);
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
			Key key=KeyFactory.createKey("Tariff",id);
			ds.delete(key);
		}

}
