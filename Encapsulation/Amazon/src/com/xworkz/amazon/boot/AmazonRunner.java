package com.xworkz.amazon.boot;

import com.xworkz.amazon.app.Amazon;

public class AmazonRunner {

	public static void main(String[] args) {

       Amazon user = new Amazon();
		
		System.out.println(user.getDevelopCompany());
		user.setDevelopCompany("Amazon.com");
		System.out.println("company: " + user.getDevelopCompany());

		System.out.println("Started year" + user.getStartedYear());
		user.setStartedYear(1994);
		System.out.println("Started year" + user.getStartedYear());
		
		System.out.println("Snapchat Latest Version"+user.getLatestVersion());
		user.setLatestVersion(32.52f);
		System.out.println("Snapchat Latest Version"+user.getLatestVersion());

		System.out.println("Full Name: " + user.getFullName());
		user.setFullName("Lavanya R");
		System.out.println("Full Name: " + user.getFullName());
		
		System.out.println("Username: " + user.getUsername());
		user.setUsername("Lavanya");
		System.out.println("Username: " + user.getUsername());
		
		System.out.println("Email: " + user.getEmail());
		user.setEmail("Lavs@gmail.com");
		System.out.println("Email: " + user.getEmail());
		
		System.out.println("Shipping Address: " + user.getShippingAddress());
		user.setShippingAddress("789,Tarikere,Bhadravathi");
		System.out.println("Shipping Address: " + user.getShippingAddress());

		System.out.println("Billing Address: " + user.getBillingAddress());
		user.setBillingAddress("Srinivas Nagar, Bangalore");
		System.out.println("Billing Address: " + user.getBillingAddress());
		
		System.out.println("Phone Number: " + user.getPhoneNumber());
		user.setPhoneNumber("9148632138");
		System.out.println("Phone Number: " + user.getPhoneNumber());
		
		System.out.println("Payment Method: " + user.getPaymentMethod());
		user.setPaymentMethod("Credit Card");
		System.out.println("Payment Method: " + user.getPaymentMethod());

		System.out.println("Wishlist Item Count: " + user.getWishlistItemCount());
		user.setWishlistItemCount(10);
		System.out.println("Wishlist Item Count: " + user.getWishlistItemCount());

		System.out.println("Prime Member: " + user.isPrimeMember());
		user.setPrimeMember(true);
		System.out.println("Prime Member: " + user.isPrimeMember());
		
		System.out.println("Gift Card Codes: " + user.getGiftCardCodes());
		user.setGiftCardCodes("AMZ123, AMZ456");
		System.out.println("Gift Card Codes: " + user.getGiftCardCodes());
		
		System.out.println("Subscription Services: " + user.getSubscriptionServices());
		user.setSubscriptionServices("Amazon Prime, Music Unlimited");
		System.out.println("Subscription Services: " + user.getSubscriptionServices());

	
	}


	}


