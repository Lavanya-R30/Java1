package com.xworkz.github.boot;

import com.xworkz.github.app.GitHub;

public class GitHubRunner {

	public static void main(String[] args) {
		System.out.println("Running main in GitHubRunner");
        GitHub gitHubProfile = new GitHub();
        
        System.out.println(gitHubProfile.getDevelopCompany());
        gitHubProfile.setDevelopCompany("Microsoft");
		System.out.println("company: " + gitHubProfile.getDevelopCompany());

		System.out.println("Started year" + gitHubProfile.getStartedYear());
		gitHubProfile.setStartedYear(2009);
		System.out.println("Started year" + gitHubProfile.getStartedYear());
		
		System.out.println("Snapchat Latest Version"+gitHubProfile.getLatestVersion());
		gitHubProfile.setLatestVersion(25.20f);
		System.out.println("Snapchat Latest Version"+gitHubProfile.getLatestVersion());

		System.out.println("Username: " + gitHubProfile.getUsername());
        gitHubProfile.setUsername("Lavanya R");
        System.out.println("Username: " + gitHubProfile.getUsername());
        
        System.out.println("Repositories: " + gitHubProfile.getRepositories());
        gitHubProfile.setRepositories(25);
        System.out.println("Repositories: " + gitHubProfile.getRepositories());
        
        System.out.println("Followers: " + gitHubProfile.getFollowers());
        gitHubProfile.setFollowers(180);
        System.out.println("Followers: " + gitHubProfile.getFollowers());
        
        System.out.println("Following: " + gitHubProfile.getFollowing());
        gitHubProfile.setFollowing(109);
        System.out.println("Following: " + gitHubProfile.getFollowing());
        
        System.out.println("Verified Account: " + gitHubProfile.isVerified());
        gitHubProfile.setVerified(true);
        System.out.println("Verified Account: " + gitHubProfile.isVerified());
       
        System.out.println("Joined Date: " + gitHubProfile.getJoinedDate());
        gitHubProfile.setJoinedDate(28-11-2001);
        System.out.println("Joined Date: " + gitHubProfile.getJoinedDate());
        
        System.out.println("Bio: " + gitHubProfile.getBio());
        gitHubProfile.setBio("Fresher");
        System.out.println("Bio: " + gitHubProfile.getBio());
        
        System.out.println("Email: " + gitHubProfile.getEmail());
        gitHubProfile.setEmail("Lavs@gmail.com");
        System.out.println("Email: " + gitHubProfile.getEmail());
        
        System.out.println("Contributions: " + gitHubProfile.getContributions());
        gitHubProfile.setContributions(508);
        System.out.println("Contributions: " + gitHubProfile.getContributions());
        
        System.out.println("Website: " + gitHubProfile.getWebsite());
        gitHubProfile.setWebsite("https://github.com/Lavanya");
        System.out.println("Website: " + gitHubProfile.getWebsite());
        
        System.out.println("Student: " + gitHubProfile.isStudent());
        gitHubProfile.setStudent(false);
        System.out.println("Student: " + gitHubProfile.isStudent());
       
    }

	}


