package com.xworkz.facebook.boot;

import com.xworkz.facebook.app.FaceBook;

public class FaceBookRunner {

	public static void main(String[] args) {

		System.out.println("Running main in FacebookRunner:");
        FaceBook faceBook = new FaceBook();

        System.out.println("Full Name: " + faceBook.getFullName());
        faceBook.setFullName("Lavanya R");
        System.out.println("Full Name: " + faceBook.getFullName());
        
        System.out.println("Username: " + faceBook.getUsername());
        faceBook.setUsername("Lavanya");
        System.out.println("Username: " + faceBook.getUsername());
        
        System.out.println("Email: " + faceBook.getEmail());
        faceBook.setEmail("Lavs@gmail.com");
        System.out.println("Email: " + faceBook.getEmail());
        
        System.out.println("Friend Count: " + faceBook.getFriendCount());
        faceBook.setFriendCount(500);
        System.out.println("Friend Count: " + faceBook.getFriendCount());
        
        System.out.println("Posts Count: " + faceBook.getPostsCount());
        faceBook.setPostsCount(100);
        System.out.println("Posts Count: " + faceBook.getPostsCount());
        faceBook.setPhotosCount(300);
       
        System.out.println("Bio: " + faceBook.getBio());
        faceBook.setBio("Foodie, travel lover.");
        System.out.println("Bio: " + faceBook.getBio());
        
        System.out.println("Verified: " + faceBook.isVerified());
        faceBook.setVerified(true);
        System.out.println("Verified: " + faceBook.isVerified());
        
        System.out.println("Location: " + faceBook.getLocation());
        faceBook.setLocation("bhadravathi");
        System.out.println("Location: " + faceBook.getLocation());
        
        System.out.println("Education: " + faceBook.getEducation());
        faceBook.setEducation("Computer Science");
        System.out.println("Education: " + faceBook.getEducation());
       
        System.out.println("Birthday: " + faceBook.getBirthday());
        faceBook.setBirthday("nov 28, 2001");
        System.out.println("Birthday: " + faceBook.getBirthday());

        System.out.println("Age: " + faceBook.getAge());
        faceBook.setAge(22);
        System.out.println("Age: " + faceBook.getAge());
        
        System.out.println("Friend Requests: " + faceBook.getFriendRequests());
        faceBook.setFriendRequests(9);
        System.out.println("Friend Requests: " + faceBook.getFriendRequests());
        
        System.out.println("Is Active: " + faceBook.isActive());
        faceBook.setActive(true);
        System.out.println("Is Active: " + faceBook.isActive());

       
    }


	}


