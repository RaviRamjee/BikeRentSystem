package com.bike.Controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bike.bean.Tariff;
import com.bike.bean.User;
import com.bike.model.TariffImpl;
import com.bike.model.UserImpl;

@WebServlet(
	    name = "TariffServlet",
	    urlPatterns = {"/TariffServlet"}
	)
public class TariffServlet extends HttpServlet 
{
	@Override
	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {

	    response.setContentType("text/plain");
	    response.setCharacterEncoding("UTF-8");
	    
	    //creating object of TriffPojo class
	     Tariff t=new Tariff();
	    
	    //set data by setter method of class Tariff
	    t.setTariff_id(401);
	    t.setTariff_name("300KM");
	    t.setTariff_Details("300KM for 1 day");
	    t.setTariff_status(1);
	    t.setTariff_CreateTime("12-04-2020 03:00PM");
	   
	    //creating UserImpl class object for calling "crud" methods
	    TariffImpl tariffImp=new TariffImpl();
	    tariffImp.insert(t,401);    //calling insert method for insert data in entity
	   
	   
	//********************************************
	    
	    //Retrieving all the data by key
	    tariffImp.getAllTariff(401);
	   
	    //deleting the records from entity
	    tariffImp.delete(401);
	   
   }

}
