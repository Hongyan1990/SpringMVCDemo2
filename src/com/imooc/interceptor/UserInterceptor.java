package com.imooc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UserInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object arg2) throws Exception {
//		String url = req.getRequestURI();
//		if(url.indexOf("/tologin")>=0 || url.indexOf("/mylogin")>=0) return true;
//		HttpSession session = req.getSession();
//		Object obj = session.getAttribute("user");
//		if(obj != null) return true;
//		req.setAttribute("msg", "»¹Ã»µÇÂ¼£¬ÇëÏÈµÇÂ¼£¡");
//		req.getRequestDispatcher("/mylogin.jsp").forward(req, res);
		return true;
	}

}
