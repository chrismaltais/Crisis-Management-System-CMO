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

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
</head>
<body>

        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    </head>
    <body>

	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			<i class="fa fa-star"></i> General <small>Inbox and Proposal</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
			<li><a href="#">General</a></li>
			<li class="active">Proposal Inbox</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">

		<!-- top row -->
		<!--  <div class="911-row">
			<div class="col-xs-12"></div>-->
		<!-- /.col -->
		<!-- </div>-->
		<!-- /.row -->

		<!-- main row -->
		<div class="mailbox row">
			<section class="col-xs-12">

				<div class="box box-solid">
					<div class="box-body">
						<div class="row">

							<!-- /.col (LEFT) -->
							<div class="col-md-12">
								<div class="row pad">
									<div class="col-sm-6">
										<div class="box-header">
											<i class="fa fa-inbox"></i>
											<h3 class="box-title">INBOX - Proposals</h3>
										</div>

									</div>
									<div class="col-sm-3 blank"></div>
									<div class="col-sm-3 search-form">
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
										<tr>
											<th class="small-col">#</th>
											<th class="name">ID</th>
											<th class="subject">Subject</th>
											<th class="time">Time</th>
										</tr>

										<c:forEach items="${messageList}" var="item" varStatus="stat">
											<tr ${item.read ? '' : 'class="unread"'}
												style="cursor: pointer;"
												onclick="loadDoc('/ajax/general/${item.crisisID}')">
												<td class="small-col">${stat.index + 1}</td>
												<td class="name">${item.crisisID}</td>
												<td class="name">Approval Report</td>
												<td class="time"><fmt:formatDate
														value="${item.messageReceivedTime}"
														pattern="dd/MM/yyyy hh:mm" /></td>
											</tr>
										</c:forEach>

										<!-- 										<tr class="unread"> -->
										<!-- 											<td class="small-col">1</td> -->
										<!-- 											<td class="name">John Doe</td> -->
										<!-- 											<td class="subject"><a href="#">Urgent! Please read</a></td> -->
										<!-- 											<td class="time">12:30 PM</td> -->
										<!-- 										</tr> -->
										<!-- 										<tr> -->
										<!-- 											<td class="small-col">2</td> -->
										<!-- 											<td class="name">John Doe</td> -->
										<!-- 											<td class="subject"><a href="#">Urgent! Please read</a></td> -->
										<!-- 											<td class="time">12:30 PM</td> -->
										<!-- 										</tr> -->
										<!-- 										<tr> -->
										<!-- 											<td class="small-col">3</td> -->
										<!-- 											<td class="name">John Doe</td> -->
										<!-- 											<td class="subject"><a href="#">Urgent! Please read</a></td> -->
										<!-- 											<td class="time">12:30 PM</td> -->
										<!-- 										</tr> -->
										<!-- 										<tr class="unread"> -->
										<!-- 											<td class="small-col">4</td> -->
										<!-- 											<td class="name">John Doe</a></td> -->
										<!-- 											<td class="subject"><a href="#">Urgent! Please read</a></td> -->
										<!-- 											<td class="time">12:30 PM</td> -->
										<!-- 										</tr> -->
										<!-- 										<tr> -->
										<!-- 											<td class="small-col">5</td> -->
										<!-- 											<td class="name">John Doe</td> -->
										<!-- 											<td class="subject"><a href="#">Urgent! Please read</a></td> -->
										<!-- 											<td class="time">12:30 PM</td> -->
										<!-- 										</tr> -->
										<!-- 										<tr> -->
										<!-- 											<td class="small-col">6</td> -->
										<!-- 											<td class="name">John Doe</td> -->
										<!-- 											<td class="subject"><a href="#">Urgent! Please read</a></td> -->
										<!-- 											<td class="time">12:30 PM</td> -->
										<!-- 										</tr> -->
										<!-- 										<tr> -->
										<!-- 											<td class="small-col">7</td> -->
										<!-- 											<td class="name">John Doe</td> -->
										<!-- 											<td class="subject"><a href="#">Urgent! Please read</a></td> -->
										<!-- 											<td class="time">12:30 PM</td> -->
										<!-- 										</tr> -->
										<!-- 										<tr> -->
										<!-- 											<td class="small-col">8</td> -->
										<!-- 											<td class="name">John Doe</td> -->
										<!-- 											<td class="subject"><a href="#">Urgent! Please read</a></td> -->
										<!-- 											<td class="time">12:30 PM</td> -->
										<!-- 										</tr> -->
										<!-- 										<tr class="unread"> -->
										<!-- 											<td class="small-col">9</td> -->
										<!-- 											<td class="name">John Doe</td> -->
										<!-- 											<td class="subject"><a href="#">Urgent! Please read</a></td> -->
										<!-- 											<td class="time">12:30 PM</td> -->
										<!-- 										</tr> -->
										<!-- 										<tr class="unread"> -->
										<!-- 											<td class="small-col">10</td> -->
										<!-- 											<td class="name">John Doe</td> -->
										<!-- 											<td class="subject"><a href="#">Urgent! Please read</a></td> -->
										<!-- 											<td class="time">12:30 PM</td> -->
										<!-- 										</tr> -->
									</table>
								</div>
								<!-- /.table-responsive -->
							</div>
							<!-- /.col (RIGHT) -->
						</div>
						<!-- /.row -->
					</div>
					<!-- /.box-body -->
					
					<!-- box-footer -->
				</div>
				<!-- /.box -->

			</section>


		</div>

		<div class="row">
			<div class="col-md-6">
				<div class="box box-primary">
					<div class="box-header">
						<h4 class="box-title">Crisis Data</h4>
					</div>
					<!-- /.box-header -->
					<div class="box-body">

						</table>
						<object id="pdf" data="" height="100%" width="100%">
							<p>No Approval Report loaded.</p>
						</object>
					</div>
					<script>
						function loadDoc(link) {
							var xhttp = new XMLHttpRequest();

							document.getElementById("crisisID").innerHTML = "";
							document.getElementById("pdf").setAttribute("data", "");

							xhttp.onreadystatechange = function() {
								if (this.readyState == 4 && this.status == 200) {
									var jsonObj = JSON.parse(this.response);

									document.getElementById("crisisID").innerHTML = jsonObj.crisisID;
									document.getElementById("pdf").setAttribute("data", "/" + jsonObj.reportURI);

								}
							};
							xhttp.open("GET", link, true);
							xhttp.send();
						}
					</script>
					<!-- /.box-body -->
					<div class="box-footer clearfix">
						<button class="btn btn-xs btn-primary pull-right">View on
							Map</button>
					</div>
				</div>
				<!-- /.box -->
			</div>
			<!-- /.col -->


			<div class="col-md-6">
				<div class="box">
					<div class="box-header">
						<i class="fa fa-globe"></i>
						<h3 class="box-title">Map</h3>
					</div>
					<!-- /.box-header -->
					<div class="box-body">
							<div>
								<object type="text/html"
									data="${pageContext.request.contextPath}/map" width="100%"
									height="400px"></object>

							</div>
						</div>
					</div>
					<!-- Loading (remove the following to stop the loading)
					<div class="overlay"></div>
					<div class="loading-img"></div>
					<!-- end loading -->
				</div>
			</div>

		</div>
	</section>
	<!-- /.content -->

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

</body>
</html>