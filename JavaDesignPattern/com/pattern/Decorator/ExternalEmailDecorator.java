package com.pattern.Decorator;

//concrete decorator
public class ExternalEmailDecorator extends EmailDecorator {

	private String content;
	
	public ExternalEmailDecorator(IEmail basicEmail) {
		super(basicEmail);
	}
	
	@Override
	public String getContents() {
		System.out.println("....EXTERNAL EMAIL.....");
		content = addDisclaimer(originalEmail.getContents());
		return content;
	}
	
	//add new feature
	private String addDisclaimer(String message) {
		return  message + "\nCompany Disclaimer";
	}

}
