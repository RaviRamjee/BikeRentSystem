package com.bike.model;

import com.bike.bean.TariffDetails;
import com.bike.bean.User;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class TariffDetailsImpl {
	
	//getting datastore service
		DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
		
		public void insert(TariffDetails td,int id)
		{
			    //creating Entity class object for creating entity kind in datastore
			    Entity e=new Entity("TariffDetails",id);
			    
			    //setting property for "Entity" with the of getter method
			    e.setProperty("td_id",td.getTd_id());
			    e.setProperty("tariff_id", td.getTariff_id());
			    e.setProperty("td_duration", td.getTd_duration());
			    e.setProperty("td_tariff_amount", td.getTd_tariff_amount());
			    e.setProperty("td_rideLimit", td.getTd_rideLimit());
			    e.setProperty("td_afterLimit_amount",td.getTd_afterLimit_amount());
			    e.setProperty("td_afterLimit_km", td.getTd_afterLimit_km());
			    e.setProperty("td_afterLimit_unit_charge", td.getTd_afterLimit_unit_charge());
			    ds.put(e);
		}
		
		public void getAllTariffDetails(int id)
		{
			Key key=KeyFactory.createKey("TariffDetails",id);
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
			Key key=KeyFactory.createKey("TariffDetails",id);
			ds.delete(key);
		}

}
