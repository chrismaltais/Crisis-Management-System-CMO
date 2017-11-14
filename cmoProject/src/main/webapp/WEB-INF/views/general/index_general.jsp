<!DOCTYPE html>
<html>
<head>
<title>SSP2 CMO</title>
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
<!-- Morris chart -->
<link
	href="${pageContext.request.contextPath}/resources/css/morris/morris.css"
	rel="stylesheet" type="text/css" />
<!-- jvectormap -->
<link
	href="${pageContext.request.contextPath}/resources/css/jvectormap/jquery-jvectormap-1.2.2.css"
	rel="stylesheet" type="text/css" />
<!-- fullCalendar -->
<link
	href="${pageContext.request.contextPath}/resources/css/fullcalendar/fullcalendar.css"
	rel="stylesheet" type="text/css" />
<!-- Daterange picker -->
<link
	href="${pageContext.request.contextPath}/resources/css/daterangepicker/daterangepicker-bs3.css"
	rel="stylesheet" type="text/css" />
<!-- bootstrap wysihtml5 - text editor -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css"
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
			Dashboard<small>General</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
			<li class="active">Dashboard</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">
		<!-- Calendar -->
		<div class="col-xs-6">
			<div class="box box-warning">
				<div class="box-header">
					<i class="fa fa-calendar"></i>
					<div class="box-title">Calendar</div>

					<!-- tools box -->
					<div class="pull-right box-tools">
						<!-- button with a dropdown -->
						<div class="btn-group">
							<button class="btn btn-warning btn-sm dropdown-toggle"
								data-toggle="dropdown">
								<i class="fa fa-bars"></i>
							</button>
							<ul class="dropdown-menu pull-right" role="menu">
								<li><a href="#">Add new event</a></li>
								<li><a href="#">Clear events</a></li>
								<li class="divider"></li>
								<li><a href="#">View calendar</a></li>
							</ul>
						</div>
					</div>
					<!-- /. tools -->
				</div>
				<!-- /.box-header -->
				<div class="box-body no-padding">
					<!--The calendar -->
					<div id="calendar"></div>
				</div>
				<!-- /.box-body -->
			</div>
		</div>
		<!-- /.box -->

		<!-- TO DO List -->
		<div class="col-xs-6">
			<div class="box box-primary">
				<div class="box-header">
					<i class="ion ion-clipboard"></i>
					<h3 class="box-title">To Do List</h3>
					<div class="box-tools pull-right">
						<ul class="pagination pagination-sm inline">
							<li><a href="#">&laquo;</a></li>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">&raquo;</a></li>
						</ul>
					</div>
				</div>
				<!-- /.box-header -->
				<div class="box-body">
					<ul class="todo-list">
						<li>
							<!-- drag handle --> <span class="handle"> <i
								class="fa fa-ellipsis-v"></i> <i class="fa fa-ellipsis-v"></i>
						</span> <!-- checkbox --> <input type="checkbox" value="" name="" /> <!-- todo text -->
							<span class="text">Design a nice theme</span> <!-- Emphasis label -->
							<small class="label label-danger"><i
								class="fa fa-clock-o"></i> 2 mins</small> <!-- General tools such as edit or delete-->
							<div class="tools">
								<i class="fa fa-edit"></i> <i class="fa fa-trash-o"></i>
							</div>
						</li>
						<li><span class="handle"> <i class="fa fa-ellipsis-v"></i>
								<i class="fa fa-ellipsis-v"></i>
						</span> <input type="checkbox" value="" name="" /> <span class="text">Make
								the theme responsive</span> <small class="label label-info"><i
								class="fa fa-clock-o"></i> 4 hours</small>
							<div class="tools">
								<i class="fa fa-edit"></i> <i class="fa fa-trash-o"></i>
							</div></li>
						<li><span class="handle"> <i class="fa fa-ellipsis-v"></i>
								<i class="fa fa-ellipsis-v"></i>
						</span> <input type="checkbox" value="" name="" /> <span class="text">Let
								theme shine like a star</span> <small class="label label-warning"><i
								class="fa fa-clock-o"></i> 1 day</small>
							<div class="tools">
								<i class="fa fa-edit"></i> <i class="fa fa-trash-o"></i>
							</div></li>
						<li><span class="handle"> <i class="fa fa-ellipsis-v"></i>
								<i class="fa fa-ellipsis-v"></i>
						</span> <input type="checkbox" value="" name="" /> <span class="text">Let
								theme shine like a star</span> <small class="label label-success"><i
								class="fa fa-clock-o"></i> 3 days</small>
							<div class="tools">
								<i class="fa fa-edit"></i> <i class="fa fa-trash-o"></i>
							</div></li>
						<li><span class="handle"> <i class="fa fa-ellipsis-v"></i>
								<i class="fa fa-ellipsis-v"></i>
						</span> <input type="checkbox" value="" name="" /> <span class="text">Check
								your messages and notifications</span> <small
							class="label label-primary"><i class="fa fa-clock-o"></i>
								1 week</small>
							<div class="tools">
								<i class="fa fa-edit"></i> <i class="fa fa-trash-o"></i>
							</div></li>
						<li><span class="handle"> <i class="fa fa-ellipsis-v"></i>
								<i class="fa fa-ellipsis-v"></i>
						</span> <input type="checkbox" value="" name="" /> <span class="text">Let
								theme shine like a star</span> <small class="label label-default"><i
								class="fa fa-clock-o"></i> 1 month</small>
							<div class="tools">
								<i class="fa fa-edit"></i> <i class="fa fa-trash-o"></i>
							</div></li>
					</ul>
				</div>
				<!-- /.box-body -->
				<div class="box-footer clearfix no-border">
					<button class="btn btn-default pull-right">
						<i class="fa fa-plus"></i> Add item
					</button>
				</div>
			</div>
		</div>
		<!-- /.box -->


		<!-- jQuery 2.0.2 -->
		<script
			src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
		<!-- jQuery UI 1.10.3 -->
		<script
			src="${pageContext.request.contextPath}/resources/js/jquery-ui-1.10.3.min.js"
			type="text/javascript"></script>
		<!-- Bootstrap -->
		<script
			src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"
			type="text/javascript"></script>
		<!-- Morris.js charts -->
		<script
			src="//cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
		<script
			src="${pageContext.request.contextPath}/resources/js/plugins/morris/morris.min.js"
			type="text/javascript"></script>
		<!-- Sparkline -->
		<script
			src="${pageContext.request.contextPath}/resources/js/plugins/sparkline/jquery.sparkline.min.js"
			type="text/javascript"></script>
		<!-- jvectormap -->
		<script
			src="${pageContext.request.contextPath}/resources/js/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"
			type="text/javascript"></script>
		<script
			src="${pageContext.request.contextPath}/resources/js/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"
			type="text/javascript"></script>
		<!-- fullCalendar -->
		<script
			src="${pageContext.request.contextPath}/resources/js/plugins/fullcalendar/fullcalendar.min.js"
			type="text/javascript"></script>
		<!-- jQuery Knob Chart -->
		<script
			src="${pageContext.request.contextPath}/resources/js/plugins/jqueryKnob/jquery.knob.js"
			type="text/javascript"></script>
		<!-- daterangepicker -->
		<script
			src="${pageContext.request.contextPath}/resources/js/plugins/daterangepicker/daterangepicker.js"
			type="text/javascript"></script>
		<!-- Bootstrap WYSIHTML5 -->
		<script
			src="${pageContext.request.contextPath}/resources/js/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"
			type="text/javascript"></script>
		<!-- iCheck -->
		<script
			src="${pageContext.request.contextPath}/resources/js/plugins/iCheck/icheck.min.js"
			type="text/javascript"></script>

		<!-- AdminLTE App -->
		<script
			src="${pageContext.request.contextPath}/resources/js/AdminLTE/app.js"
			type="text/javascript"></script>

		<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
		<script
			src="${pageContext.request.contextPath}/resources/js/AdminLTE/dashboard.js"
			type="text/javascript"></script>

		<!-- AdminLTE for demo purposes -->
		<script
			src="${pageContext.request.contextPath}/resources/js/AdminLTE/demo.js"
			type="text/javascript"></script>
</body>
</html>