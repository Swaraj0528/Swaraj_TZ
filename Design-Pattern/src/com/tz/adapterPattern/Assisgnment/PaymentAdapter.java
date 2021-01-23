package com.tz.adapterPattern.Assisgnment;

public class PaymentAdapter {
	
	
	double rupeetoDollerRate = 80;
	double convertedAmount = 0d;
	
	
	public double covertToDoller(double amountToPaid) {
		
		PaymentProcessor pp = new PaymentProcessorImple();
		double res= pp.paymentAmount(amountToPaid/rupeetoDollerRate);
		return res;
		
	}
	

}
