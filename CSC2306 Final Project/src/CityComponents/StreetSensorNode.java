package CityComponents;

public class StreetSensorNode {

	private double temperature_sensor;
	String microcontroller;
	double smartmeterpc;
	
	public StreetSensorNode(double temperature_sensor, String microcontroller, double smartmeterpc) {
		super();
		this.temperature_sensor = temperature_sensor;
		this.microcontroller = microcontroller;
		this.smartmeterpc = smartmeterpc;
	}
	public double getTemperature_sensor() {
		return temperature_sensor;
	}
	public void setTemperature_sensor(double temperature_sensor) {
		this.temperature_sensor = temperature_sensor;
	}
	public String getMicrocontroller() {
		return microcontroller;
	}
	public void setMicrocontroller(String microcontroller) {
		this.microcontroller = microcontroller;
	}
	public double getSmartmeterpc() {
		return smartmeterpc;
	}
	public void setSmartmeterpc(double smartmeterpc) {
		this.smartmeterpc = smartmeterpc;
	}
	@Override
	public String toString() {
		return "StreetSensorNode [temperature_sensor=" + temperature_sensor + ", microcontroller=" + microcontroller
				+ ", smartmeterpc=" + smartmeterpc + "]";
	}
	
	
	
	
}
