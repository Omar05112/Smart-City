package CityComponents;

public class BuildingControlRoom {

	private String networkgateway;


public BuildingControlRoom(String networkgateway) {
		this.networkgateway = networkgateway;
	}

public String getNetworkgateway() {
	return networkgateway;
}

public void setNetworkgateway(String networkgateway) {
	this.networkgateway = networkgateway;
}

@Override
public String toString() {
	return "BuildingControlRoom [networkgateway=" + networkgateway + "]";
}


}
