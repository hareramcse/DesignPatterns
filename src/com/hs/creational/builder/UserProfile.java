package com.hs.creational.builder;

public class UserProfile {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String address;
	private String occupation;

	private UserProfile(UserProfileBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		this.phoneNumber = builder.phoneNumber;
		this.address = builder.address;
		this.occupation = builder.occupation;
	}

	public static class UserProfileBuilder {
		private String firstName;
		private String lastName;
		private String email;
		private String phoneNumber;
		private String address;
		private String occupation;

		public UserProfileBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserProfileBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public UserProfileBuilder setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public UserProfileBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public UserProfileBuilder setOccupation(String occupation) {
			this.occupation = occupation;
			return this;
		}

		public UserProfile build() {
			return new UserProfile(this);
		}
	}

	@Override
	public String toString() {
		return "UserProfile [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", occupation=" + occupation + "]";
	}
}