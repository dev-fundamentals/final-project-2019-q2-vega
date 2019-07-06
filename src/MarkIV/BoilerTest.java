package MarkIV;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoilerTest {

	@Test
	void fillwater_with_morethancapacity_resulterrormessage()  {
		int actual=13;
		String message="cantidad sobrepasa el capacity del boiler";
		Boiler b=new Boiler();	
		
		assertEquals(message,b.fillWater(actual));
	}
	
	@Test
	void fillwater_with_acceptablecapacity_resultsuccess()  {
		int actual=10;
		String message="El agua fue llenada";
		Boiler b=new Boiler();	
		
		assertEquals(message,b.fillWater(actual));
	}
	
	@Test
	void Nofillwater_resultnoFillWater()  {
		int actual=0;
		String message="EL boiler esta vacio";
		Boiler b=new Boiler();	
		
		assertEquals(message,b.fillWater(actual));
	}	
	
	@Test
	void Norealcase_resulterrormessage()  {
		int actual=-1;
		String message="No es un caso real";
		Boiler b=new Boiler();	
		
		assertEquals(message,b.fillWater(actual));
	}		

}
