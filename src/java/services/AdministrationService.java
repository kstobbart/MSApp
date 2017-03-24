/*
 * TODO: Change me
 */
package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Andrew
 */
@Path("/Admin")
public class AdministrationService {
    
    /**
     * A simple method for testing if our service is online.
     * -> GET /API/Admin/Health
     * If true is returned, we will have configured our service properly.
     * @return 
     */
    @GET
    @Path("/Health")
    public Boolean getHealthy(){
        return true;
    }
    
    /**
     * Administrative functionality is as follows:
     *  *   CRUD functionality for users.
     *  *   TODO: Think of more.
     */
}
