package com.pattern.Decorator;

public abstract class EmailDecorator implements IEmail {
	//wrapped component
	IEmail originalEmail;
	
	public EmailDecorator(IEmail email) {
		this.originalEmail = email;
	}
}
