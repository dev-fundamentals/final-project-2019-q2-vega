package MarkIV;

public class Pot extends Container {
	final static String WARMER_EMPTY="warmer empty";
	final static String POT_EMPTY="pot empty";
	final static String POT_NOT_EMPTY="pot not empty";
	
	
	private String statePot;
	private String stateWarmer;

	Pot(){
		super("Pot");
		statePot=POT_EMPTY;		
	}	
	
	public String getStatePot() {
		return statePot;
	}	

	public void setStatePot(String statePot) {
		this.statePot = statePot;
	}
	
	public String getWarmer() {
		return stateWarmer;
	}	
	
	

}
