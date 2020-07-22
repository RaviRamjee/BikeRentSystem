package com.bike.model;

import com.bike.bean.TopUp;
import com.bike.bean.User;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class TopUpImpl
{
	   //getting datastore service
		DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
		
		public void insert(TopUp tp,int id)
		{
			    //creating Entity class object for creating entity kind in datastore
			    Entity e=new Entity("TopUp",id);
			    
			    //setting property for "Entity" with the of getter method
			    e.setProperty("topup_id",tp.getTopup_id());
			    e.setProperty("topup_name",tp.getTopup_name());
			    e.setProperty("topup_Amount_50km", tp.getTopup_Amount_50km());
			    e.setProperty("topup_Amount_100km", tp.getTopup_Amount_100km());
			    e.setProperty("topup_Amount_150km", tp.getTopup_Amount_150km());
			    e.setProperty("topup_Amount_200km",tp.getTopup_Amount_200km());
			    e.setProperty("topup_Amount_250km", tp.getTopup_Amount_250km());
			    e.setProperty("topup_Amount_300km", tp.getTopup_Amount_300km());
			    e.setProperty("topup_status", tp.getTopup_status());
			    e.setProperty("topup_addtime", tp.getTopup_addtime());
			    ds.put(e);
		}
		
		public void getAllTopUp(int id)
		{
			Key key=KeyFactory.createKey("TopUp",id);
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
			Key key=KeyFactory.createKey("TopUp",id);
			ds.delete(key);
		}

}
