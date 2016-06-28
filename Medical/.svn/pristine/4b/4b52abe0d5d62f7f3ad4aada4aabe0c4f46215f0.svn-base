<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<%@ page session="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Bootstrap, from Twitter</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Le styles -->
   <script src="<c:url value="/resources/css/bootstrap.css" />"></script>
    <style type="text/css">
        body
        {
            padding-top: 60px;
            padding-bottom: 40px;
        }
        
        input, textarea, .uneditable-input
        {
            width: 100%;
        }
    </style>
    <script src="<c:url value="/resources/css/bootstrap-responsive.css" />"></script>
    
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
    <![endif]-->
</head>
<body>
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container">
                <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                    <span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar">
                    </span>
                </button>
                <a class="brand" href="#">Project name</a>
                <div class="nav-collapse collapse">
                    <ul class="nav">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#about">About</a></li>
                        <li><a href="#contact">Contact</a></li>
                        <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown
                            <b class="caret"></b></a>
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
                    <button type="submit" class="btn">
                        Sign in</button>
                    </form>
                </div>
                <!--/.nav-collapse -->
            </div>
        </div>
    </div>
    <div class="container">
        <!-- Example row of columns -->
        <div class="row">
            <div class="span4">
              <h6>Category of Medicine</h6>
         <div class="btn-group btn-group-vertical">
              <button type="button" class="btn">A</button>
              <button type="button" class="btn">B</button>
              <button type="button" class="btn">C</button>
              <button type="button" class="btn">D</button>
            </div>   
            </div>
            
            <div class="span8">

            <span class="label label-success">Expiry Notification</span>
 	<span class="label label-warning">Stock Notification</span>
 	<span class="label label-important">Patient in Queue notification</span>

    <table class="table table-bordered">
        <thead>
          <tr>
            <th>
              <h4>Service</h4>
            </th>
            <th>
              <h4>Description</h4>
            </th>
            <th>
              <h4>Hrs/Qty</h4>
            </th>
            <th>
              <h4>Rate/Price</h4>
            </th>
            <th>
              <h4>Sub Total</h4>
            </th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>Article</td>
            <td><a href="#">Title of your article here</a></td>
            <td class="text-right">-</td>
            <td class="text-right">$200.00</td>
            <td class="text-right">$200.00</td>
          </tr>
          <tr>
            <td>Template Design</td>
            <td><a href="#">Details of project here</a></td>
            <td class="text-right">10</td>
            <td class="text-right">75.00</td>
            <td class="text-right">$750.00</td>
          </tr>
          <tr>
            <td>Development</td>
            <td><a href="#">WordPress Blogging theme</a></td>
            <td class="text-right">5</td>
            <td class="text-right">50.00</td>
            <td class="text-right">$250.00</td>
          </tr>
        </tbody>
      </table>
 	
            </div>
        </div>
         
        <hr>
        <footer>
        <p>&copy; Company 2013</p>
      </footer>
    </div>
    <!-- /container -->
    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <script>

        $('.popover-markup>.trigger').popover({
            html: true,
            title: function () {
                return $(this).parent().find('.head').html();
            },
            content: function () {
                return $(this).parent().find('.content').html();
            }
        });
    </script>
</body>
</html>
