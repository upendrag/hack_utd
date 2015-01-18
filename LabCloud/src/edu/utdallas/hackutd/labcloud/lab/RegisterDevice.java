package edu.utdallas.hackutd.labcloud.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.utdallas.hackutd.labcloud.manage.DeviceManager;

@Path("/registerdevice")
public class RegisterDevice {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String registerDevice() {
		int device_id = DeviceManager.getInstance().addNewDevice();
		return Integer.toString(device_id);
	}
	
}
