<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title><s:text name="LoginPage" /></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-contrLLol" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <h1><s:text name="Login" /></h1>
    
   	<s:form action="login">
    	<s:textfield name="username" key="user"/>
    	<s:password name="password" key="pwd"/>
    	<s:submit key="Login"/>
    </s:form>
    <br>
    <a href="logout.action">logout</a>
    <a href="emp-list">List All Employees</a>
   
  </body>
</html>
