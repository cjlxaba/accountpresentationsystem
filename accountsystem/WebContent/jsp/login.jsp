<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	
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
						<%-- <li><a href="${pageContext.request.contextPath}"><span>Home <span class="border"></span></span></a></li> --%>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- END .header -->
	
	<aside class="fh5co-page-heading">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h1 class="fh5co-page-heading-lead">
						Login
						<span class="fh5co-border"></span>
					</h1>
					
				</div>
			</div>
		</div>
	</aside>
	
	<div id="fh5co-main">
		
		<div class="container">
			<div class="row">
				<div class="col-md-4 col-md-push-4">
					
					<div class="row">
						<form method="POST" action="${pageContext.request.contextPath}/loginProcess">
							<div class="col-md-12">
								<div class="form-group">
									<label for="username" class="">Username</label>
									<input placeholder="Username" id="username"  name="username" type="text" class="form-control input-lg">
								</div>	
							</div>	
							
							<div class="col-md-12">
								<div class="form-group">
									<label for="password" class="">Password</label>
									<input placeholder="Password" id="password"  name="password" type="password" class="form-control input-lg">
								</div>	
							</div>					
							
							<div class="col-md-6">
								<div class="form-group">
									<input type="submit" class="btn btn-primary " value="Login">
								</div>	
							</div>
							
							<div class="col-md-6">
								<div class="form-group">	
								
								</div>	
							</div>
						</form>
					</div>
	
					
				</div>



				<div class="col-md-4 col-md-pull-8">
	
					
					
				</div>
				
			</div>
		</div>
	</div>

	

	
	</body>
</html>
