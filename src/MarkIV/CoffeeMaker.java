package MarkIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeMaker {

	BoilerHeater boilerHeater;
	Sensor sensor;
	Receptacle receptacle;
	Container containerPot;
	Boiler containerBoiler;
	PlateHeater plateHeater;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	CoffeeMaker()
	{

		receptacle = new Receptacle();
		boilerHeater = new BoilerHeater();
		containerPot = new Pot();
		containerBoiler = new Boiler();
		plateHeater = new PlateHeater();
	}	
	
	public void pushButton()
	{
		containerBoiler.relief.setValveState("off");		
		
	}
	
	
	public void prepareCoffee(int cant) throws IOException {
	  int var=0;
	  char sn;

	 containerBoiler.fillWater(cant);
     try {	
		if (containerBoiler.getState().equals(Boiler.NOT_EMPTY)) 
		{			
			System.out.println("hay agua");
			if (containerBoiler.relief.getValveState().equals("off")) 
			{
				System.out.println("la valvula se ha cerrado");
				//boilerHeater.turnOn();
				
				if (containerPot.getWarmer().equals("warmer empty")) 
				{
					System.out.println("el Pot fue levantado");
					boilerHeater.turnOff();
					plateHeater.turnOff();
			    } 
				if (boilerHeater.statusHeater.equals(Heater.ON) && (containerPot.getState().equals("off"))) 
			      {
					System.out.println("el estaus del boiler heater is calentando: " + boilerHeater.statusHeater);
   					if (receptacle.getIndicatorReceptacle().equals(Receptacle.NOT_FILLED))
   					{
						System.out.println("no tiene granos de cafe el receptaculo");
						boilerHeater.turnOff();
						plateHeater.turnOff();
					} 
   					else if (containerPot.getState().equals(Pot.POT_NOT_EMPTY))
					{
							IndicatorLight indicatorLight = new IndicatorLight();
							indicatorLight.setIndicatorLight("On");							
							System.out.println("el Pot tiene cafe");
					}	
     			  }
	    	   }
				else {
					 System.out.println("La valvula esta abierta, quiere cerrarlo? s/n");
					 sn = (char) Integer.parseInt(br.readLine());
					 if (sn=='s')
					 {
						 containerBoiler.relief.setValveState("on");
					 }
					 else if (sn=='n')
					 {
						 containerBoiler.relief.setValveState("off");
					 }
					 else{
						 System.out.println("Escoja entre s/n");
					      }			    	 
					}	
			  }else {
		    	 System.out.println("Ingrese cantidad de vasos para llenar el boiler");
		    	 var = Integer.parseInt(br.readLine());
		    	 containerBoiler.fillWater(var);		    	 
		     }	
     }catch (IOException e) {
    	e.printStackTrace();
    } finally {
       
    } 
	     }
    }
