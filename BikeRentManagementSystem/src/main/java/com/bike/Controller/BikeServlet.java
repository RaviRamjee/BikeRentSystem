package com.bike.Controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bike.bean.Bike;
import com.bike.model.BikeImpl;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@WebServlet(
	    name = "BikeServlet",
	    urlPatterns = {"/BikeServlet"}
	)
public class BikeServlet extends HttpServlet{

	@Override
	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {

	    response.setContentType("text/plain");
	    response.setCharacterEncoding("UTF-8");
	    
	    //creating DatastoreService reference to get datastore object
	    DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
	    
	    //User Pojo class Object
	    Bike bike=new Bike();
	    
	    //setter methods for set value
	    bike.setBike_id(101);
        bike.setBike_name("Pulsar 150");
        bike.setBike_description("bike_description");
        bike.setBike_category("bike_category");
        bike.setBike_company("bike_company");
        bike.setBike_Model("bike_Model");
        bike.setBike_RC_No("bike_RC_No");
        bike.setBike_RC_Name("bike_RC_Name");
        bike.setBike_RC_RegDate("bike_RC_RegDate");
        bike.setBike_RC_ExpDate("bike_RC_ExpDate");
        bike.setBike_RC_CHNO("bike_RC_CHNO");
        bike.setBike_RC_EnginNo("bike_RC_EnginNo");
        bike.setBike_YearMfg("bike_YearMfg");
        bike.setBike_NoOfGear(4);
        bike.setBike_color("bike_color");
        bike.setSelfstart(1);
        bike.setBike_Engin_CC(150);
        bike.setTariff_id(324434);
        bike.setTopup_id(87598);
        bike.setStatus(1);
        bike.setTimestamp("12-May-2014");
	    
        //creating BikeImpl object 
	    BikeImpl bimpl=new BikeImpl();
	    bimpl.insert(101,bike); //calling insert method to insert value
	    
	    
	    //getting data by Bike_id
	    bimpl.getAllBike(101);
	    
	    //deleting the records from entity
	     bimpl.delete(101);
	    
   }
}
