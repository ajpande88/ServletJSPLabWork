<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "com.message.MessageBo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body {
    background-image:
        url('http://cdn3.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
}
</style>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crunchify JSP Servlet Example</title>
</head>
<body>
 
    <div align="center" style="margin-top: 50px;">
      <% MessageBo message =(MessageBo) request.getAttribute("message");
         if(message==null){
        	 	message=new MessageBo("");
         }
      %>
        <h1><%=message.getMessage() %></h1>
        </form>
 
    </div>
 
</body>
</html>