<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<link href="css/style.css" rel="stylesheet" />


<div class="container">
<br>
<hr>





<div class="card bg-light">
<article class="card-body mx-auto" style="max-width: 400px;">
	<h4 class="card-title mt-3 text-center">Welcome ${email }, Request an appointment</h4>
	

	<form method="post" action="/appointment">
	
	<div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-calendar"></i> </span>
		</div>
		<input class="form-control" name="startdate" placeholder="Start date" type="date">
	</div> <!-- form-group end.// -->
	
	<div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-clock"></i> </span>
		</div>
		
    	<input name="time" class="form-control" placeholder="Appointment time" type="text">
    </div> <!-- form-group// -->
    
    <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-building"></i> </span>
		</div>
		<select class="form-control" name="apptype">
			<option selected=""> Appointment type</option>
			<option>Cervix checkup</option>
			<option>Heart checkup</option>
			<option>Eye checkup</option>
			<option>Hearing test</option>
		</select>
	</div> <!-- form-group end.// -->
	
	
	<div class="form-group input-group">
		<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-comments"></i> </span>
		 </div>
        <textarea name="comments" class="form-control" placeholder="Comments" ></textarea>
    </div> <!-- form-group// -->
    
    
                                       
    <div class="form-group">
        <button type="submit" class="btn btn-primary btn-block"> Submit  </button>
    </div> <!-- form-group// -->      
                                                                     
</form>
</article>
</div> <!-- card.// -->

</div> 
<!--container end.//-->

<br><br>
<article class="bg-secondary mb-3">  
<br><br>
</article>