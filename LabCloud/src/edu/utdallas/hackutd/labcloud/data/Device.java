package edu.utdallas.hackutd.labcloud.data;

public class Device {
	private int _deviceId;
	private DeviceStatus _state;
	
	public int get_deviceId() {
		return _deviceId;
	}
	public void set_deviceId(int _deviceId) {
		this._deviceId = _deviceId;
	}
	public DeviceStatus get_state() {
		return _state;
	}
	public void set_state(DeviceStatus _state) {
		this._state = _state;
	}
	
	
}
