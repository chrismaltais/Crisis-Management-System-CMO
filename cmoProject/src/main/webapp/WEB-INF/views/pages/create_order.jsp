<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSP2 CMO Analyst</title>
<meta
	content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no'
	name='viewport'>
<!-- bootstrap 3.0.2 -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<!-- font Awesome -->
<link
	href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<!-- Ionicons -->
<link
	href="${pageContext.request.contextPath}/resources/css/ionicons.min.css"
	rel="stylesheet" type="text/css" />
<!-- Theme style -->
<link
	href="${pageContext.request.contextPath}/resources/css/AdminLTE.css"
	rel="stylesheet" type="text/css" />


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
			<i class="fa fa-pencil-square-o"></i> Create Order <small>Order
				to EF</small>
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
					<form role="form" action="${pageContext.request.contextPath}/formSubmission/efOrders" method="post">
						<div class="box-body">
							<div class="form-group">
								<label for="crisisID">Crisis ID</label> <input type="text"
									id="crisisID" name="crisisID" class="form-control" placeholder="Crisis ID">
							</div>
							<div class="form-group">
								<label for="name">Name</label> <input type="text" id="name" name="name"
									class="form-control" placeholder="Name">
							</div>
							<div class="form-group">
								<label for="positionInCMO">Position in CMO</label> <input
									type="text" id="positionInCMO" name="positionInCMO" class="form-control"
									placeholder="Position in CMO">
							</div>
							<div class="form-group">
								<label for="threatLevel">Threat Level</label><br> <select
									id="threatLevel" name="threatLevel" class="dropdown">
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
								</select>
							</div>
							<div class="form-group">
								<label for="crisisType">Crisis Type</label> <input type="text"
									id="crisisType" name="crisisType" class="form-control" placeholder="Crisis Type">
							</div>
							<div class="form-group">
								<label for="affectedArea">Affected Area</label> <input
									type="text" id="affectedArea" name="affectedArea" class="form-control"
									placeholder="Affected Area">
							</div>
							<div class="form-group">
								<label for="crisisDetails">Crisis Details</label> <input
									type="text" id="crisisDetails" name="crisisDetails" class="form-control"
									placeholder="Crisis Details">
							</div>
							<div class="form-group">
								<label for="couseofAction">Course of Action</label> <input
									type="text" id="couseofAction" name="couseofAction" class="form-control"
									placeholder="Course of Action">
							</div>
							<!-- 							<div class="form-group"> -->
							<!-- 								<label>Textarea</label> -->
							<!-- 								<textarea class="form-control" rows="3" placeholder="Enter ..."></textarea> -->
							<!-- 							</div> -->

							<!-- 							<div class="form-group"> -->
							<!-- 								<label for="exampleInputFile">File input</label> <input -->
							<!-- 									type="file" id="exampleInputFile"> -->
							<!-- 								<p class="help-block">Example block-level help text here.</p> -->
							<!-- 							</div> -->

						</div>
						<!-- /.box-body -->

						<div class="box-footer">
							<button type="submit" class="btn btn-primary">Submit</button>
						</div>
						${messageContent}
					</form>
				</div>
			</div>
		</div>


	</section>




	<!-- jQuery 2.0.2 -->
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"
		type="text/javascript"></script>
	<!-- AdminLTE App -->
	<script
		src="${pageContext.request.contextPath}/resources/js/AdminLTE/app.js"
		type="text/javascript"></script>
	<!-- CK Editor -->
	<script
		src="${pageContext.request.contextPath}/resources/js/plugins/ckeditor/ckeditor.js"
		type="text/javascript"></script>
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