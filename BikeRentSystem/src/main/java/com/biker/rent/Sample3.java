package com.biker.rent;

import javax.servlet.annotation.WebListener;

import com.googlecode.objectify.ObjectifyService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@WebListener
public class Sample3 implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		ObjectifyService.register(Sample.class);

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}
}
