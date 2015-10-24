package com.pattern.Decorator;

public class Demo {
	public static void main(String[] args) {
		IEmail email = new Email("hello");
		IEmail externalEmail = new ExternalEmailDecorator(email);
		System.out.println("get content from external email");
		System.out.println(externalEmail.getContents());
		
		IEmail secureEmail = new SecureEmailDecorator(email);
		System.out.println("get content from secure email");
		System.out.println(secureEmail.getContents());
		
		System.out.println("SENDING EMAIL.....");
		sendEmail("This is decorator pattern");
		
	}
	
	public static void sendEmail(String message) {
		IEmail email = new Email(message);
		ExternalEmailDecorator external = new ExternalEmailDecorator(email);
		System.out.println("the following is message sent: \n" + external.getContents());
	}
}
