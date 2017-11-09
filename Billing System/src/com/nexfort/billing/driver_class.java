package com.nexfort.billing;
import java.util.Scanner;
public class driver_class {
public static void main(String[] args) throws InsufficientFundException, notFoundException {
	System.out.println("Welcome to Billing System App");
	Scanner scn = new Scanner(System.in);
	System.out.println("Type a category from - Clothing, Electronics and Sports");
	String catg = scn.nextLine();
	ItemList ctin0 = new ItemList(catg.trim());
	System.out.println(ctin0.showTypes().trim());
	String type = scn.nextLine();
	ItemList ctin1 = new ItemList("typ",type.trim());
	System.out.println(ctin1.showItems().trim());
	String item = scn.nextLine();
	System.out.println("Type number of items to Buy");
	int no_item = scn.nextInt();
	ItemList ctin = new ItemList(catg, type, item, no_item);
	int billing_amnt = Integer.parseInt(ctin.amount());
	if(billing_amnt > ctin.balance){	
		throw new InsufficientFundException("Low Balance");
	}else{
		if(billing_amnt >10000 && billing_amnt < 20000){
			System.out.println(ctin.amount());
			double i =  .05d;
			double cb = billing_amnt * i ;
			double total = billing_amnt - cb;
			double tax = total + (total*.12) + (total*.08);
			System.out.println("after 5% cashback, you get,"+ cb);
			System.out.println("Total Cost "+ total);
			System.out.println("After GST 6%, CGST 6% and VAT 6%, you have to pay, "+ tax);			
		}else if(billing_amnt >20000 && billing_amnt < 35000){
			System.out.println(ctin.amount());
			double i =  .1d;
			double cb = billing_amnt * i ;
			double total = billing_amnt - cb;
			double tax = total + (total*.12) + (total*.08);
			System.out.println("after 10% cashback, you get,"+cb);
			System.out.println("Total Cost "+ total);
			System.out.println("After GST 6%, CGST 6% and VAT 6%, you have to pay, "+ tax);
		}else if(billing_amnt >35000 && billing_amnt < 50000){
			System.out.println(ctin.amount());
			double i =  .15d;
			double cb = billing_amnt * i ;
			double total = billing_amnt - cb;
			double tax = total + (total*.12) + (total*.08);
			System.out.println("after 15% cashback, you get,"+cb) ;
			System.out.println("Total Cost "+ total);
			System.out.println("After GST 6%, CGST 6% and VAT 6%, you have to pay, "+ tax);
        		}else if(billing_amnt == 50000){
			System.out.println(ctin.amount());
			System.out.println("Coupon of 20000");
		}
	}
}
}