package ${groupId}.${rootArtifactId}.resource;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;



@Path("job")
public class JobResource {

   
    @GET
    public Response findAll(){

        return Response
                .ok()
                .build();
    }


   

}
