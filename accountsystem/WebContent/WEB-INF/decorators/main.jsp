<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Catalogue</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
	<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
	<meta name="author" content="FREEHTML5.CO" />

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">

	<!-- Google Webfonts -->
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,300,100,500' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Owl Carousel -->
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">
	<!-- Magnific Popup -->
	<link rel="stylesheet" href="css/magnific-popup.css">
	<!-- Theme Style -->
	<link rel="stylesheet" href="css/style.css">
	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
	
	</head>
	<body>
		
	<header id="fh5co-header" role="banner">
		<nav class="navbar navbar-default" role="navigation">
			<div class="container-fluid">
				<div class="navbar-header"> 
				<!-- Mobile Toggle Menu Button -->
				<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle visible-xs-block" data-toggle="collapse" data-target="#fh5co-navbar" aria-expanded="false" aria-controls="navbar"><i></i></a>
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
				<a class="navbar-brand" href="${pageContext.request.contextPath}">ESP Catalogue</a>
				</div>
				<div id="fh5co-navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav navbar-right">
						<li><a href="${pageContext.request.contextPath}"><span>Dashboard<span class="border"></span></span></a></li>
						<li><a href="${pageContext.request.contextPath}"><span>Catalogue<span class="border"></span></span></a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- END .header -->
	
	
	<decorator:body />
	

	<!-- BEGIN .footer -->
	<div class="fh5co-spacer fh5co-spacer-lg"></div>

	<footer id="fh5co-footer">
		
			<div class="container" id="fh5co-products">

			<div class="row">
				<div class="col-md-2 col-sm-6 col-xs-6 col-xxs-12 fh5co-mb30">
					<div class="fh5co-product">
						<img src="images/motovantage.jpg"  class="img-responsive img-rounded to-animate">
					</div>
				</div>
				<div class="col-md-2 col-sm-6 col-xs-6 col-xxs-12 fh5co-mb30">
					<div class="fh5co-product">
						<img src="images/FNB-Logo.jpeg"  class="img-responsive img-rounded to-animate">
					</div>
				</div>
				<div class="visible-sm-block visible-xs-block clearfix"></div>
				<div class="col-md-2 col-sm-6 col-xs-6 col-xxs-12 fh5co-mb30">
					<div class="fh5co-product">
						<img src="images/rmb_logo.jpg"  class="img-responsive img-rounded to-animate">
					</div>
				</div>
				<div class="col-md-2 col-sm-6 col-xs-6 col-xxs-12 fh5co-mb30">
					<div class="fh5co-product">
						<img src="images/wesbank_logo.png" class="img-responsive img-rounded to-animate">
						
					</div>
				</div>
				<div class="col-md-2 col-sm-6 col-xs-6 col-xxs-12 fh5co-mb30">
					<div class="fh5co-product">
						<img src="images/directaxis_logo.png" class="img-responsive img-rounded to-animate">
						
					</div>
				</div>
				<div class="col-md-2 col-sm-6 col-xs-6 col-xxs-12 fh5co-mb30">
					<div class="fh5co-product" >
						<img src="images/ashburton_logo.png" class="img-responsive img-rounded to-animate">
						
					</div>
				</div>
				
			</div>
		</div>

	</footer>


	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Owl carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<!-- Main JS -->
	<script src="js/main.js"></script>

	
	</body>
</html>
