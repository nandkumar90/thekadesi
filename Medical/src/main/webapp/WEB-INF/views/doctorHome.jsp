<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <title>BootStrap-Test</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="/resources/css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
    </style>
    <link href="/resources/css/bootstrap-responsive.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="/resources/js/html5shiv.js"></script>
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
            
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">

     

      <!--  row of columns -->
      <div class="row">
        <div class="span2">
           <ul class="nav nav-list">
                <li class="nav-header">Navigation</li>
                <li ><a href="#">Online Consultation</a></li>
                <li class="active"><a href="#">Diagnosis of Patient</a></li>
                <li><a href="#">Profile</a></li>
                <li class="nav-header">Another list header</li>
                <li><a href="#">Item 1</a></li>
                <li><a href="#">Settings</a></li>
                <li class="divider"></li>
                <li><a href="#">Help</a></li>
              </ul>
        </div>
        <div class="span5">
  <div class="page-header">
            <h5>Todays Application <small class="text-info">(Showing 10 Applications per page)</small></h1>
          </div>
 <ul class="pager">
  <li class="previous">
    <a href="#">&larr; Older</a>
  </li>
  <li class="next">
    <a href="#">Newer &rarr;</a>
  </li>
</ul>
 <div class="well"> 
   <div class="row">
        <div class="span2">
       <img data-src="holder.js/140x140" class="img-polaroid" alt="Patient" src="/resources/img/patient.jpg" style="width: 50px; height: 50px;">   <p><small>Ashu Saxena </small></p> </div><div class="span2">
  <p><button type="submit" class="btn btn-primary btn-mini ">View Medical History </button> </p>
     </div>
        </div>
  </div>  
       </div>
        <div class="span5">
  
        <div class="well" >
         <form>
  <fieldset>
    <legend>Diagnosis</legend>

    
   
    
   <div class="well " style=" max-height:200px; overflow:auto">
  

    <dl>
            <dt>Symptoms</dt>
            <dd>Sir I have following Symptoms</dd>
            <dt>Symptom1</dt>
            <dd>Motorbike Accident...........</dd>
            <dd>Frustration...........</dd>
            <dt>Symptom2</dt>
            <dd>Forsaken...........</dd>
          </dl>
   
   
    <label>Chronic Disease/ Impairment (if any) </label>
   <textarea rows="3"></textarea>
    <label>Routine Medication </label>
   <textarea rows="3"></textarea>
    <label>known Allergies  </label>
   <textarea rows="3"></textarea>
    <label>Siginficant Medical History </label>
   <textarea rows="3"></textarea>
    <label>Accidental Injury </label>
   <textarea rows="3"></textarea>
    <label>History of Immunization  </label>
   <textarea rows="3"></textarea>
   <label>Suggested Medicine  </label>
   <textarea rows="3"></textarea>
  </div>
  </fieldset>
</form>

 </div>

             <div class="well" >   <form>
  <fieldset>
    <legend>Observation</legend>

    <label>Please write your observation below </label>
   <textarea rows="3"></textarea>
  
    
 
    
</form> </div>
<div class="well" >   <form>
  <fieldset>
    <legend>Recommendation</legend>

    <label>Please write your Recommendation below </label>
   <textarea rows="3"></textarea>
  
    
 
    
</form> </div>
       <button type="submit" class="btn btn-success ">Close Appointment</button> <button type="submit" class="btn btn-primary">Reschedule</button>
        </div>
      </div>

      <hr>

      <footer>
        <p>&copy; Company 2013</p>
      </footer>

    </div> <!-- /container -->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="/resources/js/jquery.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    

  </body>
</html>

