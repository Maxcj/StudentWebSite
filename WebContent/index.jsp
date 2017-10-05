<%@page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="com.zking.web.logic.entity.Student"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <title>欢迎登录</title>
    <meta charset=utf-8>
    <meta name=description content="">
    <meta name=viewport content="width=device-width, initial-scale=1">
    <!--引入bootstrap的样式文件-->
    <link rel=stylesheet href="css/bootstrap/css/bootstrap.css">
</head>
<body>
  <!--导航栏-- navbar导航栏样式  navbar-default默认颜色-->
  <nav class="navbar navbar-default">
     <div class="navbar-header">
       <a class="navbar-brand" href="#">学生信息管理</a>
     </div>

<!--设置导航项横着排列collapse -->
     <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="#">查看</a></li>
              <li ><a href="addStu.jsp">添加</a></li>
            </ul>
            <form class="navbar-form navbar-left">
               <div class="form-group">
                     <input type="text" class="form-control" name="search">
                     <button class="btn btn-default" type="submit">搜索</button>
               </div>
            </form>

            <ul class="nav navbar-nav  navbar-right">
              <li>
                 <a href="">用户:admin</a>
              </li>
              <li>
                <a href="login.jsp">退出</a>
              </li>
            </ul>
     </div>
  </nav>


   <div  class="row login-box">
       <div class="col-md-8 col-md-offset-2">
            <div class='panel panel-primary'>
                 <div class="panel-heading">
                       学生信息
                 </div>

                 <table class="table table-bordered table-striped">
                   <thead>
                     <tr>
                       <th>编号</th>
                       <th>姓名</th>
                       <th>联系电话</th>
                       <th>性别</th>
                       <th>生日</th>
                       <th>爱好</th>
                       <th>地区</th>
                       <th>操作</th>
                     </tr>
                   </thead>
                   <tbody>
                 <%
                     List<Student> list = (List)request.getAttribute("stuList");
                     for(Student stu :  list)
                     {
                    	 System.out.println(stu);
                    
                 %>  
                     <tr>
                       <td><%=stu.getStuId()%></td>
                       <td><%=stu.getStuName()%></td>
                       <td><%=stu.getStuMobile()%></td>
                       <td><%=stu.getStuSex()%></td>
                       <td><%=stu.getStuBirthday()%></td>
                       <td><%=stu.getStuIntr()%></td>
                       <td><%=stu.getStuArea()%></td>
                       <td>
                           <button type="button" onclick="editStu(<%=stu.getStuId()%>)"  class="btn btn-info btn-xs">编辑</button>
                           <button type="button" onclick="delStu(<%=stu.getStuId()%>)" class="btn btn-danger btn-xs">删除</button>
                       </td>
                     </tr>
                 <%} %>
                   </tbody>
                 </table>


            </div>


       </div>
   </div>


</body>
     <script type="text/javascript">
         function delStu(stuid)
         {
        	 location.href="delStu.do?id="+stuid;
         }
         function editStu(stuid)
         {
        	 location.href="editStu.jsp?id="+stuid;
         }
     </script>
    <script src="css/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="js/canvas.js"></script>
</html>