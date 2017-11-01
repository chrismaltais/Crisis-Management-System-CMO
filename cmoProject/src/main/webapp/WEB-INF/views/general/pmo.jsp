<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>AdminLTE | Mailbox</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <!-- bootstrap 3.0.2 -->
        <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- font Awesome -->
        <link href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Ionicons -->
        <link href="${pageContext.request.contextPath}/resources/css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <!-- bootstrap wysihtml5 - text editor -->
        <link href="${pageContext.request.contextPath}/resources/css/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css" rel="stylesheet" type="text/css" />
        <!-- iCheck for checkboxes and radio inputs -->
        <link href="${pageContext.request.contextPath}/resources/css/iCheck/minimal/blue.css" rel="stylesheet" type="text/css" />
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
			PMO <small>PrimeMinisterOffice</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
			<li class="active">PMO</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">
		<!-- MAILBOX BEGIN -->
		<div class="mailbox row">
			<div class="col-xs-6">
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
													<button type="submit" name="q"
														class="btn btn-sm btn-primary">
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
					<div class="col-xs-6">
					<div class="box box-success">
					<div class="box-header">
						<h3 class="box-title">
							<i class="fa fa-comments-o"></i> Chat
						</h3>
						<div class="box-tools pull-right" data-toggle="tooltip"
							title="Status">
							<div class="btn-group" data-toggle="btn-toggle">
								<button type="button" class="btn btn-default btn-sm active">
									<i class="fa fa-square text-green"></i>
								</button>
								<button type="button" class="btn btn-default btn-sm">
									<i class="fa fa-square text-red"></i>
								</button>
							</div>
						</div>
					</div>
					<div class="box-body chat" id="chat-box">
						<!-- chat item -->
						<div class="item">
							<img
								src="${pageContext.request.contextPath}/resources/img/avatar.png"
								alt="user image" class="online" />
							<p class="message">
								<a href="#" class="name"> <small
									class="text-muted pull-right"><i class="fa fa-clock-o"></i>
										2:15</small> Mike Doe
								</a> I would like to meet you to discuss the latest news about the
								arrival of the new theme. They say it is going to be one the
								best themes on the market
							</p>
							<div class="attachment">
								<h4>Attachments:</h4>
								<p class="filename">Theme-thumbnail-image.jpg</p>
								<div class="pull-right">
									<button class="btn btn-primary btn-sm btn-flat">Open</button>
								</div>
							</div>
							<!-- /.attachment -->
						</div>
						<!-- /.item -->
						<!-- chat item -->
						<div class="item">
							<img
								src="${pageContext.request.contextPath}/resources/img/avatar2.png"
								alt="user image" class="offline" />
							<p class="message">
								<a href="#" class="name"> <small
									class="text-muted pull-right"><i class="fa fa-clock-o"></i>
										5:15</small> Jane Doe
								</a> I would like to meet you to discuss the latest news about the
								arrival of the new theme. They say it is going to be one the
								best themes on the market
							</p>
						</div>
						<!-- /.item -->
						<!-- chat item -->
						<div class="item">
							<img
								src="${pageContext.request.contextPath}/resources/img/avatar3.png"
								alt="user image" class="offline" />
							<p class="message">
								<a href="#" class="name"> <small
									class="text-muted pull-right"><i class="fa fa-clock-o"></i>
										5:30</small> Susan Doe
								</a> I would like to meet you to discuss the latest news about the
								arrival of the new theme. They say it is going to be one the
								best themes on the market
							</p>
						</div>
						<!-- /.item -->
					</div>
					<!-- /.chat -->
					<div class="box-footer">
						<div class="input-group">
							<input class="form-control" placeholder="Type message..." />
							<div class="input-group-btn">
								<button class="btn btn-success">
									<i class="fa fa-plus"></i>
								</button>
							</div>
						</div>
					</div>
				</div>
					<!-- /.box-body -->
				</div>
				<!-- /.box -->
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
						      	<td>Estimated crisis duration:</td>
						      	<td>60 minutes</td>
						      <tr>
						      <tr>
						      	<td>Affected location:</td>
						      	<td>Orchard (1.301800, 103.837797)</td>
						      <tr>
						      <tr>
						      	<td>Suggested strategy:</td>
						      	<td>Surround robots at predicted area</td>
						      <tr>
						      <tr>
						      	<td>Consequences of suggested strategy:</td>
						      	<td>10% of human population will be wiped out</td>
						      <tr>
						      <tr>
						      	<td>Estimated Casualties:</td>
						      	<td>100,000</td>
						      <tr>
						      <tr>
						      	<td>Clean up action:</td>
						      	<td>SCDF to help the injured</td>
						      <tr>
						    </tbody>
						  </table>
						</div>
						<div class="box-footer">
							<button class="btn btn-info">
								<i class="fa fa-globe"></i> Generate Map
							</button>
							<button class ="btn btn-info pull-right">
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
							<object type="text/html" data="${pageContext.request.contextPath}/map"  width= "600px" height="450px" ></object>
						<div class="box-tools pull-right">
							<button class="btn btn-danger btn-sm" data-widget="collapse">
								<i class="fa fa-minus"></i>
							</button>
							<button class="btn btn-danger btn-sm" data-widget="remove">
								<i class="fa fa-times"></i>
							</button>
						</div>
					</div>
				<!--  
					<div class="overlay"></div>
					<div class="loading-img"></div>
					-->	
				</div>
			</div>
<!--/.content -->	

        <!-- jQuery 2.0.2 -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
        <!-- Bootstrap -->
        <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" type="text/javascript"></script>
        <!-- AdminLTE App -->
        <script src="${pageContext.request.contextPath}/resources/js/AdminLTE/app.js" type="text/javascript"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="${pageContext.request.contextPath}/resources/js/AdminLTE/demo.js" type="text/javascript"></script>        
        <!-- Bootstrap WYSIHTML5 -->
        <script src="${pageContext.request.contextPath}/resources/js/plugins//bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js" type="text/javascript"></script>
        <!-- iCheck -->
        <script src="${pageContext.request.contextPath}/resources/js/plugins//iCheck/icheck.min.js" type="text/javascript"></script>
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