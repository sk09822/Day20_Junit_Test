package com.blz.day20;

public class UserRegistrationJTest {

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class UserRegistrationJTest {
	UserRegistrationJ userRegistration = new UserRegistrationJ();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Sandipan");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
		boolean result = userRegistration.firstName("sandipan");
		Assert.assertEquals(false, result);
	}
}
