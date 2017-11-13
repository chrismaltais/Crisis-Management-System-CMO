<!DOCTYPE html>
<html class="bg-black">
    <head>
        <meta charset="UTF-8">
        <title>AdminLTE | Log in</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <!-- bootstrap 3.0.2 -->
        <link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet" type="text/css" />
        <!-- font Awesome -->
        <link href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="${pageContext.request.contextPath}/resources/css/AdminLTE.css" rel="stylesheet" type="text/css" />

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.${pageContext.request.contextPath}/resources/js/1.3.0/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="bg-black">
		
		<div class="container">
        <div class="form-box" id="login-box">
            <div class="header bg-light-blue">CMO Sign In</div>
            <font color="red">${errorMessage}</font>
            <form action="${pageContext.request.contextPath}/authenticator" id="loginForm" method="post">
                <div class="body bg-gray">
                    <div class="form-group">
                        <input type="text" name="username" class="form-control" placeholder="User ID" autofocus="autofocus" required/>
                    </div>
                    
					<div class="form-group">
                    		<input type="password" name="password" class="form-control" placeholder="Password" required/>
                    	</div>

                   <select
            				name="domain">
           	 			<option value="analyst">Analyst</option>
            				<option value="general">General</option>
       			  </select> 
							
				</div>
                <div class="footer">                                                               
                    <button type="submit" class="btn bg-light-blue btn-block" value="Submit">Sign me in</button>  
                </div>
            	</form>
            	</div>
            	<div class="row top-buffer">
           		<div class="col-md-offset-4">
           			<div class="h1">
           				<span class="type"></span>
           			</div>
           		</div>
           	</div>
            	</div>


        <!-- jQuery 2.0.2 -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.17.0/jquery.validate.min.js"></script>
        <script> $.validator.setDefaults({
            errorClass: 'help-block',
            highlight: function(element) {
              $(element)
                .closest('.form-group')
                .addClass('has-error');
            },
            unhighlight: function(element) {
              $(element)
                .closest('.form-group')
                .removeClass('has-error');
            },
            errorPlacement: function (error, element) {
              if (element.prop('type') === 'checkbox') {
                error.insertAfter(element.parent());
              } else {
                error.insertAfter(element);
              }
            }
          });</script>
        <script> $("#loginForm").validate({
        	  submitHandler: function(form) {
        		    $(form).ajaxSubmit();
        		  }
        		});</script>
        	
        <!-- Bootstrap -->
        <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" type="text/javascript"></script>   
        
        <!-- jQuery -->
       <script src="https://code.jquery.com/jquery-3.2.1.js"></script>
        
        <!--  Typed.js (1 file) -->
		<script src="${pageContext.request.contextPath}/resources/js/typed.js" type="text/javascript"></script> 
		
		<script>
        	var typed = new Typed(".type", {
        		  strings: ['Turning Crisis into Care', 'Turning Crisis into Comfort', 'Turning Crisis into Clarity.'], 
        		  smartBackspace: true,
        		  typeSpeed: 70,
        		  backSpeed: 70,
        		  backDelay: 400,
        		  startDelay: 1000
        		});
        	</script>
        	<!-- End Typed.js -->
		
    </body>
</html>