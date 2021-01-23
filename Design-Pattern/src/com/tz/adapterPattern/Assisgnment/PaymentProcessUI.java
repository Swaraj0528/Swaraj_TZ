package com.tz.adapterPattern.Assisgnment;

import java.util.Scanner;

public class PaymentProcessUI {
	
	public void amountToBePaid(double amount) {
		PaymentAdapter pa= new PaymentAdapter();
		System.out.println("Amount To be Paid in Doller: "+"$"+pa.covertToDoller(amount));
	}

	public static void main(String[] args) {
		
		PaymentProcessUI pu = new PaymentProcessUI();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input in Rupees:");
		double money = sc.nextDouble();
		pu.amountToBePaid(money);
	}
}
