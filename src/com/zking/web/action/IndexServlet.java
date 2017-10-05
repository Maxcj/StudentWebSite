package com.zking.web.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zking.web.logic.dao.StuDAO;
import com.zking.web.logic.entity.Student;

/**
 * Servlet implementation class IndexServlet
 */
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            StuDAO  stuDao = new StuDAO();
            
             List<Student> list = stuDao.findAllStudent();
             System.out.println(list);
            //如果要将数据从servlet传给jsp页面的话 需要使用forward转发的跳转形式，并且使用request对象传递数据
             //在requset对象中存储list
             request.setAttribute("stuList", list);
             //再转发到index.jsp
             request.getRequestDispatcher("index.jsp").forward(request, response);
             //response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
