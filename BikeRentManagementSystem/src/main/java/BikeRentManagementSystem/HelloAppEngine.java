package BikeRentManagementSystem;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");
    
    Sample1 sample=new Sample1();
    sample.save();
    System.out.println("test");
    
    /*DatastoreService ds=DatastoreServiceFactory.getDatastoreService();

    Entity e=new Entity("User");
    e.setProperty("FirstName", "Sam");
    e.setProperty("LastName", "Kumar");
    ds.put(e);
    
    Entity e1=new Entity("Employee");
    e1.setProperty("FirstName", "Rahul");
    e1.setProperty("LastName", "Kumar");
    ds.put(e1);*/
    
    
    response.getWriter().print("Hello App Engine!\r\n");
    
  }
}