package bsu.rfct.vlada.group9.var1.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import bsu.rfct.vlada.group9.var1.entity.Ad;
import bsu.rfct.vlada.group9.var1.entity.AdList;
import bsu.rfct.vlada.group9.var1.entity.UserList;
import bsu.rfct.vlada.group9.var1.helper.AdListHelper;
import bsu.rfct.vlada.group9.var1.helper.UserListHelper;

public class StartupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		UserList userList =	UserListHelper.readUserList(getServletContext());
		getServletContext().setAttribute("users", userList);
		AdList adList = AdListHelper.readAdList(getServletContext());
		getServletContext().setAttribute("ads", adList);
		for (Ad ad: adList.getAds()) {
			ad.setAuthor(userList.findUser(ad.getAuthorId()));
			ad.setLastModified(ad.getLastModified());
		}
	}
}
