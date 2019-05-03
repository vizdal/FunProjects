<!doctype html>
<html lang="en">
  <head>
    	<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
   		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    	<script src="/js/bootstrap.min.js"></script>
	</head>
	<body>
		<nav class="navbar navbar-dark bg-dark p1">
	  		<a class="navbar-brand" href="#" onclick="loadhome()">
	    		<span class="texttitle">Viz Player</span>
	  		</a>
  			<!--div class="navbar-nav-scroll">
			    <ul class="navbar-nav bd-navbar-nav flex-row">
			      <li class="nav-item ptr locstyle">
			      	<a class="ptr">
	  					<img src="image/CA.svg" class="locwidth" id="localeflag" alt="Flag">
	  					<span id='local_name' class="text-white vm texttitle">Canada</span>
	  				</a>
			      </li>
			      <li class="nav-item ptr" onclick="loadhome()" title="Home">
			        <a class="nav-link active adjwidth"><img class="imagetitle" src="image/home_icon.svg" alt="Home"><span class="texttitle">Home</span></a>
			      </li>
			      <li class="nav-item ptr adjwidth" title="Apartment">
			        <a class="nav-link"><img class="imagetitle" src="image/city.svg" alt="Apartment"><span class="texttitle">Apartment</span></a>
			      </li>
			      <li class="nav-item ptr adjwidth" title="Feedback">
			        <a class="nav-link"><img class="imagetitle" src="image/feedback.svg" alt="Feedback"><span class="texttitle">Feedback</span></a>
			      </li>
			      <li class="nav-item ptr dropdown">
			      	<img src="image/pf.svg" style="width:2.5em;" class="rounded-circle border dropdown-toggle"  id="navDropDownLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" alt="Cinque Terre">
			        <!--Using inline style to override bootstrap default-->
			        <div class="dropdown-menu" aria-labelledby="navDropDownLink" style="position: absolute;top: 3.2em;left: -7em;">
	        			<a class="dropdown-item" href="#">
	            			<span class="h6" onclick="loadprofile(null)">Viswanath M S</span>
	            		</a>
	            		<div class="dropdown-divider"></div>
	            		<a class="dropdown-item" href="#">Logout</a>
	        		</div>
			      </li>	
			    </ul>
  			</div-->
  		</nav>
  		<video autoplay="autoplay" src="/videos/1" controls="controls" />
	</body>
</html>