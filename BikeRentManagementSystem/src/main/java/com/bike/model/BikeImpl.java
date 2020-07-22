package com.bike.model;

import com.bike.bean.Bike;
import com.bike.bean.User;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class BikeImpl 
{
	//getting datastore service
	DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
	
	public void insert(int id,Bike bike)
	{
		    
		    //creating Entity class object for creating entity kind in datastore
		    Entity e=new Entity("Bike",id);
		    
		    //setting property for "Entity" with the of getter method
            e.setProperty("Bike_id",bike.getBike_id());
		    e.setProperty("Bike_name",bike.getBike_name());
		    e.setProperty("Bike_description",bike.getBike_description());
		    e.setProperty("Bike_category", bike.getBike_category());
		    e.setProperty("Bike_company", bike.getBike_company());
		    e.setProperty("Bike_Model", bike.getBike_Model());
		    e.setProperty("Bike_RC_No", bike.getBike_RC_No());
		    e.setProperty("Bike_RC_Name",bike.getBike_RC_Name());
		    e.setProperty("Bike_RC_RegDate", bike.getBike_RC_RegDate());
		    e.setProperty("Bike_RC_ExpDate", bike.getBike_RC_ExpDate());
		    e.setProperty("Bike_RC_CHNO",bike.getBike_RC_CHNO());
		    e.setProperty("Bike_RC_EnginNo", bike.getBike_RC_EnginNo());
		    e.setProperty("Bike_YearMfg", bike.getBike_YearMfg());
		    e.setProperty("Bike_NoOfGear", bike.getBike_NoOfGear());
		    e.setProperty("Bike_color",bike.getBike_color());
		    e.setProperty("Selfstart", bike.getSelfstart());
		    e.setProperty("Bike_Engin_CC",bike.getBike_Engin_CC());
		    e.setProperty("Tariff_id",bike.getTariff_id());
		    e.setProperty("setTopup_id",bike.getTopup_id());
		    e.setProperty("Status",bike.getStatus());
		    e.setProperty("Timestamp", bike.getTimestamp());
		    ds.put(e);
	}
	
	public void getAllBike(int id)
	{
		Key key=KeyFactory.createKey("Bike",id);
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
		Key key=KeyFactory.createKey("Bike",id);
		ds.delete(key);
	}

}
