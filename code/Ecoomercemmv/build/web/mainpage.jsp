<%-- 
    Document   : mainpage
    Created on : Apr 9, 2021, 5:07:30 PM
    Author     : bajaj
--%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!public void details(String name, String price)
{

String driver = "com.mysql.jdbc.Driver";

    try {
    Class.forName(driver);

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
connection = DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/ecommerce?zeroDateTimeBehavior=convertToNull","root","");
PreparedStatement ps=connection.prepareStatement("insert into cart (productname,price)values(?,?)");
    ps.setString(1,name);  
    ps.setString(2,price);
    int i= ps.executeUpdate();
    
}
catch (Exception e) {
    System.out.println("ok");
}
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width: 300px;
  margin: auto;
  text-align: center;
  font-family: arial;
}

.price {
  color: grey;
  font-size: 22px;
}

.card button {
  border: none;
  outline: 0;
  padding: 12px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}

.card button:hover {
  opacity: 0.7;
}
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align:center;
  padding: 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111111;
}
</style>

    </head>
    <body>
        <ul>
  <li><a href="index.html">Logout</a></li>
  <li><a href="">Cart</a></li>

</ul>
<div class="card">
    <br>
  <img src="images/lenovo.jpg" alt="Lenovo" style="width:100%">
  <h1>Lenovo IdeaPad Slim 5</h1>
  <p class="price">58,990/-</p>
  <p>11th Gen Intel Core i5 14" FHD IPS Thin & Light Laptop (8GB/512GB SSD/Win 10/Office/Intel Iris Xe Graphics/Fingerprint Reader/Graphite Grey/Aluminium Surface/1.39Kg), 82FE00K0IN</p>
  <form>
      <p><button name="button1" onclick="details("Lenovo IdeaPad Slim 5","58,990")">Add to Cart</button></p>
  </form>
</div>
    </body>
</html>
