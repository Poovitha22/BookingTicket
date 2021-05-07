package com.chainsys.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Payment {
	public static void paymentBilling(int billingType)
	{
		System.out.println("ENTER THE PAYMENT OPTION");
		
		switch(billingType)
		{
		case 1:
		{
			System.out.println("YOUR CHOSSING CARDTYPE IS DEBITCARD");
			break;
		}
		case 2:
		{
			System.out.println("YOUR CHOSSING CARDTYPE IS CREDITCARD");
			break;
        }
		case 3:
		{
			System.out.println("YOUR CHOSSING CARDTYPE IS NETBANKING");
			break;
        }
		case 4:
		{
			System.out.println("YOUR CHOSSING CARDTYPE IS WALLETS");
			break;
        }
		case 5:
		{
			System.out.println("YOUR CHOSSING CARDTYPE IS UPI");
			break;
        }
		case 6:
		{
			System.out.println("YOUR CHOSSING CARDTYPE IS CREDITCARD");
			break;
        }
		
		}
	}
    public static void generateOTP() {
        long cardNo=983487457324L;
        long mobileNo=9629324387L;
        System.out.println("ENTER THE CARD NUMBER :");
        System.out.println(cardNo);
        System.out.println("ENTER THE MOBILE NO");
        System.out.println(mobileNo);
        HashMap<Long,Integer> otp = new HashMap<Long,Integer>();
        otp.put(9629324387L, 23456);
        Integer oneTimePassword=otp.get(9629324387L);
        System.out.println("YOUR OTP IS "+oneTimePassword);
        }
    public static void payment()
    {
    System.out.println("ENTER THE OTP :"+ 23456);
    System.out.println("ENTER THE BILL AMOUNT : "+4500);
    System.out.println("SUCCESSFULLY PAID");
    }
    public static void displayCardType()
    {
		System.out.println("LIST THE PAYMENT TYPE");
		List<String> cardType = new ArrayList<String>();
		cardType.add("DEBITCARD");
		cardType.add("CREDITCARD");
		cardType.add("NETBANKING");
		cardType.add("WALLETS");
		cardType.add("UPI");
		cardType.add("CASHCARDS");
		System.out.println("List 1 : " + cardType.get(0));
		System.out.println("List 2 : " + cardType.get(1));
		System.out.println("List 3 : " + cardType.get(2));
		System.out.println("List 4 : " + cardType.get(3));
		System.out.println("List 5 : " + cardType.get(4));
		System.out.println("List 6 : " + cardType.get(5));
		
    }
	public static void main(String[] args) {
		System.out.println("WE ACCEPT VARIOUS PAYMENT OPTINS TO COMPLETE YOUR BOOKING LIKE DEBIT CARD,CREDIT CARD,NET BANKING, WALLETS,UPI,CASH CARDS AND MORE ");
        displayCardType();
        paymentBilling(3);
        generateOTP();
        payment();
	}

}
