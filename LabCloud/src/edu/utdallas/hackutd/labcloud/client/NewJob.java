package edu.utdallas.hackutd.labcloud.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.utdallas.hackutd.labcloud.manage.JobManager;

@Path("/newjob")
public class NewJob {

	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public String createNewJob(String data) {
		long jobId = JobManager.getInstance().createNewJob(data);
		return Long.toString(jobId);
	}
}
