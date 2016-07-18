<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>TDK</title>

<!-- Bootstrap Core CSS -->
<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="<%=request.getContextPath()%>/resources/css/custom-tdk.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#" style="height: 75px; width: 250px;">
				<img
				src="<%=request.getContextPath()%>/resources/img/logo_color.jpg"
				alt="" class="img-responsive">
			</a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="#about">About</a></li>
				<li><a href="#menu">Today's menu</a></li>
				<li><a href="#recepie">Suggest a Dish</a></li>
				<li><a href="#chefCorner">Chef's Corner</a></li>
				<li><a href="#feedback">FeedBack</a></li>
				<li><a href="#career">Career</a></li>
				<li><a href="#contact">Contact</a></li>

			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container --> </nav>
	<div class="intro-header">
		<div class="container">

			<div class="row">
				<div class="col-lg-12">
					<div class="intro-message">
						<!-- <h1>Landing Page</h1>
                        <h3>A Template by Start Bootstrap</h3>
                        <hr class="intro-divider">
                        <ul class="list-inline intro-social-buttons">
                            <li>
                                <a href="https://twitter.com/SBootstrap" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                            </li>
                            <li>
                                <a href="https://github.com/IronSummitMedia/startbootstrap" class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i> <span class="network-name">Github</span></a>
                            </li>
                            <li>
                                <a href="#" class="btn btn-default btn-lg"><i class="fa fa-linkedin fa-fw"></i> <span class="network-name">Linkedin</span></a>
                            </li>
                        </ul>-->
					</div>
				</div>
			</div>

		</div>
		<!-- /.container -->

	</div>

	<a name="about"></a>
	<!-- Page Content -->
	<div class="container">

		<!-- Page Heading -->
		<!-- <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Page Heading
                    <small>Secondary Text</small>
                </h1>
            </div>
        </div>-->
		<!-- /.row -->

		<!-- Project One -->
		<div class="row" style="padding-top: 100px">
			<div class="col-md-7">
				<div class="thumbnail">
					<img src="<%=request.getContextPath()%>/resources/img/candle.jpg"
						alt="..." />
					<div class="caption post-content">

						<h3>Robots!</h3>
						<p>Lorem ipsum dolor sit amet</p>

					</div>
				</div>
			</div>
			<div class="col-md-5">
				<h3>Project Three-About</h3>
				<h4>Subheading</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Omnis, temporibus, dolores, at, praesentium ut unde repudiandae
					voluptatum sit ab debitis suscipit fugiat natus velit excepturi
					amet commodi deleniti alias possimus!</p>
				<a class="btn btn-primary" href="#">View Project <span
					class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
		<!-- /.row -->

		<hr>


		<a name="menu"></a>
		<!-- Project Two -->
		<div class="row">
			<div class="col-md-7">
				<a href="#"> <img class="img-responsive"
					src="<%=request.getContextPath()%>/resources/img/Maachi.jpg" alt="">
				</a>
			</div>
			<div class="col-md-5">
				<h3>Project Two</h3>
				<h4>Subheading</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ut,
					odit velit cumque vero doloremque repellendus distinctio maiores
					rem expedita a nam vitae modi quidem similique ducimus! Velit, esse
					totam tempore.</p>
				<a class="btn btn-primary" href="#">View Project <span
					class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>

		<a name="about"></a>
		<!-- Project Two -->
		<div class="row">
			<div class="col-md-7">
				<a href="#"> <img class="img-responsive"
					src="<%=request.getContextPath()%>/resources/img/Maachi.jpg" alt="">
				</a>
			</div>
			<div class="col-md-5">
				<h3>About</h3>
				<h4>About</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ut,
					odit velit cumque vero doloremque repellendus distinctio maiores
					rem expedita a nam vitae modi quidem similique ducimus! Velit, esse
					totam tempore.</p>
				<a class="btn btn-primary" href="#">View Project <span
					class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
		<!-- /.row -->

		<hr>

		<a name="recepie"></a>
		<!-- Project Three -->
		<div class="row" style="padding-top: 100px">
			<div class="col-md-7">
				<div class="thumbnail">
					<img src="<%=request.getContextPath()%>/resources/img/Maachi.jpg"
						alt="..." />
					<div class="caption post-content">

						<h3>desserts!</h3>
						<p>Lorem ipsum dolor sit amet</p>

					</div>
				</div>
			</div>
			<div class="col-md-5">
				<h3>Project Three-About</h3>
				<h4>Subheading</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Omnis, temporibus, dolores, at, praesentium ut unde repudiandae
					voluptatum sit ab debitis suscipit fugiat natus velit excepturi
					amet commodi deleniti alias possimus!</p>
				<a class="btn btn-primary" href="#">View Project <span
					class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
		<!-- /.row -->

		<a name="recepie"></a>
		<!-- Project Three -->
		<div class="row" style="padding-top: 100px">
			<div class="col-md-7">
				<div class="thumbnail">
					<img src="<%=request.getContextPath()%>/resources/img/Maachi.jpg"
						alt="..." />
					<div class="caption post-content">

						<h3>desserts!</h3>
						<p>Lorem ipsum dolor sit amet</p>

					</div>
				</div>
			</div>
			
			<div class="col-md-5">
				<h3>Project Three-About</h3>
				<h4>Subheading</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Omnis, temporibus, dolores, at, praesentium ut unde repudiandae
					voluptatum sit ab debitis suscipit fugiat natus velit excepturi
					amet commodi deleniti alias possimus!</p>
				<a class="btn btn-primary" href="#">View Project <span
					class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
		<!-- /.row -->


		<a name="#chefCorner"></a>
		<!-- Project Three -->
		<div class="row" style="padding-top: 100px">
			<div class="col-md-7">
				<div class="thumbnail">
					<img src="<%=request.getContextPath()%>/resources/img/Maachi.jpg"
						alt="..." />
					<div class="caption post-content">

						<h3>desserts!</h3>
						<p>Lorem ipsum dolor sit amet</p>

					</div>
				</div>
			</div>
			<div class="col-md-5">
				<h3>Piyakad Bhaiya</h3>
				<h4>Palan Data</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Omnis, temporibus, dolores, at, praesentium ut unde repudiandae
					voluptatum sit ab debitis suscipit fugiat natus velit excepturi
					amet commodi deleniti alias possimus!</p>
				<a class="btn btn-primary" href="#">View Project <span
					class="glyphicon glyphicon-chevron-right"></span></a>
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
				<form:form action="">
					<input class="star star-5" id="star-5" type="radio" name="star" />
					<label class="star star-5" for="star-5"></label>
					<input class="star star-4" id="star-4" type="radio" name="star" /> 
					<label	class="star star-4" for="star-4"></label> 
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
					
				</form:form>
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
			<form:form id="contact-form" th:object="/career" method="post"
				th:action="@{/caree}">

				<div class="col-md-5">
					<h3>Email Address</h3>
					<input type="email" class="form-control" id="email"
						placeholder="Enter email" required="required" />

					<div class="form-group">
						<label for="subject">Subject</label> <select id="subject"
							name="subject" class="form-control" required="required"
							th:field="*{subject}">
							<option value="na" selected="">Choose One:</option>
							<option value="service">I want to share my Food
								experience with you</option>
							<option value="suggestions">I have some ideas for you</option>
							<option value="product">I want to join your team</option>
						</select>
					</div>

					<div class="form-group">
						<label for="name">Message</label>
						<textarea name="message" id="message" class="form-control"
							rows="9" cols="25" required="required" placeholder="Message"></textarea>
					</div>
				</div>
				<a class="btn btn-primary" href="#">Send Message <span
					class="glyphicon glyphicon-chevron-right"></span></a>
		</div>


		</form:form>
	</div>
	<!-- /.row -->




	<!-- Project Four -->
	<div class="row">

		<div class="col-md-7">
			<a href="#"> <img class="img-responsive"
				src="<%=request.getContextPath()%>/resources/img/Maachi.jpg" alt="">
			</a>
		</div>
		<div class="col-md-5">
			<h3>Project Four</h3>
			<h4>Subheading</h4>
			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
				Explicabo, quidem, consectetur, officia rem officiis illum aliquam
				perspiciatis aspernatur quod modi hic nemo qui soluta aut eius fugit
				quam in suscipit?</p>
			<a class="btn btn-primary" href="#">View Project <span
				class="glyphicon glyphicon-chevron-right"></span></a>
		</div>
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

			<form:form id="contact-form" th:object="/career" method="post">
				<h3>Food Experience</h3>


				<h2>
					Want to say more
					</h2>
					<textarea name="message" id="message" class="form-control" rows="9"
						cols="25" required="required" placeholder="Message"></textarea>
						</form:form>
						
		</div>
	</div>
	<!-- /.row -->




	<!-- Project Four -->
	<div class="row">

		<div class="col-md-7">
			<a href="#"> <img class="img-responsive"
				src="<%=request.getContextPath()%>/resources/img/Maachi.jpg" alt="">
			</a>
		</div>
		<div class="col-md-5">
			<h3>Project Four</h3>
			<h4>Subheading</h4>
			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
				Explicabo, quidem, consectetur, officia rem officiis illum aliquam
				perspiciatis aspernatur quod modi hic nemo qui soluta aut eius fugit
				quam in suscipit?</p>
			<a class="btn btn-primary" href="#">View Project <span
				class="glyphicon glyphicon-chevron-right"></span></a>
		</div>
	</div>
	<!-- /.row -->


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

	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>

	<script>
		$(document).click(function(event) {
			var clickover = $(event.target);
			var $navbar = $(".navbar-collapse");
			var _opened = $navbar.hasClass("in");
			if (_opened === true && !clickover.hasClass("navbar-toggle")) {
				$navbar.collapse('hide');
			}
		});
	</script>

</body>

</html>
