package com.bike.Controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bike.bean.TopUp;
import com.bike.bean.User;
import com.bike.model.TopUpImpl;
import com.bike.model.UserImpl;

@WebServlet(
	    name = "TopUpServlet",
	    urlPatterns = {"/TopUpServlet"}
	)
public class TopUpServlet extends HttpServlet {
	
	@Override
	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {

	    response.setContentType("text/plain");
	    response.setCharacterEncoding("UTF-8");
	    
	    //creating object of TopUp Pojo class
	    TopUp tp=new TopUp();
	    
	    //set data by setter method of class TopUp
	    tp.setTopup_id(601);
	    tp.setTopup_name("Activa 4g");
	    tp.setTopup_Amount_50km(200.00);
	    tp.setTopup_Amount_100km(300.00);
	    tp.setTopup_Amount_150km(400.00);
	    tp.setTopup_Amount_200km(500.00);
	    tp.setTopup_Amount_250km(600.00);
	    tp.setTopup_Amount_300km(700.00);
	    tp.setTopup_status(1);
	    tp.setTopup_addtime("23-07-2020");
	    
	   
	    //creating TopUpImpl class object for calling "crud" methods
	    TopUpImpl tpImpl=new TopUpImpl();
	    tpImpl.insert(tp,601);    //calling insert method for insert data in entity
	   
	   
	//********************************************
	    
	    //Retrieving all the data by key
	    tpImpl.getAllTopUp(601);
	   
	    //deleting the records from entity
	    tpImpl.delete(601);
	   
   }

}
