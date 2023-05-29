package tests;

import org.testng.Assert;

public class exception {
	public static void main(String[] args) {
		String amount1 = "1000000";
   	 System.out.println(amount1);
   	 String amount = "10,00,000.00 CR";
   	 String replace = amount.replace(",","");
   	 String[] CVAmount = replace.split("[.]"); 
   	 for (String string : CVAmount) {			 
   		 System.out.println(string);
			
		}
   	 System.out.println(CVAmount[0]);
   	 Assert.assertEquals(CVAmount[0], amount1);
   }
}