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

	<!-- Content Header (Page header) -->
	<section class="content-header ">
		<h1>
			Analyst<small>Analyst crisis data</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
			<li class="active">Analyst</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">
		<!-- MAILBOX BEGIN -->
		<div class="mailbox row">
			<div class="col-xs-12">
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
										<th>AffectedAreas</th>
										<th>DateTime</th>
									</tr>
								</thead>
								<c:forEach items="${messageList}" var="item" varStatus="stat">
									<tr ${item.read ? '' : 'class="unread"'}
										style="cursor: pointer;"
										onclick="loadDoc('/ajax/analyst/${item.reportID}')">
										<td class="small-col">${stat.index + 1}</td>
										<td class="name">${item.crisisID}</td>
										<td class="subject">${item.threatLevel}</td>
										<td class="subject">${item.affectedAreas}</td>
										<td class="time"><fmt:formatDate
												value="${item.createdTime}" pattern="dd/MM/yyyy HH:mm" /></td>
									</tr>
								</c:forEach>

								<!-- 								<tr class="unread"> -->
								<!-- 									<td class="small-col">1</td> -->
								<!-- 									<td class="name" style="cursor: pointer;" -->
								<!-- 										onclick="loadDoc('/ajax/analyst/1')">John</a></td> -->
								<!-- 									<td class="subject"><a href="#">Urgent! Please read</a></td> -->
								<!-- 									<td class="time">12:30 PM</td> -->
								<!-- 								</tr> -->
								<!-- 								<tr> -->
								<!-- 									<td class="small-col">2</td> -->
								<!-- 									<td class="name" style="cursor: pointer;" -->
								<!-- 										onclick="loadDoc('/ajax/analyst/2')">John</a></td> -->
								<!-- 									<td class="subject"><a href="#">Urgent! Please read</a></td> -->
								<!-- 									<td class="time">12:30 PM</td> -->
								<!-- 								</tr> -->
								<!-- 								<tr class="unread"> -->
								<!-- 									<td class="small-col">3</td> -->
								<!-- 									<td class="name"><a href="#">John</a></td> -->
								<!-- 									<td class="subject"><a href="#">Urgent! Please read</a></td> -->
								<!-- 									<td class="time">12:30 PM</td> -->
								<!-- 								</tr> -->
								<!-- 								<tr> -->
								<!-- 									<td class="small-col">4</td> -->
								<!-- 									<td class="name"><a href="#">John</a></td> -->
								<!-- 									<td class="subject"><a href="#">Urgent! Please read</a></td> -->
								<!-- 									<td class="time">12:30 PM</td> -->
								<!-- 								</tr> -->
								<!-- 								<tr> -->
								<!-- 									<td class="small-col">5</td> -->
								<!-- 									<td class="name"><a href="#">John</a></td> -->
								<!-- 									<td class="subject"><a href="#">Urgent! Please read</a></td> -->
								<!-- 									<td class="time">12:30 PM</td> -->
								<!-- 								</tr> -->
								<!-- 								<tr> -->
								<!-- 									<td class="small-col">6</td> -->
								<!-- 									<td class="name"><a href="#">John</a></td> -->
								<!-- 									<td class="subject"><a href="#">Urgent! Please read</a></td> -->
								<!-- 									<td class="time">12:30 PM</td> -->
								<!-- 								</tr> -->
								<!-- 								<tr> -->
								<!-- 									<td class="small-col">7</td> -->
								<!-- 									<td class="name"><a href="#">John</a></td> -->
								<!-- 									<td class="subject"><a href="#">Urgent! Please read</a></td> -->
								<!-- 									<td class="time">12:30 PM</td> -->
								<!-- 								</tr> -->
								<!-- 								<tr class="unread"> -->
								<!-- 									<td class="small-col">8</td> -->
								<!-- 									<td class="name"><a href="#">John</a></td> -->
								<!-- 									<td class="subject"><a href="#">Urgent! Please read</a></td> -->
								<!-- 									<td class="time">12:30 PM</td> -->
								<!-- 								</tr> -->
								<!-- 								<tr class="unread"> -->
								<!-- 									<td class="small-col">9</td> -->
								<!-- 									<td class="name"><a href="#">John</a></td> -->
								<!-- 									<td class="subject"><a href="#">Urgent! Please read</a></td> -->
								<!-- 									<td class="time">12:30 PM</td> -->
								<!-- 								</tr> -->
								<!-- 								<tr> -->
								<!-- 									<td class="small-col">10</td> -->
								<!-- 									<td class="name"><a href="#">John</a></td> -->
								<!-- 									<td class="subject"><a href="#">Urgent! Please read</a></td> -->
								<!-- 									<td class="time">12:30 PM</td> -->
								<!-- 								</tr> -->
							</table>
						</div>
						<!-- /.table-responsive -->
					</div>
					<!-- /.col (RIGHT) -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.box-body -->
		</div>
		<!-- /.box -->
		<!-- MAILBOX END -->

	</section>
	<!-- /.content -->
	<!-- /.box-body -->
	<div class="col-md-6">
		<div class="box box-primary">
			<div class="box-header">
				<h4 class="box-title">Crisis Data</h4>
			</div>
			<div class="box-body">
				<!-- the events -->
				<table id="messageContent" class="table table-condensed">
					<tbody>
						<!-- 						<tr> -->
						<!-- 							<td>Crisis ID:</td> -->
						<!-- 							<td>1</td> -->
						<!-- 						</tr> -->
						<!-- 						<tr> -->
						<!-- 							<td>Name:</td> -->
						<!-- 							<td>Gabriel</td> -->
						<!-- 						</tr> -->
						<!-- 						<tr> -->
						<!-- 							<td>Position in 911:</td> -->
						<!-- 							<td>Janitor</td> -->
						<!-- 						</tr> -->
						<!-- 						<tr> -->
						<!-- 							<td>Crisis type:</td> -->
						<!-- 							<td>Robot Invasion</td> -->
						<!-- 						<tr> -->
						<!-- 						<tr> -->
						<!-- 							<td>Crisis Details:</td> -->
						<!-- 							<td>Robot shooting and killing students</td> -->
						<!-- 						<tr> -->
						<!-- 						<tr> -->
						<!-- 							<td>Crisis Date:</td> -->
						<!-- 							<td>20 September 2017</td> -->
						<!-- 						<tr> -->
						<!-- 						<tr> -->
						<!-- 							<td>Estimated start time of crisis:</td> -->
						<!-- 							<td>1500</td> -->
						<!-- 						<tr> -->
						<!-- 						<tr> -->
						<!-- 							<td>Affected location:</td> -->
						<!-- 							<td>Orchard (1.301800, 103.837797)</td> -->
						<!-- 						<tr> -->
						<!-- 						<tr> -->
						<!-- 							<td>Suggested Strategy:</td> -->
						<!-- 							<td>Surround robots at predicted area</td> -->
						<!-- 						<tr> -->

						<tr>
							<td>Report ID:</td>
							<td id="reportID"></td>
						</tr>
						<tr>
							<td>Crisis ID:</td>
							<td id="crisisID"></td>
						</tr>
						<tr>
							<td>Position in CMO:</td>
							<td id="positionInCMO"></td>
						</tr>
						<tr>
							<td>Threat Level:</td>
							<td id="threatLevel"></td>
						</tr>
						<tr>
							<td>Affected Areas:</td>
							<td id="affectedAreas"></td>
						</tr>
						<tr>
							<td>Estimated Casualties</td>
							<td id="estimatedCasualties"></td>
						</tr>
						<tr>
							<td>Crisis Duration</td>
							<td id="crisisDuration"></td>
						</tr>
						<tr>
							<td>Course of Actions:</td>
							<td id="courseOfActions"></td>
						</tr>
						<tr>
							<td>Consequences of Actions:</td>
							<td id="consequencesOfActions"></td>
						</tr>
						<tr>
							<td>Timestamp:</td>
							<td id="timestamp"></td>
						</tr>
					</tbody>
				</table>
				<script>
					function loadDoc(link) {
						var xhttp = new XMLHttpRequest();

						document.getElementById("reportID").innerHTML = "";
						document.getElementById("crisisID").innerHTML = "";
						document.getElementById("positionInCMO").innerHTML = "";
						document.getElementById("threatLevel").innerHTML = "";
						document.getElementById("affectedAreas").innerHTML = "";
						document.getElementById("estimatedCasualties").innerHTML = "";
						document.getElementById("crisisDuration").innerHTML = "";
						document.getElementById("courseOfActions").innerHTML = "";
						document.getElementById("consequencesOfActions").innerHTML = "";
						document.getElementById("timestamp").innerHTML = "";

						xhttp.onreadystatechange = function() {
							if (this.readyState == 4 && this.status == 200) {
								var jsonObj = JSON.parse(this.response);

								document.getElementById("reportID").innerHTML = jsonObj.reportID;
								document.getElementById("crisisID").innerHTML = jsonObj.crisisID;
								document.getElementById("positionInCMO").innerHTML = jsonObj.positionInCMO;
								document.getElementById("threatLevel").innerHTML = jsonObj.threatLevel;
								document.getElementById("affectedAreas").innerHTML = jsonObj.affectedAreas;
								document.getElementById("estimatedCasualties").innerHTML = jsonObj.estimatedCasualties;
								document.getElementById("crisisDuration").innerHTML = jsonObj.crisisDuration;
								document.getElementById("courseOfActions").innerHTML = jsonObj.courseOfActions;
								document
										.getElementById("consequencesOfActions").innerHTML = jsonObj.consequencesOfAction;
								document.getElementById("timestamp").innerHTML = moment(jsonObj.createdTime).format("DD/MM/YYYY HH:mm");

							}
						};
						xhttp.open("GET", link, true);
						xhttp.send();
					}
				</script>
			</div>

			<div class="box-footer">
				<button class="btn btn-info">
					<i class="fa fa-globe"></i> Generate Map
				</button>
				<button class="btn btn-info pull-right">
					<i class="fa fa-user"></i>Send to PMO
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

				<h2 class="text-center">Scroll down to view more</h2>
				<div>
					<object type="text/html"
						data="${pageContext.request.contextPath}/map" width="100%"
						height="800px"></object>

				</div>
			</div>
			<!-- 
			<div class="overlay"></div>
			<div class="loading-img"></div>
			 -->
		</div>
	</div>
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
	<!-- AdminLTE for demo purposes -->
	<script
		src="${pageContext.request.contextPath}/resources/js/AdminLTE/demo.js"
		type="text/javascript"></script>
	<!-- Bootstrap WYSIHTML5 -->
	<script
		src="${pageContext.request.contextPath}/resources/js/plugins//bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"
		type="text/javascript"></script>
	<!-- iCheck -->
	<script
		src="${pageContext.request.contextPath}/resources/js/plugins//iCheck/icheck.min.js"
		type="text/javascript"></script>
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