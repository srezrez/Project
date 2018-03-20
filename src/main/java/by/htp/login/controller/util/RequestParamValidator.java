package by.htp.login.controller.util;

import by.htp.login.controller.RequestParamValidationException;

public class RequestParamValidator {
	
	public RequestParamValidator() {
		
	}
	
	public static void validateUserLoginPass(String login, String pass) {
		if(login == null || pass == null) {
			throw new RequestParamValidationException();
		}
	}
	
	public static void validateSearchBook (String title) {
		if(title==null) {
			throw new RequestParamValidationException();
		}
	}

}
