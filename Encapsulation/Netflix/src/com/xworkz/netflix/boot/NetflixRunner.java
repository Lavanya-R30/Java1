package com.xworkz.netflix.boot;

import com.xworkz.netflix.app.Netflix;

public class NetflixRunner {

	public static void main(String[] args) {

		System.out.println("Running main in netflixRunner ");
        Netflix netflix = new Netflix();
        
        System.out.println("accountHolderName: " + netflix. getAccountHolderName());
        netflix.setAccountHolderName("Lavanya");
        System.out.println("accountHolderName:" + netflix. getAccountHolderName());
        
        System.out.println("subscriptionPlan: " + netflix. getSubscriptionPlan());
        netflix.setSubscriptionPlan("Premium");
        System.out.println("subscriptionPlan:" + netflix. getSubscriptionPlan());
        
        System.out.println("paymentMethod: " + netflix. getPaymentMethod());
        netflix.setPaymentMethod("1000");
        System.out.println("paymentMethod:" + netflix. getPaymentMethod());
        
        
        System.out.println("devicesAllowed: " + netflix. getDevicesAllowed());
        netflix.setDevicesAllowed(5);
        System.out.println("devicesAllowed:" + netflix.getDevicesAllowed());
        
        
        System.out.println("isActive: " + netflix.getProfilePictureUrl());
        netflix.setActive(true);
        System.out.println("isActive:" + netflix.getProfilePictureUrl());
        
        
        System.out.println("totalWatchedHours: " + netflix.getTotalWatchedHours());
        netflix.setTotalWatchedHours(1000);
        System.out.println("totalWatchedHours:" + netflix.getTotalWatchedHours());

        System.out.println("isPremium: " + netflix.isPremium());
        netflix.setPremium(true);
        System.out.println("isPremium:" + netflix.isPremium());
        
        System.out.println(" preferredLanguage: " + netflix.getPreferredLanguage());
        netflix.setPreferredLanguage("Telugu");
        System.out.println(" preferredLanguage:" + netflix.getPreferredLanguage());
        
        System.out.println("accountAgeMonths: " + netflix.getAccountAgeMonths());
        netflix.setAccountAgeMonths(22);
        System.out.println("accountAgeMonths:" + netflix.getAccountAgeMonths());
        
        System.out.println(" billingAddress: " + netflix.getBillingAddress());
        netflix. setBillingAddress("shimoga");
        System.out.println("billingAddress:" + netflix. getBillingAddress());


        System.out.println("watchlist: " + netflix.getWatchlist());
        netflix.setWatchlist("youtube");
        System.out.println("watchlist:" + netflix.getWatchlist());

      

        System.out.println("hasDownloads: " + netflix.isHasDownloads());
        netflix.setHasDownloads(false);
        System.out.println("hasDownloads:" + netflix. isHasDownloads());







	}

}
