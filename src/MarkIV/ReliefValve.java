package MarkIV;

public class ReliefValve {
	private String valveState;

	ReliefValve(){
		valveState="off";
	}	
	
	public String getValveState() {
		return valveState;
	}

	public void setValveState(String valveState) {
		this.valveState = valveState;
	}	
	
}
