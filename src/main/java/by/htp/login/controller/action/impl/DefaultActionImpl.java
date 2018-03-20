package by.htp.login.controller.action.impl;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import by.htp.login.controller.action.BaseAction;
import static by.htp.login.controller.util.ControllerConstantPool.*;

public class DefaultActionImpl implements BaseAction{

	@Override
	public String chooseAction(HttpServletRequest request) throws SQLException {
		return PAGE_INDEX;
	}
	
	

}
