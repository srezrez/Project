package by.htp.login.controller.util;

import static by.htp.login.controller.util.ControllerConstantPool.*;

import by.htp.login.controller.action.BaseAction;
import by.htp.login.controller.action.impl.DefaultActionImpl;
import by.htp.login.controller.action.impl.RegistrationImpl;
import by.htp.login.controller.action.impl.SearchBookImpl;
import by.htp.login.controller.action.impl.ShowBookListImpl;
import by.htp.login.controller.action.impl.CheckLoginImpl;

public class ActionManager {
	
	private ActionManager() {}
	
	public static BaseAction determineAction(String action) {
		BaseAction act = null;
		
		switch(action) {
		case  REQUEST_PARAM_LOGIN_COMMAND:
			act = new CheckLoginImpl();
			break; 
		case REQUEST_PARAM_REGISTER_COMMAND:
			act = new RegistrationImpl();
			break;
		case REQUEST_PARAM_BOOK_LIST:
			act = new ShowBookListImpl();
			break;
		case REQUESR_PARAM_SEARCH_BOOK:
			act = new SearchBookImpl();
			break;
			
		default:
			act = new DefaultActionImpl();
		}
		return act;
	}

}
