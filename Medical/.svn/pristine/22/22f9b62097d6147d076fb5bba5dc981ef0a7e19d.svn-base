<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<%@ page session="false" %>
<html lang="en">
  <head>
    <title>Bootstrap, from Twitter</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
      h2 {
    display: inline;
}
    </style>
    <link href="css/bootstrap-responsive.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="../assets/js/html5shiv.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    
  </head>

  <body>

    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="#">Project name</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li class="active"><a href="#">Home</a></li>
              <li><a href="#about">About</a></li>
              <li><a href="#contact">Contact</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li class="nav-header">Nav header</li>
                  <li><a href="#">Separated link</a></li>
                  <li><a href="#">One more separated link</a></li>
                </ul>
              </li>
            </ul>
            <form class="navbar-form pull-right">
              <input class="span2" type="text" placeholder="Email">
              <input class="span2" type="password" placeholder="Password">
              <button type="submit" class="btn">Sign in</button>
            </form>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">
 
<ul>
		<c:forEach items="${uiProps }" var="name"> 
			<li><a href="${name.value}">${name.key }</a></li>
		</c:forEach>
	</ul>
</div>
       </div>
       <hr>
<div style="display: inline-block;">
	<li >
		<h2>Admin</h2>
		<h3>
			<a href="admin">Click Here</a>
		</h3>
	
	</div>
	
<div><h2> <br>
	<left>
		<h2>E-precription</h2>
		<h3>
			<a href="doctor">Click Here</a>
		</h3>
	</left>
	
	</br>
	<br>
	
		<h2>DrugStore</h2>
		<h3>
			<a href="drugstore">Click Here</a>
		</h3>
	
	<br>
	
		<h2>login</h2>
		<h3>
			<a href="login">Click Here</a>
		</h3>
	
	</br>
	<br>
	
		<h2>appointment</h2>
		<h3>
			<a href="app">Click Here</a>
		</h3>
	
	</br>
	
		<h2>Billing</h2>
		<h3>
			<a href="billing">Click Here</a>
		</h3>
	
	</br></li></h2></div>
	

	
      <footer>
        <p>&copy; Ensulin 2013</p>
      </footer>

   <!-- /container -->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    

  </body>
</html>
