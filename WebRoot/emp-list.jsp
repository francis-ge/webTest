<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'emp-list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
   <h3>list</h3>
   <s:debug></s:debug>
  <body>
		    <table cellpadding="10" cellspacing="0" border="1">
		    	<thead>
		    	<tr>
						<td>ID</td>
						<td>FirstName</td>
						<td>LastName</td>
						<td>E-mail</td>		 
						<td>Edit</td>
						<td>Delete</td>
					</tr>   
		    	</thead>
		    	<tbody>
		    	 	<s:iterator value="#request.emps">
		    	 		<tr>
		    	 		<td>${Id}</td>
	    		 		<td>${firstName}</td>
		    	 		<td>${lastName}</td>
		    	 		<td>${email}</td>
		    	 		<td><a href="">Edit</a></td>
		    	 		<td><a href="emp-delete?employeeId=${employeeId}">Delete</a></td>
		    	 		</tr>
		    	 	</s:iterator>
		    	</tbody>
		    </table>

  </body>
</html>
