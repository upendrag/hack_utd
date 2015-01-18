package edu.utdallas.hackutd.labcloud.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.utdallas.hackutd.labcloud.manage.JobManager;

@Path("/getjob")
public class GetJob {
	
	@GET
	@Path("/{device_id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getJob(@PathParam("device_id") String device_id) {
		String jobData = JobManager.getInstance().getPendingJobData(device_id);
		return jobData;
	}
}
