<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="<%=request.getContextPath()%>/resources/img/favicon.ico">

    <title>ठेका देसी खाना</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="<%=request.getContextPath()%>/resources/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()%>/resources/css/starter-template.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="<%=request.getContextPath()%>/resources/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<style>
 
.starter {
  padding: 60px 15px;
   
}

 .navbar-inverse, .navbar-inverse .navbar-collapse, .navbar-inverse .navbar-form {
    border-color: #000;
    background-color:#000;
  }
navbar-brand,
.navbar-nav li a {
    line-height: 60px;
    height: 60px;
    padding-top: 0.10em;
}
.navbar-inverse {
     
    border-bottom-style: solid;
    border-bottom-width: medium;
}

.gly-rotate-45 {
  filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=0.5);
  -webkit-transform: rotate(45deg);
  -moz-transform: rotate(45deg);
  -ms-transform: rotate(45deg);
  -o-transform: rotate(45deg);
  transform: rotate(45deg);
}

 
 

 
/*
 		img.bg {
			/* Set rules to fill background */
			min-height: 100%;
			min-width: 1024px;
			
			/* Set up proportionate scaling */
			width: 100%;
			height: auto;
			
			/* Set up positioning */
			position: fixed;
			top: 0;
			left: 0;
		}
		
		@media screen and (max-width: 1024px){
			img.bg {
				left: 50%;
				margin-left: -512px; }
		}
		*/
	


	</style>
</head>

<body>

<!--	<img src="img/landing.jpg" class="bg">-->
	

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#" style="color:#FFFF00; font-size: 1.75em;">
		  <span class="glyphicon glyphicon glyphicon-stop gly-rotate-45" aria-hidden="true" style="font-size: 0.5em;"></span>
		   ठेका देसी खाना 
		  <span class="glyphicon glyphicon glyphicon-stop gly-rotate-45" aria-hidden="true" style="font-size: 0.5em;"></span>
		  <p style="color:#FFFFFF;font-size: 0.5em;">&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; 
		  &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
		  &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; भयंकर गरम रोटी</p>
		  </a>
		  
		 
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#today-menu">Today's Menu</a></li>
			<li><a href="#recepie">Suggest a Dish</a></li>
            <li><a href="#chefs">Chef's Corner</a></li>
			<li><a href="#feedback">Feedback</a></li>
         
            <li><a href="#career">Contact</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
	<a name="today-menu"></a>
	<div class="container-fluid starter">
  <div class="row">
  <div class="col-xs-12 col-md-8">
  <div class="jumbotron">
        <h1>Welcome!</h1>
        <p class="lead"></p>
       <!-- <p><a class="btn btn-lg btn-success" href="#" role="button">Sign up today</a></p>-->
      </div>
  
  </div>
  <div class="col-xs-6 col-md-4"><div class="list-group">
  <a href="#" class="list-group-item active">
    Today's Menu
  </a>
  <a href="#" class="list-group-item">Matar Paneer</a>
  <a href="#" class="list-group-item">Rice</a>
  <a href="#" class="list-group-item">Curd</a>
  <a href="#" class="list-group-item">Pickle</a>
  <a href="#" class="list-group-item">Matar Paneer</a>
  <a href="#" class="list-group-item">Rice</a>
  <a href="#" class="list-group-item">Curd</a>
  <a href="#" class="list-group-item">Pickle</a>
  <a href="#" class="list-group-item">Matar Paneer</a>
  <a href="#" class="list-group-item">Rice</a>
  <a href="#" class="list-group-item">Curd</a>
  <a href="#" class="list-group-item"> 
  <button type="button" class="btn btn-active"><span class="glyphicon glyphicon-grain gly-rotate-45" aria-hidden="true"></span> Register for Lunch</button></a>
     
  <a href="#" class="list-group-item"> 
    <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Or&nbsp;&nbsp;&nbsp;</p>
  <button type="button" class="btn btn-active " data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-grain gly-rotate-45" aria-hidden="true"></span> Check Tommorow's menu</button>
  <!-- Button trigger modal -->
 

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Tommorow's Menu</h4>
      </div>
      <div class="modal-body">
        <div class="list-group">
   
  <a href="#" class="list-group-item">Matar Paneer</a>
  <a href="#" class="list-group-item">Rice</a>
  <a href="#" class="list-group-item">Curd</a>
  <a href="#" class="list-group-item">Pickle</a>
  <a href="#" class="list-group-item">Matar Paneer</a>
  <a href="#" class="list-group-item">Rice</a>
  <a href="#" class="list-group-item">Curd</a>
  <a href="#" class="list-group-item">Pickle</a>
  <a href="#" class="list-group-item">Matar Paneer</a>
  <a href="#" class="list-group-item">Rice</a>
  <a href="#" class="list-group-item">Curd</a></div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
         
      </div>
    </div>
  </div>
</div>
  </a>
  
  </div></div>
</div>
</div>
 

 <a name="chefs"></a>
	<!-- Project Three -->
	<div class="row" style="padding-top: 100px">
		<div class="col-md-7">
			<div class="thumbnail">
				<img src="<%=request.getContextPath()%>/resources/img/chef.jpg"
					alt="..." />
				<div class="caption post-content">

					<h3>Write a FeedBack to us</h3>
					<p>It will help us to improve</p>

				</div>
			</div>
		</div>
		<div class="col-md-5 stars">
			<h3>Piyakad Bhaiya</h3>
			<h4>Palan Data</h4>
			<p>theka offers you to get high on your low time making you to
				remember your " maa Ke Haath ka khana" with the team of chef's from
				deep bore of regional chefs headed by manoj at desi theka our aim is
				to provide you hygienic and healthy food with desi taste miles away
				form your " desh" . we collect fresh and specific spices ansd
				ingridients from throughout the length and breadth of india our
				weekly course will make calm your chatori jeeb and keep you fit so
				that you dont become adrak.</p>
		</div>
	</div>
	<!-- /.row -->


	<a name="feedback"></a>
	<!-- Project Three -->
	<div class="row" style="padding-top: 100px">
		<div class="col-md-7">
			<div class="thumbnail">
				<img src="<%=request.getContextPath()%>/resources/img/Maachi.jpg"
					alt="..." />
				<div class="caption post-content">

					<h3>Write a FeedBack to us</h3>
					<p>It will help us to improve</p>

				</div>
			</div>
		</div>
		<div class="col-md-5 stars">
			<h3>Feed Back</h3>
			<form action="">
				<input class="star star-5" id="star-5" type="radio" name="star" />
				<label class="star star-5" for="star-5"></label>
				<input class="star star-4" id="star-4" type="radio" name="star" />
				<label class="star star-4" for="star-4"></label>
				<input class="star star-3" id="star-3" type="radio" name="star" />
				<label class="star star-3" for="star-3"></label>
				<input class="star star-2" id="star-2" type="radio" name="star" />
				<label class="star star-2" for="star-2"></label>
				<input class="star star-1" id="star-1" type="radio" name="star" />
				<label class="star star-1" for="star-1"></label>
				<div class="col-md-5">
					<h4>Write Us More</h4>
					<textarea rows="" cols=""></textarea>
				</div>

			</form>
			<a class="btn btn-primary" href="#">Submit FeedBack <span
				class="glyphicon glyphicon-chevron-right"></span></a>
		</div>
	</div>
	<!-- /.row -->

	<a name="career"></a>
	<!-- Project Three -->
	<div class="row" style="padding-top: 100px">
		<div class="col-md-7">
			<div class="thumbnail">
				<img src="<%=request.getContextPath()%>/resources/img/Maachi.jpg"
					alt="..." />
				<div class="caption post-content">

					<h3>career</h3>
					<p>career</p>

				</div>
			</div>
		</div>
		<form id="contact-form" method="get" action="caree" >

			<div class="col-md-5">
				<h3>Email Address</h3>
				<input path="email" class="form-control" id="email"
					placeholder="Enter email" required="required" />

				<div class="form-group">
					<label for="subject">Subject</label>
					 <select id="subject" name="subject" class="form-control" required="required" path="subject">
						<option value="na" selected="">Choose One:</option>
						<option value="service">I want to share my Food
							experience with you</option>
						<option value="suggestions">I have some ideas for you</option>
						<option value="product">I want to join your team</option>
					</select>
				</div>

				<div class="form-group">
					<label for="name">Message</label>
					<input path="message" name="message" id="message" class="form-control" rows="9"
						cols="25" required="required" placeholder="Message"/>
				</div>
			</div>
			<a class="btn btn-primary" href="#">Send Message <span
				class="glyphicon glyphicon-chevron-right"></span></a>
	</div>


	</form>
	</div>
	<!-- /.row -->






	<a name="contact"></a>
	<!-- Project Three -->
	<div class="row" style="padding-top: 100px">
		<div class="col-md-7">
			<div class="thumbnail">
				<img src="<%=request.getContextPath()%>/resources/img/Maachi.jpg"
					alt="..." />
				<div class="caption post-content">

					<h3>career</h3>
					<p>career</p>

				</div>
			</div>
		</div>
		<div class="col-md-5">

			<form id="contact-form" action="/career" method="post">
				<h3>Food Experience</h3>


				<h2>Want to say more</h2>
				<textarea name="message" id="message" class="form-control" rows="9"
					cols="25" required="required" placeholder="Message"></textarea>
			</form>

		</div>
	</div>
	<!-- /.row -->

	<!-- Project Three -->
	<a name="recepie"></a>
	<div class="row" style="padding-top: 100px">
		<div class="col-md-7">
			<div class="thumbnail">
				<img src="<%=request.getContextPath()%>/resources/img/Maachi.jpg"
					alt="..." />
				<div class="caption post-content">

					<h3>Suggest a recepie</h3>
					<p>Let's to serve what you want to eat</p>

				</div>
			</div>
		</div>
		<div class="col-md-5 stars">
			<h3>Recepie</h3>
			<form action="">

				<div class="col-md-5">
					<h4>Write Us More</h4>
					<textarea rows="" cols=""></textarea>
				</div>

			</form>			
			<a class="btn btn-primary" href="#">Submit Recepie <span
				class="glyphicon glyphicon-chevron-right"></span></a>
		</div>
	</div>





	<!-- /.row -->


	<!-- Footer -->
	<footer>
	<div class="row">
		<div class="col-lg-12">
			<p>
				Copyright &copy; <a href="http://thekadesikhana.com/">thekadesikhana.com</a>
			</p>
		</div>
	</div>
	<!-- /.row --> </footer>
        
     

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="<%=request.getContextPath()%>/resources/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
