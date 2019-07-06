package MarkIV;

public class Receptacle {
	static final String FILLED = "Filled";
	static final String NOT_FILLED = "Not Filled";
	
	private String indicatorReceptacle;
	
	public Receptacle() {
		indicatorReceptacle = NOT_FILLED;
	}
	
	String getIndicatorReceptacle() {
		return indicatorReceptacle;
	}

	void setIndicatorReceptacle(String indicatorReceptacle) {
		this.indicatorReceptacle = indicatorReceptacle;
	}
	

}
