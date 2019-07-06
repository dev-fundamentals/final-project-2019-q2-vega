package MarkIV;

public class Sensor {

	Container container;

	public Sensor(Container container) {
		this.container = container;
	}

	public String getStatus() {
		return container.getState();
	}
	
	
}
