package com.hs.creational.builder;

public class BuilderDesignPatternTest {
	public static void main(String args[]) {
		UserProfile user1 = new UserProfile.UserProfileBuilder("John", "Doe").setEmail("john.doe@example.com")
				.setPhoneNumber("123-456-7890").setAddress("123 Elm Street").setOccupation("Software Engineer").build();

		System.out.println(user1);
	}
}
