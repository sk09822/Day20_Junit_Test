package com.blz.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationJ {
	public boolean firstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	public boolean lastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	public boolean email(String email) {
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean phoneNumber(String phoneNumber) {
		String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.matches();
	}

	public boolean password(String password) {
		String regex = "^[0-9a-zA-Z!,@#$&*().]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

	public boolean passwordRule2(String password) {
		String regex = "^(?=.*[A-Z]){1}(?=.*[a-z]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();

	}

	public boolean passwordRule3(String password) {
		String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();

	}

	public boolean passwordRule4(String password) {
		String regex = "^[0-9a-zA-Z!,@#$&*().]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

    public boolean emailIdValidator(String emailId) {
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }
    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail2_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail3_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail4_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc123@gmail.a –");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail5_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc123@.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail6_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator(".abc@abc.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail7_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc.@gmail.com –");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc@abc@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc..2002@gmail.com");
        Assert.assertEquals(false, result);
    }
}
