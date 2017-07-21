<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/main.css">
	

  </head>
  
  <body>
  <div>
  <form action="getByName" >
  <input type="text" name="name" />
  <input type="submit" value="查询"/>
  </form>
  <a href="toadd">新增</a>
  </div>
 
   <table border="1">
                <tr>
                    <td>id</td>
                    <td>姓名</td>
                    <td>年龄</td>
                    <td>年级</td>
                    <td>操作</td>
                </tr>
                   <c:forEach var="student" items="${list }" varStatus="status">
					<tr >
						<td>
						<span>${student.id }</span>
						</td>
						<td>
						<span>${student.name }</span>
						</td>
						<td>
						<span>${student.age}</span>
						</td>
						<td>
							<span>
								<c:if test="${student.nianji==1}">一年级</c:if>
								<c:if test="${student.nianji==2}">二年级</c:if>
								<c:if test="${student.nianji==3}">三年级</c:if>
							</span>
						</td>
						<td>
							<span>
							<a href="<%=basePath%>getById?id=${student.id }">修改</a>
							<a href="<%=basePath%>delete?id=${student.id }">删除</a>
							</span>
						</td>
					</tr>
				</c:forEach>
			</table>
   </body>
</html>
