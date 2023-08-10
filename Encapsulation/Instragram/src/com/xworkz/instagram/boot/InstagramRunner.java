package com.xworkz.instagram.boot;

import com.xworkz.instagram.app.Instagram;

public class InstagramRunner {

	public static void main(String[] args) {

		System.out.println("Runing main in InstagramRunner");

		Instagram instagramProfile = new Instagram();

		System.out.println(instagramProfile.getDevelopCompany());
		instagramProfile.setDevelopCompany("Meta");
		System.out.println("company: " + instagramProfile.getDevelopCompany());

		System.out.println("Started year" + instagramProfile.getStartedYear());
		instagramProfile.setStartedYear(2009);
		System.out.println("Started year" + instagramProfile.getStartedYear());

		System.out.println("Username: " + instagramProfile.getUsername());
		instagramProfile.setUsername("Lavs.Lavanya");
		System.out.println("Username: " + instagramProfile.getUsername());

		System.out.println("Followers Count: " + instagramProfile.getFollowersCount());
		instagramProfile.setFollowersCount(800);
		System.out.println("Followers Count: " + instagramProfile.getFollowersCount());

		System.out.println("Following Count: " + instagramProfile.getFollowingCount());
		instagramProfile.setFollowingCount(200);
		System.out.println("Following Count: " + instagramProfile.getFollowingCount());

		System.out.println("Private Account: " + instagramProfile.isPrivate());
		instagramProfile.setPrivate(false);
		System.out.println("Private Account: " + instagramProfile.isPrivate());

		System.out.println("Posts Per Day: " + instagramProfile.getPostsPerDay());
		instagramProfile.setPostsPerDay(5);
		System.out.println("Posts Per Day: " + instagramProfile.getPostsPerDay());

		System.out.println("Total Likes: " + instagramProfile.getTotalLikes());
		instagramProfile.setTotalLikes(1001);
		System.out.println("Total Likes: " + instagramProfile.getTotalLikes());

		System.out.println("Bio: " + instagramProfile.getBio());
		instagramProfile.setBio("dancer");
		System.out.println("Bio: " + instagramProfile.getBio());

		System.out.println("Email: " + instagramProfile.getEmail());
		instagramProfile.setEmail("Lavi@gmail.com");
		System.out.println("Email: " + instagramProfile.getEmail());

		System.out.println("Age: " + instagramProfile.getAge());
		instagramProfile.setAge(25);
		System.out.println("Age: " + instagramProfile.getAge());

		System.out.println("Gender: " + instagramProfile.getGender());
		instagramProfile.setGender("female");
		System.out.println("Gender: " + instagramProfile.getGender());

		System.out.println("City: " + instagramProfile.getCity());
		instagramProfile.setCity("Karnataka");
		System.out.println("City: " + instagramProfile.getCity());

		System.out.println("Verified Account: " + instagramProfile.isVerified());
		instagramProfile.setVerified(true);
		System.out.println("Verified Account: " + instagramProfile.isVerified());

	}
	}


