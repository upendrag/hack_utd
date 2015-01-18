package edu.utdallas.hackutd.labcloud.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.utdallas.hackutd.labcloud.manage.JobManager;

@Path("/getjobstatus")
public class GetJobStatus {
	
	@GET
	@Path("/{job_id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getJobStatus(@PathParam("job_id") String job_id) {
		return JobManager.getInstance().getJobStatus(job_id);
	}
}
