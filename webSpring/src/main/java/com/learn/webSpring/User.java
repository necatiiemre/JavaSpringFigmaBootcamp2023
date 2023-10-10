package com.learn.webSpring;

import java.time.LocalDate;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
public record User(
		@NotBlank
		String name,
		@NotBlank
		String surname,
		@Min(12)
		@Max(100)
		Integer age,
		@Email
		String email,
		String tcIdentityNo,
		@PastOrPresent
		LocalDate birthDate,
		@Size(max = 250)
		String address,
		@NotBlank
		String username
		
		
		) {

	@AssertTrue
	public boolean isUsernameValid() {
		return !username.equals("admin");
	}
}
