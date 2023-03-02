package CityComponents;

public class ApartmentSensorNode {
private double motion_sensor;
private double temperature_sensor;
private double humidity_sensor;
private String communication_module;
private String microcontroller;


public ApartmentSensorNode(double motion_sensor, double temperature_sensor, double humidity_sensor,
		String communication_module, String microcontroller) {
	this.motion_sensor = motion_sensor;
	this.temperature_sensor = temperature_sensor;
	this.humidity_sensor = humidity_sensor;
	this.communication_module = communication_module;
	this.microcontroller = microcontroller;
}
public double getMotion_sensor() {
	return motion_sensor;
}
public void setMotion_sensor(double motion_sensor) {
	this.motion_sensor = motion_sensor;
}
public double getTemperature_sensor() {
	return temperature_sensor;
}
public void setTemperature_sensor(double temperature_sensor) {
	this.temperature_sensor = temperature_sensor;
}
public double getHumidity_sensor() {
	return humidity_sensor;
}
public void setHumidity_sensor(double humidity_sensor) {
	this.humidity_sensor = humidity_sensor;
}
public String getCommunication_module() {
	return communication_module;
}
public void setCommunication_module(String communication_module) {
	this.communication_module = communication_module;
}
public String getMicrocontroller() {
	return microcontroller;
}
public void setMicrocontroller(String microcontroller) {
	this.microcontroller = microcontroller;
}


@Override
public String toString() {
	return "ApartmentSensorNode [motion_sensor=" + motion_sensor + ", temperature_sensor=" + temperature_sensor
			+ ", humidity_sensor=" + humidity_sensor + ", communication_module=" + communication_module
			+ ", microcontroller=" + microcontroller + "]";
}



}
