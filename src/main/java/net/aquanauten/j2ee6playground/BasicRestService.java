package net.aquanauten.j2ee6playground;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.Date;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@Path("/basic")
public class BasicRestService {

  @GET
  @Path("/helloWorld")
  @Produces({TEXT_PLAIN})
  public String world() {
    return "Hello World!";
  }

  @GET
  @Path("hello/{name}")
  @Produces({TEXT_PLAIN})
  public String hello(@PathParam("name") String name) {
    return "Hello " + name + "!";
  }

  @GET
  @Path("person/{id}")
  @Produces({APPLICATION_JSON, APPLICATION_XML})
  public Person getPerson(@PathParam("id") String id) {
    return new Person(id, "Max" + new Date());
  }
}
