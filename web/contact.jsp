<%
        Object name = request.getSession().getAttribute("userName");
        if(name != null){
            System.out.println("chk 1");
            
        
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<style>
    .zoomin img { height: 100px; width: 100px;
 -webkit-transition: all 2s ease;
 -moz-transition: all 2s ease; -ms-transition:
 all 2s ease; transition: all 2s ease; }
 .zoomin img:hover { width: 200px; height: 200px; }
h1 {
    color: black;
    font-family: verdana;
    font-size: 300%;
}
div.background {
  background: url(nm.jpg) repeat;
  border: 2px solid black;
}

div.transbox {
  margin: 30px;
  background-color: #ffffff;
  border: 1px solid black;
  opacity: 0.6;
  filter: alpha(opacity=60); /* For IE8 and earlier */
}

div.transbox p {
  margin: 5%;
  font-weight: bold;
  color: #000000;
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a, .dropbtn {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
    background-color: red;
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.show {display:block;}
img {
    border: 1px solid #ddd;
    border-radius: 4px;
    padding: 5px;
    align ="middle"
}
</style>
</head>
<body>
<div class="background">
  <div class="transbox">
  <h1>NEWS</h1>
  </div>
</div>
<ul>
  <li><a href="main.html">HOME</a></li>
    		<li><a href="preview.html">ABOUT US</a></li>
    		<li><a href="contact.jsp">NEWS </a></li>
    		<li><a href="img.html">IMAGE GALARY</a></li>
    		<li><a href="index.jsp">LOG IN</a></li>
    		<li><a href="gradient.html">CONTACT US</a></li>
</ul>

<div style="background-color:black;color:white;padding:20px;">

</div>
<div style="background-color:grey;color:white;padding:20px;">


<img src="advice.jpg" alt="ROLLS ROYCE PHANTOM" width="1200" height="700">
    <p style="text-align:right ">Handle the difficulty in your own passionate way...<br><br><br>
     you can contact at toll free no.<u>1800-1300-0002-0032</u><br>
or<br>email us at <u>udaypathania31@gmail.com</u></p>
</div>
<div  class="zoomin" style="background-color:grey;color:white;padding:40px;">
<a href="https://www.facebook.com/Autoblog/"><img src="ff.png" alt="Smiley face" align="left" height="100" width="100"></a>
<a href="https://www.instagram.com/autoblog/?hl=en"><img src="ii.png" alt="Smiley face" align="left" height="100" width="100">
<a href="https://twitter.com/therealautoblog?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor"><img src="tt.png" alt="Smiley face" align="left" height="100" width="100">
<a href="https://www.youtube.com/channel/UCkLbQpvXfOO18uYFjg7SkOA"><img src="yy.png" alt="Smiley face" align="left" height="100" width="100">
<a href="https://www.pinterest.com/therealautoblog/"><img src="pp.png" alt="Smiley face" align="left" height="100" width="100">
    <a href="https://www.autoblog.com/"><img src="acad.png" alt="Smiley face" align="left" height="100" width="100">
</div>

</body>
</html>
<%      } 
else{
        System.out.println("chk 2");
         response.sendRedirect("index.html");
}

%>