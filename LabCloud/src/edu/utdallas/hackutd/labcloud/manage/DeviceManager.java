package edu.utdallas.hackutd.labcloud.manage;

import java.util.ArrayList;

import edu.utdallas.hackutd.labcloud.data.Device;
import edu.utdallas.hackutd.labcloud.data.DeviceStatus;

public class DeviceManager {
	private ArrayList<Device> _devices;
	private int _deviceIdCounter;
	
	private static DeviceManager _instance;
	
	private DeviceManager(){
		_devices = new ArrayList<Device>();
		_deviceIdCounter = 0;
	}
	
	public static DeviceManager getInstance() {
		if(_instance == null)
			_instance = new DeviceManager();
		return _instance;
	}

	public int addNewDevice() {
		this._deviceIdCounter++;
		Device device = new Device();
		device.set_deviceId(this._deviceIdCounter);
		device.set_state(DeviceStatus.Available);
		this._devices.add(device);
		return this._deviceIdCounter;
	}
}
