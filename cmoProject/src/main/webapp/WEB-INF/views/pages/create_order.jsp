<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>SSP2 CMO Analyst</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <!-- bootstrap 3.0.2 -->
        <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- font Awesome -->
        <link href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Ionicons -->
        <link href="${pageContext.request.contextPath}/resources/css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="${pageContext.request.contextPath}/resources/css/AdminLTE.css" rel="stylesheet" type="text/css" />

        
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.${pageContext.request.contextPath}/resources/js/1.3.0/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>

	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			<i class="fa fa-pencil-square-o"></i> Create Order <small>Order to EF</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
			<li><a href="#">EF</a></li>
			<li class="active">Create Order</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">
		
		<div class='row'>
			<div class='col-md-12'>
				<div class='box box-info'>
					<div class='box-header'>
						<h3 class='box-title'>Create EF Orders</h3>
					</div>
					<!-- /.box-header -->
					<div class='box-body pad'>
						<form>
							<textarea id="editor1" name="editor1" rows="10" cols="80">
                                            This is my textarea to be replaced with CKEditor.
                                        </textarea>
						</form>
					</div>
					<div class="box-footer">
							<button type="submit" class="btn btn-primary">Submit to EF</button>
					</div>					
				</div>				
			</div>	
		</div>
	
		
	</section>




        <!-- jQuery 2.0.2 -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
        <!-- Bootstrap -->
        <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" type="text/javascript"></script>
        <!-- AdminLTE App -->
        <script src="${pageContext.request.contextPath}/resources/js/AdminLTE/app.js" type="text/javascript"></script>
        <!-- CK Editor -->
        <script src="${pageContext.request.contextPath}/resources/js/plugins/ckeditor/ckeditor.js" type="text/javascript"></script>
        <script type="text/javascript">
									$(function() {
										// Replace the <textarea id="editor1"> with a CKEditor
										// instance, using default configuration.
										CKEDITOR.replace('editor1');
										//bootstrap WYSIHTML5 - text editor
										//$(".textarea").wysihtml5();
									});
								</script>



    </body>
</html>