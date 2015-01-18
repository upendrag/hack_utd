package edu.utdallas.hackutd.labcloud.manage;

import java.util.ArrayList;

import edu.utdallas.hackutd.labcloud.data.Job;
import edu.utdallas.hackutd.labcloud.data.JobStatus;

public class JobManager {
	private ArrayList<Job> _jobs;
	private long _jobCounter;
	
	private static JobManager _instance;
	
	private JobManager() {
		this._jobs = new ArrayList<Job>();
		this._jobCounter = 0;
	}
	
	public static JobManager getInstance() {
		if(_instance == null)
			_instance = new JobManager();
		return _instance;
	}

	public String getPendingJobData(String device_id) {
		String jobData = "no_jobs"; 
		for(Job job:this._jobs) {
			if(job.get_status() == JobStatus.Queued) {
				jobData = job.get_data();
				job.set_devId(Integer.parseInt(device_id));
				job.set_status(JobStatus.Running);
				break;
			}
		}
		return jobData;
	}

	public void postResult(String device_id, String result) {
		for(Job job:this._jobs) {
			if(job.get_status() == JobStatus.Running &&
					job.get_devId() == Integer.parseInt(device_id)) {
				job.set_data(result);
				job.set_devId(-1);
				job.set_status(JobStatus.Completed);
				break;
			}
		}
	}

	public long createNewJob(String data) {
		this._jobCounter++;
		Job job = new Job();
		job.set_id(this._jobCounter);
		job.set_status(JobStatus.Queued);
		job.set_devId(0);
		job.set_data(data);
		this._jobs.add(job);
		return this._jobCounter;
	}

	public String getJobStatus(String job_id) {
		String status = "not_ready";
		long jobId = Long.parseLong(job_id);
		if(this._jobs.size() >= jobId) {
			Job job = this._jobs.get((int)jobId - 1);
			if(job.get_status() == JobStatus.Completed) {
				status = job.get_data();
			}
		}
		return status;
	}
}
