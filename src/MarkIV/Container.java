package MarkIV;

public class Container {
	final static int CAPACITY = 12;
	

	protected String state;
	int cantOfWater;
	protected String type;
	

	Container(String type){
		this.type = type;
	}
	
	public String getState() {
		System.out.println("estado del " + type + " es: " + state);
		return state;
	}
	
	public String fillWater(int cant) 	{
		String message=new String("Cantidad de agua ");
		return message;		
	}
	
	public String getWarmer()
	{
		return state;			
	}
	
	
	
	
	
	
	
	
	
	
	

}
