package com.zking.web.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zking.web.logic.dao.UserinfoDAO;
import com.zking.web.logic.entity.Userinfo;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request http请求
		//response http响应
        //为了防止中文乱码，在从请求获取数据之前需要设置中文编码utf-8
		request.setCharacterEncoding("utf-8");
		//从请求中获取用户的用户名和密码
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		//查询数据库
		UserinfoDAO userDao  = new UserinfoDAO();
		Userinfo user = userDao.findUserByPwd(username, pwd);
		if(user!=null)
		{
			//登录成功  使用重定向跳转
			response.sendRedirect("index.do");
		}else{
			//登录失败
			response.sendRedirect("login.jsp");
		}

        System.out.println("有用户要登录,用户名:"+username+" 密码:"+pwd);
     
        
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
