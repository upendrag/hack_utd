package edu.utdallas.hackutd.labcloud.data;

public class Job {
	private long _id;
	private JobStatus _status; 
	private String _data;
	private int _devId;
	
	public long get_id() {
		return _id;
	}
	public void set_id(long _id) {
		this._id = _id;
	}
	public JobStatus get_status() {
		return _status;
	}
	public void set_status(JobStatus _status) {
		this._status = _status;
	}
	public String get_data() {
		return _data;
	}
	public void set_data(String _data) {
		this._data = _data;
	}
	public int get_devId() {
		return _devId;
	}
	public void set_devId(int _devId) {
		this._devId = _devId;
	}
	
}
