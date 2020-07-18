package BikeRentManagementSystem;
import static com.googlecode.objectify.ObjectifyService.ofy;

public class Sample1 {

	public void save()
	{
		UserPojo sample=new UserPojo();
		sample.setId(11L);
		sample.setName("Ravi");
		
		ofy().save().entity(sample).now();
		
	}
	
}
