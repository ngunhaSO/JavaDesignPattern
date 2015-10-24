package com.pattern.Decorator;

public class SecureEmailDecorator extends EmailDecorator {
	
	private String content;
	
	public SecureEmailDecorator(IEmail basicEmail) {
		super(basicEmail);
	}
	
	@Override
	public String getContents() {
		System.out.println("....SECURE EMAIL.....");
		content = encrypt(originalEmail.getContents());
		return content;
	}

	private String encrypt(String contents) {
		return "encrypting: " + contents;
	}

}
