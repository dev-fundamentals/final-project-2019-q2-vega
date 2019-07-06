package MarkIV;

public class PlateHeater extends Heater{

	@Override
	void turnOn() {
		statusHeater = ON;		
	}

	@Override
	void turnOff() {
		statusHeater = OFF;		
	}

}
