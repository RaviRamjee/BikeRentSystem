package com.bike.Controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bike.bean.TariffDetails;
import com.bike.bean.User;
import com.bike.model.TariffDetailsImpl;
import com.bike.model.UserImpl;

@WebServlet(
	    name = "TariffDetailsServlet",
	    urlPatterns = {"/TariffDetailsServlet"}
	)
public class tariffDetailsServlet extends HttpServlet
{
	@Override
	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {

	    response.setContentType("text/plain");
	    response.setCharacterEncoding("UTF-8");
	    
	    //creating object of TariffDetails Pojo class
	    TariffDetails td=new TariffDetails();
	    
	    //set data by setter method of class TariffDetails
	    td.setTd_id(501);
	    td.setTariff_id(401);
	    td.setTd_duration(9);
	    td.setTd_tariff_amount(400.00);
	    td.setTd_rideLimit(100);
	    td.setTd_afterLimit_amount(50);
	    td.setTd_afterLimit_km(40);
	    td.setTd_afterLimit_unit_charge(6);
	   
	    //creating TariffDetails class object for calling "crud" methods
	    TariffDetailsImpl tdImpl=new TariffDetailsImpl();
	    tdImpl.insert(td,501);    //calling insert method for insert data in entity
	   
	   
	//********************************************
	    
	    //Retrieving all the data by key
	    tdImpl.getAllTariffDetails(101);
	   
	    //deleting the records from entity
	    tdImpl.delete(101);
	   
   }

}
