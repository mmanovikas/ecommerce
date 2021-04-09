<%-- 
    Document   : cart
    Created on : Apr 9, 2021, 7:06:59 PM
    Author     : bajaj
--%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

String driver = "com.mysql.jdbc.Driver";
String name=null;


Class.forName(driver);

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="mainpage.html">Back</a>
        <table border="5" bordercolor="red">
          <tr style="font-weight: bold">
              <td>Product Name</td>
              <td>Price</td>
          </tr>
        <tr>
<%
try{
        connection = DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/ecommerce?zeroDateTimeBehavior=convertToNull","root","");

statement=connection.createStatement();
String sql ="select * from cart";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
 <tr>
<td><%=resultSet.getString(1) %></td>
<td><%=resultSet.getString(2) %></td>
 </tr>
 <%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
        </table>
        <button>BUY</button>
    </body>
</html>
