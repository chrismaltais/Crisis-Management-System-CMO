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
<!-- bootstrap wysihtml5 - text editor -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css"
	rel="stylesheet" type="text/css" />
<!-- iCheck for checkboxes and radio inputs -->
<link
	href="${pageContext.request.contextPath}/resources/css/iCheck/minimal/blue.css"
	rel="stylesheet" type="text/css" />
<!-- Theme style -->
<link
	href="${pageContext.request.contextPath}/resources/css/AdminLTE.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath}/resources/css/chat/main.css"
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
			<i class="fa fa-medkit"></i> EF <small>EF Order | EF Chat</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
			<li><a href="#">EF</a></li>
			<li class="active">Orders Inbox</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">
		<!-- MAILBOX BEGIN -->
		<div class="mailbox row">
			<div class="col-xs-8">
				<div class="box box-solid">
					<div class="box-body">
						<div class="row">
							<div class="col-md-4 col-sm-4">
								<!-- BOXES are complex enough to move the .box-header around.
                                                 This is an example of having the box header within the box body -->
								<div class="box-header">
									<i class="fa fa-inbox"></i>
									<h3 class="box-title">INBOX</h3>
								</div>
							</div>
							<div class="col-xs-4 col-md-3 pull-right search-form">
								<form action="#" class="text-right">
									<div class="input-group">
										<input type="text" class="form-control input-sm"
											placeholder="Search">
										<div class="input-group-btn">
											<button type="submit" name="q" class="btn btn-sm btn-primary">
												<i class="fa fa-search"></i>
											</button>
										</div>
									</div>
								</form>
							</div>
						</div>
						<!-- /.row -->

						<div class="table-responsive">
							<!-- THE MESSAGES -->
							<table class="table table-mailbox">
								<thead>
									<tr>
										<th>#</th>
										<th>ID</th>
										<th>Subject</th>
										<th>Status</th>
										<th>Reason</th>
										<th>Time</th>
									</tr>
								</thead>
								<tr class="unread">
									<td class="small-col">1</td>
									<td class="name"><a href="#">John</a></td>
									<td class="subject"><a href="#">Urgent! Please read</a></td>
									<td class="status">Pending</td>
									<td class="reason">No idea</td>
									<td class="time">12:30 PM</td>
								</tr>
								<tr>
									<td class="small-col">2</td>
									<td class="name"><a href="#">John</a></td>
									<td class="subject"><a href="#">Urgent! Please read</a></td>
									<td class="status">Pending</td>
									<td class="reason">No idea</td>
									<td class="time">12:30 PM</td>
								</tr>
								<tr class="unread">
									<td class="small-col">3</td>
									<td class="name"><a href="#">John</a></td>
									<td class="subject"><a href="#">Urgent! Please read</a></td>
									<td class="status">Pending</td>
									<td class="reason">No idea</td>
									<td class="time">12:30 PM</td>
								</tr>
								<tr>
									<td class="small-col">4</td>
									<td class="name"><a href="#">John</a></td>
									<td class="subject"><a href="#">Urgent! Please read</a></td>
									<td class="status">Pending</td>
									<td class="reason">No idea</td>
									<td class="time">12:30 PM</td>
								</tr>
								<tr>
									<td class="small-col">5</td>
									<td class="name"><a href="#">John</a></td>
									<td class="subject"><a href="#">Urgent! Please read</a></td>
									<td class="status">Pending</td>
									<td class="reason">No idea</td>
									<td class="time">12:30 PM</td>
								</tr>
								<tr>
									<td class="small-col">6</td>
									<td class="name"><a href="#">John</a></td>
									<td class="subject"><a href="#">Urgent! Please read</a></td>
									<td class="status">Pending</td>
									<td class="reason">No idea</td>
									<td class="time">12:30 PM</td>
								</tr>
								<tr>
									<td class="small-col">7</td>
									<td class="name"><a href="#">John</a></td>
									<td class="subject"><a href="#">Urgent! Please read</a></td>
									<td class="status">Pending</td>
									<td class="reason">No idea</td>
									<td class="time">12:30 PM</td>
								</tr>
								<tr class="unread">
									<td class="small-col">8</td>
									<td class="name"><a href="#">John</a></td>
									<td class="subject"><a href="#">Urgent! Please read</a></td>
									<td class="status">Pending</td>
									<td class="reason">No idea</td>
									<td class="time">12:30 PM</td>
								</tr>
								<tr class="unread">
									<td class="small-col">9</td>
									<td class="name"><a href="#">John</a></td>
									<td class="subject"><a href="#">Urgent! Please read</a></td>
									<td class="status">Pending</td>
									<td class="reason">No idea</td>
									<td class="time">12:30 PM</td>
								</tr>
								<tr>
									<td class="small-col">10</td>
									<td class="name"><a href="#">John</a></td>
									<td class="subject"><a href="#">Urgent! Please read</a></td>
									<td class="status">Pending</td>
									<td class="reason">No idea</td>
									<td class="time">12:30 PM</td>
								</tr>
							</table>
						</div>
						<!-- /.table-responsive -->
					</div>
					<!-- /.col (RIGHT) -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.box -->

			<!-- CHAT BOX -->
			<div class="col-md-4">
				<div class="card mb-3 " style="height: 500px;">
					<div class="card-header">
						<i class="fa fa-bell-o"></i>
						<p class="same-line">CMO Live Feed</p>
						<div id="internal-online-status" class="online-status"></div>
						<p id="internal-online-status-text" class="same-line text-success small">Online</p>

					</div>


					<!--CHAT RECONNECT BUTTON-->

					<div class="connecting"></div>

					<div id="internal-reconnect" class="center-div form-group">
						<button type="submit" onclick="internalreconnect()"
							class="accent username-submit btn btn-success">Reconnect</button>
					</div>



					<!--CHAT MESSAGE CONTAINER-->

					<div id="chat-page" style="height: 580px;">

						<ul id="internalmessageArea"
							style="overflow-y: scroll; overflow-x: hidden;">
						</ul>

						<!--CHAT INPUT FORM -->
						<div class="box-footer">
						<form id="internalmessageForm" name="messageForm" action="">
								<div class="input-group">
									<input class="form-control" type="text"
										placeholder="Send a message..." id="internalmessage" /> <span
										class="input-group-btn">
										<button class="btn btn-success" type="submit"
											style="width: 50px;">
											<i class="fa fa-plus"></i>
										</button>
									</span>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<!-- MAILBOX END -->
		</div>






	</section>
	<!-- /.content -->

	<div class="col-md-6">
		<div class="box box-primary">
			<div class="box-header">
				<h4 class="box-title">Crisis Data</h4>
			</div>
			<div class="box-body">
				<!-- the events -->
				<table class="table table-condensed">
					<tbody>
						<tr>
							<td>Crisis ID:</td>
							<td>1</td>
						</tr>
						<tr>
							<td>Name:</td>
							<td>Gabriel</td>
						</tr>
						<tr>
							<td>Position in 911:</td>
							<td>Janitor</td>
						</tr>
						<tr>
							<td>Crisis type:</td>
							<td>Robot Invasion</td>
						<tr>
						<tr>
							<td>Crisis Details:</td>
							<td>Robot shooting and killing students</td>
						<tr>
						<tr>
							<td>Crisis Date:</td>
							<td>20 September 2017</td>
						<tr>
						<tr>
							<td>Estimated start time of crisis:</td>
							<td>1500</td>
						<tr>
						<tr>
							<td>Affected location:</td>
							<td>Orchard (1.301800, 103.837797)</td>
						<tr>
						<tr>
							<td>Suggested Strategy:</td>
							<td>Surround robots at predicted area</td>
						<tr>
					</tbody>
				</table>
			</div>
			<div class="box-footer">
				<button class="btn btn-info">
					<i class="fa fa-globe"></i> Generate Map
				</button>
				<button class="btn btn-info pull-right">
					<i class="fa fa-users"></i>Send to Analyst
				</button>
			</div>
		</div>
	</div>
	<div class="col-md-6">
		<div class="box box-primary">
			<div class="box-header">
				<h3 class="box-title">Map</h3>
			</div>
			<div class="box-body">
				<h3 class="box-title">Danger Box (Loading state)</h3>
				<div class="box-tools pull-right">
					<button class="btn btn-danger btn-sm" data-widget="collapse">
						<i class="fa fa-minus"></i>
					</button>
					<button class="btn btn-danger btn-sm" data-widget="remove">
						<i class="fa fa-times"></i>
					</button>
				</div>
			</div>
			<div class="box-body">
				Box class:
				<code>.box.box-danger</code>
				<p>piece of shit pieces of shit.piece of shit pieces of shit.
					piece of shit pieces of shit.piece of shit pieces of shit. piece of
					shit pieces of shit.piece of shit pieces of shit. piece of shit
					pieces of shit.piece of shit pieces of shit. piece of shit pieces
					of shit.piece of shit pieces of shit. piece of shit pieces of
					shit.piece of shit pieces of shit. piece of shit pieces of
					shit.piece of shit pieces of shit.</p>
			</div>
			<div class="overlay"></div>
			<div class="loading-img"></div>
		</div>
	</div>


	<!--/.content -->

	<!-- jQuery 2.0.2 -->
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js">
	</script>
	<!-- Bootstrap -->
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"
		type="text/javascript">
		</script>
	<!-- AdminLTE App -->
	<script
		src="${pageContext.request.contextPath}/resources/js/AdminLTE/app.js"
		type="text/javascript">
		</script>
	<!-- Bootstrap WYSIHTML5 -->
	<script
		src="${pageContext.request.contextPath}/resources/js/plugins//bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"
		type="text/javascript">
		</script>
	<!-- iCheck -->
	<script
		src="${pageContext.request.contextPath}/resources/js/plugins//iCheck/icheck.min.js"
		type="text/javascript">
	</script>
	<!-- Chat Scripts -->
	<script
		src="${pageContext.request.contextPath}/resources/js/chat/main.js"
		type="text/javascript">
	</script>
	<script
		src="${pageContext.request.contextPath}/resources/js/chat/sockjs.min.js"
		type="text/javascript">
	</script>
	<script
		src="${pageContext.request.contextPath}/resources/js/chat/stomp.min.js"
		type="text/javascript">
	</script>
	<!-- Page script -->
	<script type="text/javascript">
	$(function() {

		"use strict";

		//Initialize WYSIHTML5 - text editor
		$("#email_message").wysihtml5();
	});
	</script>

</body>
</html>