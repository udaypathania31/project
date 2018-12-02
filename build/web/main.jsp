   
   <!DOCTYPE html>

<style>
h1 {
    color: black;
    font-family: verdana;
    font-size: 300%;
}
div.background {
  background: url(uday.jpg) repeat;
  border: 2px solid black;
}

div.transbox {
  margin: 30px;
  background-color: #ffffff;
  border: 1px solid black;
  opacity: 0.6;
  filter: alpha(opacity=60); 
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
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color:  #b30000;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color:  #b30000;
}

div {
    border-radius: 5px;
    background-color:  #ff9999;
    padding: 20px;
}
</style>
<body>
<div class="background">
  <div class="transbox">
  
  <h1>APPLICATION FORM</h1>
  </div>
</div>

<ul>
  <li><a href="main.jsp">HOME</a></li>
    		<li><a href="preview.html">ABOUT US</a></li>
    		<li><a href="leave.jsp">LEAVE FORM </a></li>
    		<li><a href="image.html">IMAGE GALARY</a></li>
    		<li><a href="contact.jsp">NEWS</a></li>
    		<li><a href="index.jsp">LOG IN</a></li>
    		<li><a href="gradient.html">CONTACT US</a></li>
			

</ul>

<div>
  <form action="ApplicationServlet">
    <label for="fname">FIRST NAME</label>
    <input type="text" id="fname" name="firstname" required>

    <label for="lname">LAST NAME</label>
    <input type="text" id="lname" name="lastname" required>
	
	<label for="sid">STUDENT ID</label>
    <input type="text" id="sid" name="sid" required>

    <label for="gender">GENDER</label>
    <select id="gender" name="gender">
      <option value="Man">MALE</option>
      <option value="Women">FEMALE</option>
      <option value="Others">OTHERS</option>
    </select>
    <br>
	<label for="department">DEPARTMENT</label>
    <select id="department" name="department">
      <option value="cs">COMPUTER SCIENCE</option>
      <option value="electronics">ELECTRONICS</option>
      <option value="civil">CIVIL</option>
	  <option value="mech">MECHANICAL</option>
    </select>
    <br>
	 <label for="type">APPLICATION TYPE</label>
    <select id="type" name="type" required>
      <option value="hostel">HOSTEL APPLICATION</option>
      <option value="mess application">MESS APPLICATION</option>
      <option value="acad">ACADAMIC APPLICATION</option>
	  <option value="lund">LAUNDRY APPLICATION</option>
	  <option value="sports">SPORTS APPLICATION</option>
    </select>
	<br>
    Phone Number:<br>
    <input type="text" id="fname" name="phone" required>
	<br>
	<h1>REGARDING APPLICATION:</h1>
        <select name="regarding">
            <option value="ASHOK CHITKARA">ASHOK CHITKARA</option>
            <option value="MADHU CHITKARA">MADHU CHITKARA</option>
            <option value="HIMANSHU BATRA">HIMANSHU BATRA</option>
        </select><br><br>
  <input type = "submit" value = "submit"></form>
 
</div>
    <div  class="zoomin" style="background-color:grey;color:white;padding:40px;">
<a href="https://www.facebook.com/Autoblog/"><img src="ff.png" alt="Smiley face" align="left" height="100" width="100"></a>
<a href="https://www.instagram.com/autoblog/?hl=en"><img src="ii.png" alt="Smiley face" align="left" height="100" width="100">
<a href="https://twitter.com/therealautoblog?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor"><img src="tt.png" alt="Smiley face" align="left" height="100" width="100">
<a href="https://www.youtube.com/channel/UCkLbQpvXfOO18uYFjg7SkOA"><img src="yy.png" alt="Smiley face" align="left" height="100" width="100">
<a href="https://acadview.com/student/enrollments"><img src="pp.png" alt="Smiley face" align="left" height="100" width="100">
    <a href="https://acadview.com/student/enrollments"><img src="acad.png" alt="Smiley face" align="left" height="100" width="100">
</div>
<script>

</script>

</body>

