package com.biker.rent;
import static com.googlecode.objectify.ObjectifyService.ofy;

public class Sample1 {

	public void save()
	{
		Sample sample=new Sample();
		sample.setId(11L);
		sample.setName("Ravi");
		
		ofy().save().entity(sample).now();
		
	}
	
}
