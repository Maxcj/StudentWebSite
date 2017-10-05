<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    
<%@page import="com.zking.web.logic.dao.UserinfoDAO"%>
<%@page import="com.zking.web.logic.entity.Userinfo"%>
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


		

<!--使用row建立bootstrap的栅格系统 ，bootstrap将屏幕划分为12列 然后使用login-box设定这个div为登录窗口样式-->
  <div class="row login-box">
  <!--定义窗口横跨4列 col-md-offset-4使得窗口右移4列，形成居中显示效果-->
     <div  class="col-md-4 col-md-offset-4">
     <!--使用panel定义面板 panel-primary规定面板的皮肤颜色(也可以设为panel-info等)-->
         <div  class="panel panel-primary">
            <!--设定头部标题栏-->
            <div class="panel-heading">登录</div>
            <!--设定面板主体，我们的表单元素要全部放在这里面-->
            <div class="panel-body">
            <!-- 修改登录请求的处理地址为login.do -->
               <form action="login.do" method="post">
               <!--form-group对每个表单域进行分组-->
                  <div class="form-group">
                      <label>用户名:</label>
                      <!--给表单域添加form-control样式，能够美化文本框-->
                      <input type="text" class="form-control" name="username">
                  </div>
                  <div class="form-group">
                      <label>密 码:</label>
                      <input type="password" class="form-control" name="pwd">
                  </div>
                  <div class="form-group">
                     <div class="col-md-4 col-md-offset-3">
                      <input type="submit" class="btn btn-primary" name="" value="登录">
                     </div>
                     <div>
                      <input type="reset"  class="btn btn-warning" name="" value="重置">
                     </div>

                  </div>
               </form>
            </div>
         </div>

     </div>
  </div>




</body>
    <script src="css/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="js/canvas.js"></script>
</html>