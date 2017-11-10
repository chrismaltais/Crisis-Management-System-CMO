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

<!-- What is moment for?? -->
<script src="/webjars/momentjs/2.19.1/moment.js" type="text/javascript"></script>

<!--  What are these actually for? -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

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
											<th>CrisisID</th>
											<th>Threat Level</th>
											<th>Deployment Status</th>
											<th>Date & Time</th>
										</tr>
									</thead>
									<tbody id="mailboxContent">
										<c:forEach items="${messageList}" var="item" varStatus="stat">
											<tr ${item.read ? '' : 'class="unread"'}
												style="cursor: pointer;"
												onclick="loadDoc('/ajax/ef/from/${item.feedbackReportID}')">
												<td class="small-col">${stat.index + 1}</td>
												<td class="name">${item.crisisID}</td>
												<td class="subject">${item.threatLevel}</td>
												<td class="subject">${item.deploymentStatus}</td>
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
					</div>
				</div>
			
			<!-- CHAT BOX -->
			<div class="col-md-4">
				<div class="card mb-3 " style="height: 500px;">
					<div class="card-header">
						<i class="fa fa-bell-o"></i>
						<p class="same-line">EF Live Feed</p>
						<div id="internal-online-status" class="online-status"></div>
						<p id="internal-online-status-text"
							class="same-line text-success small">Online</p>

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
	</div>
	<!--  2nd row -->
	<div class="row">
		<div class="col-md-6">
			<div class="box">
				<div class="box-header">
					<h4 class="box-title">Crisis Data</h4>
				</div>
				<!-- /.box-header -->
				<div class="box-body">
					<table id="messageContent" class="table table-condensed">
						<tbody>
							<tr>
								<td>Report ID:</td>
								<td id="feedbackReportID"></td>
							</tr>
							<tr>
								<td>Crisis ID:</td>
								<td id="crisisID"></td>
							</tr>
							<tr>
								<td>Name:</td>
								<td id="name"></td>
							</tr>
							<tr>
								<td>Position in EF:</td>
								<td id="positionInEF"></td>
							</tr>
							<tr>
								<td>Threat Level:</td>
								<td id="threatLevel"></td>
							</tr>
							<tr>
								<td>Casualties Rescued:</td>
								<td id="casualtiesRescued"></td>
							</tr>
							<tr>
								<td>Deployment Status</td>
								<td id="deploymentStatus"></td>
							</tr>
							<tr>
								<td>Situation Status:</td>
								<td id="situationStatus"></td>
							</tr>
							<tr>
								<td>Timestamp:</td>
								<td id="timestamp"></td>
							</tr>
						</tbody>
					</table>
				</div>
				<!-- /.box-body -->
				
				<!-- Button/Function to Load Map -->
				<div class="box-footer clearfix">
					<button class="btn btn-xl btn-primary pull-right" 
						onclick="putToMap()">View on Map</button>
				</div>
				<script type="text/javascript">
				function putToMap() {
							var marker = {
								coords : coordParse(document
										.getElementById("affectedArea").innerHTML),
								content : document
										.getElementById("callReportID").innerHTML
							};
							addMarker(marker);
						}
				</script>
				
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
					<div id= "map">
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!-- /.content -->
	
	<!-- Ajax script -->
	<script>
		function loadDoc(link) {
			var xhttp = new XMLHttpRequest();
			document.getElementById("feedbackReportID").innerHTML = "";
			document.getElementById("crisisID").innerHTML = "";
			document.getElementById("name").innerHTML = "";
			document.getElementById("positionInEF").innerHTML = "";
			document.getElementById("threatLevel").innerHTML = "";
			document.getElementById("casualtiesRescued").innerHTML = "";
			document.getElementById("deploymentStatus").innerHTML = "";
			document.getElementById("situationStatus").innerHTML = "";

			document.getElementById("timestamp").innerHTML = "";

			xhttp.onreadystatechange = function() {
				if (this.readyState == 4 && this.status == 200) {
					var jsonObj = JSON.parse(this.response);

					document.getElementById("feedbackReportID").innerHTML = jsonObj.feedbackReportID;
					document.getElementById("crisisID").innerHTML = jsonObj.crisisID;
					document.getElementById("name").innerHTML = jsonObj.name
					document.getElementById("positionInEF").innerHTML = jsonObj.positionInEF;
					document.getElementById("threatLevel").innerHTML = jsonObj.threatLevel;
					document.getElementById("casualtiesRescued").innerHTML = jsonObj.casualtiesRescued;
					document.getElementById("deploymentStatus").innerHTML = jsonObj.deploymentStatus;
					document.getElementById("situationStatus").innerHTML = jsonObj.situationStatus;
					document.getElementById("timestamp").innerHTML = moment(
							jsonObj.createdTime).format("DD/MM/YYYY HH:mm");
				}
			};
			xhttp.open("GET", link, true);
			xhttp.send();
		}
	</script>
	
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

	<!-- Inbox Reactive Script -->
	<script>
		$(document).ready(function() {
			$("#mailboxContent tr").click(function() {
				$(this).removeClass("unread");
			});
		});
	</script>
	<!-- End Inbox Reactive Script -->


</body>
</html>