<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminLTE | Mailbox</title>
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

<!--  Chatbox style -->
<link
	href="${pageContext.request.contextPath}/resources/css/chat/main.css"
	rel="stylesheet" type="text/css" />

<!-- Google Maps -->
<script
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBDiT4KVHOVMfzURpGA_hfEbN2NF7D_3v0&libraries=geometry"
	type="text/javascript"></script>
<script src="/resources/js/map.js" type="text/javascript"></script>
<style>
#map {
	height: 400px;
	width: 100%;
}
</style>
<!-- End Google Maps -->

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.${pageContext.request.contextPath}/resources/js/1.3.0/respond.min.js"></script>
        <![endif]-->

<!-- JavaServer Pages Standard Tag Library (JSTL) is a collection of useful JSP tags -->
<!-- which encapsulate the core functionality common to many JSP applications. -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!-- Easy Javascript formatting of Date/Time -->
<script src="/webjars/momentjs/2.19.1/moment.js" type="text/javascript"></script>

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
										<th class="small-col">#</th>
										<th class="name">ID</th>
										<th class="subject">Subject</th>
										<th class="time">Time</th>
									</tr>
								</thead>
								<tbody id="mailboxContent">
									<c:forEach items="${messageList}" var="item" varStatus="stat">
										<tr ${item.read ? '' : 'class="unread"'}
											style="cursor: pointer;"
											onclick="loadDoc('/ajax/fromPMO/${item.crisisID}')">
											<td class="small-col">${stat.index + 1}</td>
											<td class="name">${item.crisisID}</td>
											<td class="name">Approval Report</td>
											<td class="time"><fmt:formatDate
													value="${item.messageReceivedTime}"
													pattern="dd/MM/yyyy HH:mm" /></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
						<!-- /.table-responsive -->
					</div>
					<!-- /.col (RIGHT) -->
				</div>
				<!-- /.row -->
			</div>
			<!-- CHAT BOX -->
			<div class="col-md-4">
				<div class="card mb-3 " style="height: 500px;">
					<div class="card-header">
						<i class="fa fa-bell-o"></i>
						<p class="same-line">PMO Live Feed</p>
						<div id="online-status" class="online-status"></div>
						<p id="online-status-text" class="same-line text-success small">Online</p>

					</div>


					<!--CHAT RECONNECT BUTTON-->

					<div class="connecting"></div>

					<div id="reconnect" class="center-div form-group">
						<button type="submit" onclick="reconnect()"
							class="accent username-submit btn btn-success">Reconnect</button>
					</div>

					<!--CHAT MESSAGE CONTAINER-->

					<div id="chat-page" style="height: 580px;">

						<ul id="messageArea"
							style="overflow-y: scroll; overflow-x: hidden;">
						</ul>

						<!--CHAT INPUT FORM -->
						<div class="box-footer">
							<form id="messageForm" name="messageForm" action="">
								<div class="input-group">
									<input class="form-control" type="text"
										placeholder="Send a message..." id="message" /> <span
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
								<td class="col-md-7">Crisis ID:</td>
								<td id="crisisID"></td>
							</tr>
							<tr>
								<td class="col-md-7">Received Time:</td>
								<td id="messageReceivedTime"></td>
							</tr>
							<tr>
								<td class="col-md-7">PDF:</td>
								<td><a id="pdf" target="_blank" href="#"></a></td>
							</tr>
						</tbody>
						<script>
							function loadDoc(link) {
								var xhttp = new XMLHttpRequest();

								document.getElementById("crisisID").innerHTML = "";
								document.getElementById("messageReceivedTime").innerHTML = "";
								document.getElementById("pdf").innerHTML = "";
								document.getElementById("pdf").setAttribute(
										"href", "#");

								xhttp.onreadystatechange = function() {
									if (this.readyState == 4
											&& this.status == 200) {
										var jsonObj = JSON.parse(this.response);

										document.getElementById("crisisID").innerHTML = jsonObj.crisisID;
										document
												.getElementById("messageReceivedTime").innerHTML = moment(jsonObj.messageReceivedTime).format("DD/MM/YYYY HH:mm");
										document.getElementById("pdf").innerHTML = "Click here	";
										document
												.getElementById("pdf")
												.setAttribute("href",
														"/" + jsonObj.reportURI);

									}
								};
								xhttp.open("GET", link, true);
								xhttp.send();
							}
						</script>
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
					<i class="fa fa-globe"></i>
					<h3 class="box-title">Map</h3>
				</div>
				<div class="box-body">
					<div id="map"></div>
				</div>
			</div>
		</div>
		</section>
		<!--/.content -->

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

		<!-- Page script -->
		<script type="text/javascript">
			$(function() {
				"use strict";
				//Initialize WYSIHTML5 - text editor
				$("#email_message").wysihtml5();
			});
		</script>

		<!-- Inbox Reactive Script -->
		<script>
			$(document).ready(function() {
				$("#mailboxContent tr").click(function() {
					$(this).removeClass("unread");
				});
			});
		</script>
		<!-- End Inbox Reactive Script -->

		<!-- chat script -->
		<script
			src="${pageContext.request.contextPath}/resources/js/chat/maingeneral.js"
			type="text/javascript"></script>
		<script
			src="${pageContext.request.contextPath}/resources/js/chat/sockjs.mingeneral.js"
			type="text/javascript"></script>
		<script
			src="${pageContext.request.contextPath}/resources/js/chat/stomp.mingeneral.js"
			type="text/javascript"></script>
</body>
</html>