<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
              <li><a href="index.do">查看</a></li>
              <li  class="active"><a href="addStu.jsp">添加</a></li>
            </ul>
            <form class="navbar-form navbar-left">
               <div class="form-group">
                     <input type="text" class="form-control" name="search">
                     <button class="btn btn-default" type="submit">搜索</button>
               </div>
            </form>

            <ul class="nav navbar-nav  navbar-right">
              <li>
                 <a href="">用户:Tom</a>
              </li>
              <li>
                <a href="login.jsp">退出</a>
              </li>
            </ul>
     </div>
  </nav>

<!--使用row建立bootstrap的栅格系统 ，bootstrap将屏幕划分为12列 然后使用login-box设定这个div为登录窗口样式-->
  <div class="row login-box">
  <!--定义窗口横跨4列 col-md-offset-4使得窗口右移4列，形成居中显示效果-->
     <div  class="col-md-4 col-md-offset-4">
     <!--使用panel定义面板 panel-primary规定面板的皮肤颜色(也可以设为panel-info等)-->
         <div  class="panel panel-primary">
            <!--设定头部标题栏-->
            <div class="panel-heading">添加学生信息</div>
            <!--设定面板主体，我们的表单元素要全部放在这里面-->
            <div class="panel-body">
               <form action="addStu.do" method="post">
               <!--form-group对每个表单域进行分组-->
                  <div class="form-group">
                      <label>姓名:</label>
                      <!--给表单域添加form-control样式，能够美化文本框-->
                      <input type="text" class="form-control" name="username">
                  </div>
                  <div class="form-group">
                      <label>联系电话:</label>
                      <input type="text" class="form-control" name="mobile">
                  </div>
                  <div class="form-group">
                      <label>性别:</label>
                      <label class="radio-inline" >
                       <input type="radio"  name="sex" value="男" checked>男
                      </label>
                      <label class="radio-inline" >
                       <input type="radio"  name="sex" value="女">女
                      </label>
                  </div>
                  <div class="form-group">
                      <label>生日:</label>
                      <input type="text" class="form-control" name="birthday">
                  </div>
                  <div class="form-group">
                      <label>爱好:</label>
                      <label class="checkbox-inline">
                        <input type="checkbox" name="intr" value="阅读">阅读
                      </label>
                      <label class="checkbox-inline">
                        <input type="checkbox" name="intr" value="上网">上网
                      </label>
                      <label class="checkbox-inline">
                        <input type="checkbox" name="intr" value="游泳">游泳
                      </label>
                  </div>
                  <div class="form-group">
                      <label>城市:</label>

                      <select name="city"  class="form-control">
                        <option value="长沙">长沙</option>
                        <option value="北京">北京</option>
                        <option value="上海">上海</option>
                        <option value="广州">广州</option>
                        <option value="深圳">深圳</option>
                        <option value="成都">成都</option>
                      </select>

                  </div>
                  <div class="form-group">
                     <div class="col-md-4 col-md-offset-3">
                      <input type="submit" class="btn btn-primary" name="" value="添加">
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