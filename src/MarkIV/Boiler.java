package MarkIV;

public class Boiler extends Container{
	final static String EMPTY = "empty";
	final static String NOT_EMPTY = "no empty";
	
	ReliefValve relief;
		
	Boiler(){
		super("Boiler");
		state = EMPTY;
		relief = new ReliefValve();
		cantOfWater=0;
	}
	
	public String fillWater(int cant)  {
		String message=new String("cantidad sobrepasa el capacity del boiler");

		if (cant < 0) {
			return "No es un caso real";
		}
		else {
				
		int aux = cantOfWater + cant;
		
		if (aux <= CAPACITY) 
		{
			cantOfWater = aux;
		
			if (cantOfWater > 0) 
			{
				state = NOT_EMPTY;
				return "El agua fue llenada";
			}
			else 
			{
				state = EMPTY;
				return "EL boiler esta vacio";				
			}
		}else {
			return message;
		}			
	  }		
	}		
}
