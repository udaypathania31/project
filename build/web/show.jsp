<%-- 
    Document   : buy
    Created on : Nov 27, 2018, 2:44:55 PM
    Author     : HP
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
    box-sizing: border-box;
}

body {
    background-color: #f1f1f1;
    padding: 20px;
    font-family: Arial;
}
.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
}

/* Center website */
.main {
    max-width: 1000px;
    margin: auto;
}

h1 {
    font-size: 50px;
    word-break: break-all;
}

.row {
    margin: 10px -16px;
}

/* Add padding BETWEEN each column */
.row,
.row > .column {
    padding: 8px;
}

/* Create three equal columns that floats next to each other */
.column {
    float: left;
    width: 33.33%;
    display: none; /* Hide all elements by default */
}

/* Clear floats after rows */ 
.row:after {
    content: "";
    display: table;
    clear: both;
}

/* Content */
.content {
    background-color: white;
    padding: 10px;
}

/* The "show" class is added to the filtered elements */
.show {
  display: block;
}

/* Style the buttons */
.btn {
  border: none;
  outline: none;
  padding: 12px 16px;
  background-color: white;
  cursor: pointer;
}

.btn:hover {
  background-color: #ddd;
}

.btn.active1 {
  background-color: #666;
  color: white;
}
.header-left
{
    float:left;
}
table, td, th {
    border: 1px solid black;
}

table {
    border-collapse: collapse;
    width: 100%;
}

th {
    height: 50px;
    text-decoration:blink;
}
.buy
{
 background-color:#00ff00;
 width: 100%;
}
</style>
</head>
<body>
<div class="header">
    <div class="header-left">
        <img src="images/user.png" height="100 px" width="80 px"><br>
        <center><% out.println(session.getAttribute("name")); %></center>
    </div>    
  <div class="header-right">
    <a class="active" href="buy.jsp">Buy</a>
    <a href="sell.jsp">Sell</a>
  </div>
</div>
<!-- MAIN (Center website) -->
<div class="main">
<hr>

<div id="myBtnContainer">
  <button class="btn " onclick="filterSelection('all')"> Show all</button>
  <button class="btn" onclick="filterSelection('bikes')">Bikes</button>
  <button class="btn" onclick="filterSelection('cars')"> Cars</button>
  <button class="btn" onclick="filterSelection('mobile')">Mobiles</button>
</div>
 
    <%
    Connection conn;
    Statement ps;
    ResultSet rs=null;
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?user=uday&password=uday&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true");
     try {
         String str="select * from inventory where category='bikes'";
         ps=conn.createStatement();
         rs=ps.executeQuery(str);
         while(rs.next())
         {
          
 %>
 <div class="row">
 <div class="column bikes">
 <div class="content">
   <h4><% out.println(rs.getString("title")); %></h4><br>
   <p><%= rs.getString("Description") %></p>
    </div>
  </div>
    <%
         }
     }
     catch(Exception e)
     {
         out.println(e);
     }
    %>
 
      <%
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?user=root&password=root&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true");
     try {
         String stm="select * from inventory where category='cars'";
         ps=conn.createStatement();
         rs=ps.executeQuery(stm);
         while(rs.next())
         {
 %>
   <div class="column cars">
    <div class="content">
     <h4><%= rs.getString("title") %></h4><br>
     <p><%= rs.getString("Description") %></p>
    </div>
  </div>
    <%
         }
     }
     catch(Exception e)
     {
         out.println(e);
     }
    %>
 
 <%
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?user=root&password=root&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true");
     try {
         String stm="select * from inventory where category='mobile'";
         ps=conn.createStatement();
         rs=ps.executeQuery(stm);
         while(rs.next())
         {
 %>
  <div class="column mobile">
    <div class="content">
      <div class="column cars">
    <div class="content">
     <h4><%= rs.getString("title") %></h4><br>
     <p><%= rs.getString("Description") %></p>
    </div>
  </div>
    <%
         }
     }
     catch(Exception e)
     {
         out.println(e);
     }
    %>
    </div>
  </div>
</div>

<script>
filterSelection("all")
function filterSelection(c) {
  var x, i;
  x = document.getElementsByClassName("column");
  if (c == "all") c = "";
  for (i = 0; i < x.length; i++) {
    w3RemoveClass(x[i], "show");
    if (x[i].className.indexOf(c) > -1) w3AddClass(x[i], "show");
  }
}

function w3AddClass(element, name) {
  var i, arr1, arr2;
  arr1 = element.className.split(" ");
  arr2 = name.split(" ");
  for (i = 0; i < arr2.length; i++) {
    if (arr1.indexOf(arr2[i]) == -1) {element.className += " " + arr2[i];}
  }
}

function w3RemoveClass(element, name) {
  var i, arr1, arr2;
  arr1 = element.className.split(" ");
  arr2 = name.split(" ");
  for (i = 0; i < arr2.length; i++) {
    while (arr1.indexOf(arr2[i]) > -1) {
      arr1.splice(arr1.indexOf(arr2[i]), 1);     
    }
  }
  element.className = arr1.join(" ");
}


// Add active class to the current button (highlight it)
var btnContainer = document.getElementById("myBtnContainer");
var btns = btnContainer.getElementsByClassName("btn");
for (var i = 0; i < btns.length; i++) {
  btns[i].addEventListener("click", function(){
    var current = document.getElementsByClassName("active");
    current[0].className = current[0].className.replace(" active", "");
    this.className += " active";
  });
}
</script>
</body>
</html>
