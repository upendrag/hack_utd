package edu.utdallas.hackutd.labcloud.lab;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import edu.utdallas.hackutd.labcloud.manage.JobManager;

@Path("/postresult")
public class PostResult {
	
	@POST
	@Path("/{device_id}")
	@Consumes(MediaType.TEXT_PLAIN)
	public void postResult(@PathParam("device_id") String device_id, String result) {
		JobManager.getInstance().postResult(device_id, result);
	}
}
