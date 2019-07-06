package MarkIV;

abstract class Heater {
	final static String ON="on";
	final static String OFF="off";
	
	static String statusHeater;
	
	abstract void turnOn();
	abstract void turnOff();		
}
