package com.xworkz.linkedin.boot;

import com.xworkz.linkedin.app.Linkedin;

public class LinkedinRunner {

	public static void main(String[] args) {

		System.out.println("Running main in LinkedinRunner ");
        Linkedin linkdein = new Linkedin();
        
        System.out.println("Full Name: " + linkdein.getFullName());
        linkdein.setFullName("Lavanya");
        System.out.println("Full Name: " + linkdein.getFullName());
        
        System.out.println("Headline: " + linkdein.getHeadline());
        linkdein.setHeadline("Computer Science ");
        System.out.println("Headline: " + linkdein.getHeadline());
        
        System.out.println("Country: " + linkdein.getCountry());
        linkdein.setCountry("Karnataka");
        System.out.println("Country: " + linkdein.getCountry());
       
        System.out.println("University: " + linkdein.getUniversity());
        linkdein.setUniversity("VTU");
        System.out.println("University: " + linkdein.getUniversity());
        
        System.out.println("Connections: " + linkdein.getConnections());
        linkdein.setConnections(300);
        System.out.println("Connections: " + linkdein.getConnections());
        
        System.out.println("Email: " + linkdein.getEmail());
        linkdein.setEmail("lavs@gmail.com");
        System.out.println("Email: " + linkdein.getEmail());
        
        System.out.println("Phone Number: " + linkdein.getPhoneNumber());
        linkdein.setPhoneNumber("+1 123-456-7890");
        System.out.println("Phone Number: " + linkdein.getPhoneNumber());
       
        System.out.println("Premium Member: " + linkdein.isPremiumMember());
        linkdein.setPremiumMember(false);
        System.out.println("Premium Member: " + linkdein.isPremiumMember());
        
        System.out.println("Profile Picture URL: " + linkdein.getProfilePictureUrl());
        linkdein.setProfilePictureUrl("https://likedin.com/lavanya.jpg");
        System.out.println("Profile Picture URL: " + linkdein.getProfilePictureUrl());
        
        System.out.println("Website: " + linkdein.getWebsite());
        linkdein.setWebsite("https://www.lenkedin.com/Lavanya2001");
        System.out.println("Website: " + linkdein.getWebsite());
        
        System.out.println("Languages: " + linkdein.getLanguages());
        linkdein.setLanguages("English");
        System.out.println("Languages: " + linkdein.getLanguages());
        
        System.out.println("Projects: " + linkdein.getProjects());
        linkdein.setProjects("e_commerece website for Electronics appliances");
        System.out.println("Projects: " + linkdein.getProjects());
        
        System.out.println("Courses: " + linkdein.getCourses());
        linkdein.setCourses("Core Java, Web Development");
        System.out.println("Courses: " + linkdein.getCourses());
       
       
    }

	}


