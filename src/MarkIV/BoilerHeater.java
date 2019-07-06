package MarkIV;

public class BoilerHeater extends Heater{

	@Override
	public void turnOn() {
		statusHeater=ON;		
	}

	@Override
	public void turnOff() {
		statusHeater = OFF;		
	}

}
