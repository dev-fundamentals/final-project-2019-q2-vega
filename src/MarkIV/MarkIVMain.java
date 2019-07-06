package MarkIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarkIVMain {

	
	public static void main(String[] args) throws IOException {

		int agua;    	
    	BufferedReader console = null;
    	CoffeeMaker coffeMaker;
		
		 try {			   
			 coffeMaker = new CoffeeMaker();
			 console = new BufferedReader(new InputStreamReader(System.in));  	
 	
	         System.out.print("    CAFETERA MARK IV\n");
	         System.out.print("Ingrese de 1 a 12 copas de agua: ");
             agua = Integer.parseInt(console.readLine());    
                                    
             coffeMaker.pushButton();
             coffeMaker.prepareCoffee(agua);        
             }catch (IOException e) {
	        	
	        } finally {
	            if (console != null) {
	                try {
	                    console.close();
	                } catch (IOException e) {
	            
	                }
	            }
	        }  	 
		
	

	}

}
