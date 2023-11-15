<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
 <form method="get" action="/home">
  <select name=lang>
  	<option value="en"><s:message code="lang.en"/></option>
  	<option value="de"><s:message code="lang.de"/></option>
  	<option value="sr"><s:message code="lang.sr"/></option>
  </select>
  <input type="submit" value='<s:message code="button"/>'/>
 </form>
 <div style="text-align: center;padding-top:20px"><h1><s:message code="welcome" /></h1></div>
 
</body>
</html>