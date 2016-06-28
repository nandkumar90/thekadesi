<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
      ul.tabs{float: left; width: 540px; padding-left: 0; margin-left: 0;}
      ul.tabs li{list-style-type: none; list-style-image: none; float: left; width: 28%; padding: 20px 10px 0 10px; height: 40px; background: gray; margin-right: 5px; text-align: center;}
      ul.tabs li.active a{color: #000000;}
      form#doctor{float: left; clear: both;}
      div.form_part{clear: both; display: none;}
      div.personal_info.form_part{display: block;}
    </style>
    <script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
    <script type="text/javascript">
    	$(document).ready(function() {
    		$('ul.tabs li a').on('click', function() {
    			$('ul.tabs li').removeClass('active');
    			$(this).parent('li').addClass('active');
    			var class_rel = $(this).parent().attr('id');
    			$('.form_part').css('display', 'none');
    			$('.' + class_rel).css('display', 'block');
    		});
    	});
    </script>
    <link href="/resources/css/bootstrap-responsive.css" rel="stylesheet">

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
 

     <div>
	<h2>Create a free Doctor account</h2>
	<ul class="tabs">
		<li id="personal_info" class="active"><a href="javascript:;">Personal Info</a></li>
		<li id="experience"><a href="javascript:;">Experience</a></li>
		<li id="schedule_info"><a href="javascript:;">Schedule Info</a></li>
	</ul>
	<sf:form method="POST" modelAttribute="doctor">
		<fieldset>
			<tablecellspacing="0">
			<div class="form_part personal_info">
				<tr>
				<th><label for="user_full_name">Name1:</label></th>
				<td><sf:input path="personalDetails.user_name" size="100" id="user_full_name" /></td>
			</tr>
			<br>
			<tr>
				<th>
				<label for="user_screen_name">Username:</label></th>
				<td><sf:input path="username" size="15" maxlength="15"
						id="user_screen_name" /> <small id="username_msg">Nospaces,please.</small>
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_password">Password:</label></th>
				<td>
				<sf:password path="password" size="30" showPassword="true" id="user_password" /> 
				<small>6 charactersormore(betricky!)</small>
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_phone">Telephone Number:</label></th>
				<td>
				<sf:input path="personalDetails.mobileNumber" size="15" id="user_phone" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_email">Email Address:</label></th>
				<td>
				<sf:input path="personalDetails.email" size="15" id="user_email" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_firstAddress">Address Line 1:</label></th>
				<td>
				<sf:input path="personalDetails.address.addressLine1" size="15" id="user_firstAddress" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_firstAddress2">Address Line 2:</label></th>
				<td>
				<sf:input path="personalDetails.address.addressLine2" size="15" id="user_firstAddress2" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_city">City:</label></th>
				<td>
				<sf:input path="personalDetails.address.city" size="15" id="user_city" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_state">State:</label></th>
				<td>
				<sf:input path="personalDetails.address.state" size="15" id="user_state" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_dob">Date Of Birth:</label></th>
				<td>
				<sf:input path="personalDetails.dateOfBirth" size="15" id="user_dob" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_zipcode">ZipCode:</label></th>
				<td>
				<sf:input path="personalDetails.address.zipCode" size="6" id="user_zipcode" />
				</td>
			</tr>
			<br>
			</div>
			<div class="form_part experience">
				<tr>
				<th><label for="user_full_name">Name2:</label></th>
				<td><sf:input path="personalDetails.user_name" size="100" id="user_full_name" /></td>
			</tr>
			<br>
			<tr>
				<th>
				<label for="user_screen_name">Username:</label></th>
				<td><sf:input path="username" size="15" maxlength="15"
						id="user_screen_name" /> <small id="username_msg">Nospaces,please.</small>
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_password">Password:</label></th>
				<td>
				<sf:password path="password" size="30" showPassword="true" id="user_password" /> 
				<small>6 charactersormore(betricky!)</small>
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_phone">Telephone Number:</label></th>
				<td>
				<sf:input path="personalDetails.mobileNumber" size="15" id="user_phone" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_email">Email Address:</label></th>
				<td>
				<sf:input path="personalDetails.email" size="15" id="user_email" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_firstAddress">Address Line 1:</label></th>
				<td>
				<sf:input path="personalDetails.address.addressLine1" size="15" id="user_firstAddress" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_firstAddress2">Address Line 2:</label></th>
				<td>
				<sf:input path="personalDetails.address.addressLine2" size="15" id="user_firstAddress2" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_city">City:</label></th>
				<td>
				<sf:input path="personalDetails.address.city" size="15" id="user_city" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_state">State:</label></th>
				<td>
				<sf:input path="personalDetails.address.state" size="15" id="user_state" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_dob">Date Of Birth:</label></th>
				<td>
				<sf:input path="personalDetails.dateOfBirth" size="15" id="user_dob" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_zipcode">ZipCode:</label></th>
				<td>
				<sf:input path="personalDetails.address.zipCode" size="6" id="user_zipcode" />
				</td>
			</tr>
			<br>
			</div>
			<div class="form_part schedule_info">
				<tr>
				<th><label for="user_full_name">Name3:</label></th>
				<td><sf:input path="personalDetails.user_name" size="100" id="user_full_name" /></td>
			</tr>
			<br>
			<tr>
				<th>
				<label for="user_screen_name">Username:</label></th>
				<td><sf:input path="username" size="15" maxlength="15"
						id="user_screen_name" /> <small id="username_msg">Nospaces,please.</small>
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_password">Password:</label></th>
				<td>
				<sf:password path="password" size="30" showPassword="true" id="user_password" /> 
				<small>6 charactersormore(betricky!)</small>
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_phone">Telephone Number:</label></th>
				<td>
				<sf:input path="personalDetails.mobileNumber" size="15" id="user_phone" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_email">Email Address:</label></th>
				<td>
				<sf:input path="personalDetails.email" size="15" id="user_email" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_firstAddress">Address Line 1:</label></th>
				<td>
				<sf:input path="personalDetails.address.addressLine1" size="15" id="user_firstAddress" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_firstAddress2">Address Line 2:</label></th>
				<td>
				<sf:input path="personalDetails.address.addressLine2" size="15" id="user_firstAddress2" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_city">City:</label></th>
				<td>
				<sf:input path="personalDetails.address.city" size="15" id="user_city" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_state">State:</label></th>
				<td>
				<sf:input path="personalDetails.address.state" size="15" id="user_state" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_dob">Date Of Birth:</label></th>
				<td>
				<sf:input path="personalDetails.dateOfBirth" size="15" id="user_dob" />
				</td>
			</tr>
			<br>
			<tr>
				<th><label for="user_zipcode">ZipCode:</label></th>
				<td>
				<sf:input path="personalDetails.address.zipCode" size="6" id="user_zipcode" />
				</td>
			</tr>
			<br>
			</div>
			<input type="submit">
			</table>
		</fieldset>
	</sf:form>
</div>
       </div>
       <hr>

      <footer>
        <p>&copy; Company 2013</p>
      </footer>

   <!-- /container -->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="/resources/js/jquery.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    

  </body>
</html>
