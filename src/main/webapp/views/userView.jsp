<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    
    <title>spring boot form spring</title>
</head>
<body>
    <font color='green'>${msg}</font>
        <form:form action="user" method="POST" modelAttribute="user">
            Name :<form:input path="uname"/> <br/>
            Phone :<form:input path="phone"/> <br/>
            Email :<form:input path="email"/> <br/>
            <input type="submit" value="Submit"/>




        </form:form>



    
 
</body>
</html>
    
  


