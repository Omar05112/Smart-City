package CityComponents;

public class SmartAppliance {

	private ApplianceType Atype;
	private boolean switch_state;
	private double smart_meter;
	
	
	public SmartAppliance(ApplianceType atype, boolean switch_state, double smart_meter) {
		Atype = atype;
		this.switch_state = switch_state;
		this.smart_meter = smart_meter;
	}
	public ApplianceType getAtype() {
		return Atype;
	}
	public void setAtype(ApplianceType atype) {
		Atype = atype;
	}
	public boolean isSwitch_state() {
		return switch_state;
	}
	public void setSwitch_state(boolean switch_state) {
		this.switch_state = switch_state;
	}
	public double getSmart_meter() {
		return smart_meter;
	}
	public void setSmart_meter(double smart_meter) {
		this.smart_meter = smart_meter;	
	}
	
	
	@Override
	public String toString() {
		return "SmartAppliance [Atype=" + Atype + ", switch_state=" + switch_state + ", smart_meter=" + smart_meter
				+ "]";
	}
	
	
	
}
