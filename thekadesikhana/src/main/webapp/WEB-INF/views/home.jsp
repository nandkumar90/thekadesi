<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
  <head>
 <!-- Theme Made By www.w3schools.com - No Copyright -->
  <title>Theka Desi Khana</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="http://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="http://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  body {
      font: 400 15px/1.8 Lato, sans-serif;
      color: #777;
  }
  h3, h4 {
      margin: 10px 0 30px 0;
      letter-spacing: 10px;
      font-size: 20px;
      color: #111;
  }
  .container {
      padding: 80px 120px;
  }
  .person {
      border: 10px solid transparent;
      margin-bottom: 25px;
      width: 80%;
      height: 80%;
      opacity: 0.7;
  }
  .person:hover {
      border-color: #f1f1f1;
  }
  .carousel-inner img {
      -webkit-filter: grayscale(90%);
      filter: grayscale(90%); /* make all photos black and white */
      width: 100%; /* Set width to 100% */
      margin: auto;
  }
  .carousel-caption h3 {
      color: #fff !important;
  }
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */
    }
  }
  .bg-1 {
      background: #2d2d30;
      color: #bdbdbd;
  }
  .bg-1 h3 {color: #fff;}
  .bg-1 p {font-style: italic;}
  .list-group-item:first-child {
      border-top-right-radius: 0;
      border-top-left-radius: 0;
  }
  .list-group-item:last-child {
      border-bottom-right-radius: 0;
      border-bottom-left-radius: 0;
  }
  .thumbnail {
      padding: 0 0 15px 0;
      border: none;
      border-radius: 0;
  }
  .thumbnail p {
      margin-top: 15px;
      color: #555;
  }
  .btn {
      padding: 10px 20px;
      background-color: #333;
      color: #f1f1f1;
      border-radius: 0;
      transition: .2s;
  }
  .btn:hover, .btn:focus {
      border: 1px solid #333;
      background-color: #fff;
      color: #000;
  }
  .modal-header, h4, .close {
      background-color: #333;
      color: #fff !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-header, .modal-body {
      padding: 40px 50px;
  }
  .nav-tabs li a {
      color: #777;
  }
  #googleMap {
      width: 100%;
      height: 400px;
      -webkit-filter: grayscale(100%);
      filter: grayscale(100%);
  }
  .navbar {
      font-family: Montserrat, sans-serif;
      margin-bottom: 0;
      background-color: #2d2d30;
      border: 0;
      font-size: 11px !important;
      letter-spacing: 4px;
      opacity: 0.9;
  }
  .navbar li a, .navbar .navbar-brand {
      color: #d5d5d5 !important;
  }
  .navbar-nav li a:hover {
      color: #fff !important;
  }
  .navbar-nav li.active a {
      color: #fff !important;
      background-color: #29292c !important;
  }
  .navbar-default .navbar-toggle {
      border-color: transparent;
  }
  .open .dropdown-toggle {
      color: #fff;
      background-color: #555 !important;
  }
  .dropdown-menu li a {
      color: #000 !important;
  }
  .dropdown-menu li a:hover {
      background-color: red !important;
  }
  footer {
      background-color: #2d2d30;
      color: #f5f5f5;
      padding: 32px;
  }
  footer a {
      color: #f5f5f5;
  }
  footer a:hover {
      color: #777;
      text-decoration: none;
  }
  .form-control {
      border-radius: 0;
  }
  textarea {
      resize: none;
  }
  </style>
</head>

<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#myPage"> <img src="" alt="Theka Desi Khana" ></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#myPage">HOME</a></li>
        <li><a href="#team">Team</a></li>
       <li><a href="#chef">Chef's Corner</a></li>
       <li><a href="#menu">Menu</a></li>
        
        <li><a href="#dish">Suggest A Dish</a></li>
        <li><a href="#contact">CONTACT</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
      </ul>
    </div>
  </div>
</nav>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="http://thekadesikhana.com/resources/img/landing.jpg" alt="New York" width="1200" height="700">
        <div class="carousel-caption">
          <h3>Theka Desi khana</h3>
          <p>Food is easiest way to get high.</p>
        </div>
      </div>

      
    </div>

</div>

<!-- Container (The Band Section) -->
<div id="team" class="container text-center">
  <h3>Who We Are</h3>
  <p><em>We love Food and love to serve loveable food!</em></p>
  <p>Started with a vision to overload tech-savvy, workaholic & underweight stomachs and growing on to bring tsunami of flavours in your mouth. The main aim always being around the glamour of desi khana, though not home made but always home like. With careful selection of fresh ingredients, an exquisite spread of menu items and a magical chef, we offer you to let the post-food burp echo in the ambience, saying, "Yaar, ghar di yaad dila dee da"

Hamare Adarsh: Anyone can make you high on alcohol, we intend to get you high on food. "One way, to, rule them all". What is great in our team, is that everyone is crazy about food, which makes us our best critics. All in all, "khana aisa, ki jise bhagwaan ke liye bhi na chodein".</p>
  <br>
  <div class="row">
    <div class="col-sm-4">
      <p class="text-center"><strong>Manoj Agrawal</strong></p><br>
      <a href="#demo" data-toggle="collapse">
        <img src="http://thekadesikhana.com/resources/img/manoj.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo" class="collapse">
        <p>Software Enginner and problem Solver</p>
        <p>Love Food</p>
        <p>Member since 20116</p>
      </div>
    </div>
    <div class="col-sm-4">
      <p class="text-center"><strong>R.L.SINGH</strong></p><br>
      <a href="#demo2" >
        <img src="http://thekadesikhana.com/resources/img/test.png" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo2" class="collapse">
        <p>Software Enginner and problem Solver</p>
        <p>Love Food</p>
        <p>Member since 20116</p>
      </div>
    </div>
    <div class="col-sm-4">
      <p class="text-center"><strong>Mandvi Singh</strong></p><br>
      <a href="#demo3" data-toggle="collapse">
        <img src="http://thekadesikhana.com/resources/img/mandvi.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo3" class="collapse">
        <p>Software Enginner and problem Solver</p>
        <p>Love Food</p>
        <p>Member since 20116</p>
      </div>
    </div>
  </div>
</div>

<div id="chef" class="container text-center">
  <h3>Piyakad Bhaiya</h3>
  <p><em>We love Food and love to serve loveable food!</em></p>
  <p>theka offers you to get high on your low time making you to remember your " maa Ke Haath ka khana"   with the team of chef's from deep bore of regional chefs headed by manoj

at desi theka our aim  is to provide you hygienic and healthy food with desi taste miles away form your " desh" . we collect fresh and specific  spices ansd ingridients from throughout the length and breadth of india

our weekly course will make calm your chatori jeeb and keep you fit so that you dont become adrak.</p>
  <br>
  <!-- div class="row">
    <div class="col-sm-4">
      <p class="text-center"><strong>Name</strong></p><br>
      <a href="#demo" data-toggle="collapse">
        <img src="http://thekadesikhana.com/resources/img/manoj.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo" class="collapse">
        <p>Software Enginner and problem Solver</p>
        <p>Love Food</p>
        <p>Member since 20116</p>
      </div>
    </div>
    <div class="col-sm-4">
      <p class="text-center"><strong>Name</strong></p><br>
      <a href="#demo2" data-toggle="collapse">
        <img src="http://thekadesikhana.com/resources/img/manoj.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo2" class="collapse">
        <p>Drummer</p>
        <p>Loves drummin'</p>
        <p>Member since 1988</p>
      </div>
    </div>
    <div class="col-sm-4">
      <p class="text-center"><strong>Name</strong></p><br>
      <a href="#demo3" data-toggle="collapse">
        <img src="http://thekadesikhana.com/resources/img/manoj.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo3" class="collapse">
        <p>Bass player</p>
        <p>Loves math</p>
        <p>Member since 2005</p>
      </div>
    </div>
  </div-->
</div>


<!-- Container (TOUR Section) -->
<div id="menu" class="bg-1">
  <div class="container">
    <h3 class="text-center">Our Menu</h3>
    <p class="text-center">Love Your home like food only for you.<br> Remember to book your Lunch!</p>
    <ul class="list-group">
      <li class="list-group-item">Roti <span class="label label-danger">4</span></li>
      <li class="list-group-item">Panner Butter Mashala <span class="label label-danger">50 gm</span></li>
      <li class="list-group-item">Rajma <span class="badge">40 gm</span></li>
      <li class="list-group-item">Aloo Jeera <span class="badge">40 gm</span></li>
      <li class="list-group-item">Sweet <span class="badge">40 gm</span></li>
      <li class="list-group-item">Papad (Lijjat) <span class="badge">1</span></li>
      <li class="list-group-item">Salad <span class="badge">40 gm</span></li>
      <li class="list-group-item">Achar <span class="badge">40 gm</span></li>
      <li class="list-group-item">Ghee <span class="badge">40 gm</span></li>
      <li class="list-group-item">Fruit Chaat <span class="badge">40 gm</span></li>
      <li class="list-group-item">Paneer Chilly <span class="badge">40 gm</span></li>





    </ul>
    
    <div class="row text-center" align="centre">
      <div class="col-sm-4">
        <div class="thumbnail">
          <button class="btn" data-toggle="modal" data-target="#myModal">Book Your Lunch</button>
        </div>
      </div>
    
    </div>
  </div>
  
  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">×</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Book Your Lunch</h4>
        </div>
        <div class="modal-body">
          <form role="form">
            <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-shopping-cart"></span> No of lunch</label>
              <input type="number" class="form-control" id="psw" placeholder="No Of Lunch?">
            </div>
             <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-shopping-cart"></span>Your Phone No</label>
              <input type="number" class="form-control" id="psw" placeholder="Contact No?">
            </div>
             <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-shopping-cart"></span>Your Location</label>
              <input type="number" class="form-control" id="psw" placeholder="Location">
            </div>
            <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-shopping-cart"></span>Deliver Date</label>
              <input type="number" class="form-control" id="psw" placeholder="Date">
            </div>
            <div class="form-group">
              <label for="usrname"><span class="glyphicon glyphicon-user"></span> Send To</label>
              <input type="text" class="form-control" id="usrname" placeholder="Enter email">
            </div>
              <button type="submit" class="btn btn-block">Pay Now
                <span class="glyphicon glyphicon-ok"></span>
              </button>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal">
            <span class="glyphicon glyphicon-remove"></span> Cancel
          </button>
          <p>Need <a href="#">help?</a></p>
        </div>
      </div>
    </div>
  </div>
</div>

<!-- Container (suggest a dish Section) -->
<div id="dish" class="container">
  <h3 class="text-center">Suggest your recipe</h3>
  <p class="text-center"><em>We love our foodies!</em></p>

  <div class="row">
    
    <div class="col-md-8" align="center">
      
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
      <br>
      <div class="row">
        <div class="col-md-12 form-group">
          <button class="btn pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
 
</div>


<!-- Container (Contact Section) -->
<div id="contact" class="container">
  <h3 class="text-center">Contact</h3>
  <p class="text-center"><em>We love our fans!</em></p>

  <div class="row">
    <div class="col-md-4">
      <p>Fan? Drop a note.</p>
      <p><span class="glyphicon glyphicon-map-marker"></span>SGR Dental College Road,Marathalli</p>
      <p><span class="glyphicon glyphicon-phone"></span>Phone: +91-9535526012</p>
      <p><span class="glyphicon glyphicon-envelope"></span>Email: thekadesikhana@gmail.com</p>
    </div>
    <div class="col-md-8">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="phone" name="phone" placeholder="Phone no" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
      <br>
      <div class="row">
        <div class="col-md-12 form-group">
          <button class="btn pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
  <br>
  <h3 class="text-center">From The Social Media</h3>
  <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#home">Facebook Page</a></li>
    <li><a data-toggle="tab" href="#menu1">Twitter</a></li>
    <li><a data-toggle="tab" href="#menu2">Zomato</a></li>
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <h2>Followe us on faceboook</h2>
      <p> <a href="https://www.facebook.com/thekadesikhana">https://www.facebook.com/thekadesikhana</a></p>
    </div>
    <div id="menu1" class="tab-pane fade">
      <h2>Follow us on twitter</h2>
      <p><a href="https://twitter.com/thekaDesiKhana">https://twitter.com/thekaDesiKhana</a></p>
    </div>
    <div id="menu2" class="tab-pane fade">
      <h2>Follow us on zomatao</h2>
      <p><a href="https://www.zomato.com/bangalore/theka-desi-khana-marathahalli">https://www.zomato.com/bangalore/theka-desi-khana-marathahalli</a></a></p>
    </div>
  </div>
</div>

<div id="googleMap"></div>

<!-- Add Google Maps -->
<script src="http://maps.googleapis.com/maps/api/js"></script>
<script>
var myCenter = new google.maps.LatLng(12.9490737,77.7008252);

function initialize() {
var mapProp = {
center:myCenter,
zoom:12,
scrollwheel:false,
draggable:false,
mapTypeId:google.maps.MapTypeId.ROADMAP
};

var map = new google.maps.Map(document.getElementById("googleMap"),mapProp);

var marker = new google.maps.Marker({
position:myCenter,
});

marker.setMap(map);
}

google.maps.event.addDomListener(window, 'load', initialize);
</script>

<!-- Footer -->
<footer class="text-center">
  <a class="up-arrow" href="#myPage" data-toggle="tooltip" title="TO TOP">
    <span class="glyphicon glyphicon-chevron-up"></span>
  </a><br><br>
  <p>Let's get high on food@Theka Desi Khana</p>
</footer>

<script>
$(document).ready(function(){
  // Initialize Tooltip
  $('[data-toggle="tooltip"]').tooltip();
  
  // Add smooth scrolling to all links in navbar + footer link
  $(".navbar a, footer a[href='#myPage']").on('click', function(event) {

    // Make sure this.hash has a value before overriding default behavior
    if (this.hash !== "") {

      // Prevent default anchor click behavior
      event.preventDefault();

      // Store hash
      var hash = this.hash;

      // Using jQuery's animate() method to add smooth page scroll
      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
      $('html, body').animate({
        scrollTop: $(hash).offset().top
      }, 900, function(){
   
        // Add hash (#) to URL when done scrolling (default click behavior)
        window.location.hash = hash;
      });
    } // End if
  });
})
</script>
  </body>
</html>
