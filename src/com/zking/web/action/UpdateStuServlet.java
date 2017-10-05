package com.zking.web.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zking.web.logic.dao.StuDAO;
import com.zking.web.logic.entity.Student;

/**
 * Servlet implementation class UpdateStuServlet
 */
public class UpdateStuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Student stu = new Student();
        stu.setStuId(Integer.parseInt(request.getParameter("stuid")));
        stu.setStuName(request.getParameter("username"));
        stu.setStuSex(request.getParameter("sex"));
        stu.setStuMobile(request.getParameter("mobile"));
        stu.setStuBirthday(request.getParameter("birthday"));
        stu.setStuArea(request.getParameter("city"));
        String[] intr = request.getParameterValues("intr");
        String str="";
        if(intr!=null && intr.length>0)
        {
       	   for(String s : intr)
       	   {
       		    str=str+s+",";
       	   }
        }
        stu.setStuIntr(str);
        
        System.out.println("学生:"+stu);
        
        StuDAO stuDao = new StuDAO();
        stuDao.updateStu(stu);
        //转向到首页，但是到首页之前要先到一个index.do的地址将首页的表格数据查询出来再转到index.jsp
        response.sendRedirect("index.do");	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
