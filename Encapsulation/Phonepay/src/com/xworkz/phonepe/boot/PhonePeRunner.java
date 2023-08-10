package com.xworkz.phonepe.boot;

import com.xworkz.phonepe.app.PhonePe;

public class PhonePeRunner {

	public static void main(String[] args) {

		System.out.println("Running main in PhonePeRunner");

		PhonePe phonePe = new PhonePe();
		
		System.out.println(phonePe.getDevelopCompany());
		phonePe.setDevelopCompany("Meta");
		System.out.println("company: " + phonePe.getDevelopCompany());

		System.out.println("Started year" + phonePe.getStartedYear());
		phonePe.setStartedYear(2010);
		System.out.println("Started year" + phonePe.getStartedYear());
		
		System.out.println("Snapchat Latest Version"+phonePe.getLatestVersion());
		phonePe.setLatestVersion(25.20f);
		System.out.println("Snapchat Latest Version"+phonePe.getLatestVersion());

		System.out.println("Full Name: " + phonePe.getFullName());
		phonePe.setFullName("Lavanya");
		System.out.println("Full Name: " + phonePe.getFullName());

		System.out.println("Phone Number: " + phonePe.getPhoneNumber());
		phonePe.setPhoneNumber("9148632138");
		System.out.println("Phone Number: " + phonePe.getPhoneNumber());

		System.out.println("Email: " + phonePe.getEmail());
		phonePe.setEmail("Lavs@gmail.com");
		System.out.println("Email: " + phonePe.getEmail());

		System.out.println("Coins Earned: " + phonePe.getCoinsEarned());
		phonePe.setCoinsEarned(104);
		System.out.println("Coins Earned: " + phonePe.getCoinsEarned());

		System.out.println("Transactions: " + phonePe.getTransactions());
		phonePe.setTransactions(50);
		System.out.println("Transactions: " + phonePe.getTransactions());

		System.out.println("Wallet Balance: " + phonePe.getWalletBalance());
		phonePe.setWalletBalance(2500.80);
		System.out.println("Wallet Balance: " + phonePe.getWalletBalance());

		System.out.println("Referral Code: " + phonePe.getReferralCode());
		phonePe.setReferralCode("PhoNE254");
		System.out.println("Referral Code: " + phonePe.getReferralCode());

		System.out.println("Verified: " + phonePe.isVerified());
		phonePe.setVerified(true);
		System.out.println("Verified: " + phonePe.isVerified());

		System.out.println("Linked Bank Account: " + phonePe.getLinkedBankAccount());
		phonePe.setLinkedBankAccount("876756433423456");
		System.out.println("Linked Bank Account: " + phonePe.getLinkedBankAccount());

		System.out.println("Linked Cards: " + phonePe.getLinkedCards());
		phonePe.setLinkedCards("VISA : 5678");
		System.out.println("Linked Cards: " + phonePe.getLinkedCards());

		System.out.println("QR Code URL: " + phonePe.getQrCodeUrl());
		phonePe.setQrCodeUrl("https://phonepe.com/qr/lavanya");
		System.out.println("QR Code URL: " + phonePe.getQrCodeUrl());

	}

	}


