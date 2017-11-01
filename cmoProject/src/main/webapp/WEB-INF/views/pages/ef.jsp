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
<style>#map{ height: 800px; width:100%; }</style>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

		<!-- 1st row -->
		<div class="mailbox row">

			<section class="col-xs-8">

				<div class="box box-solid">
					<div class="box-body">
						<div class="row">

							<div class="col-md-12">
								<div class="row pad">
									<div class="col-sm-6">
										<div class="box-header">
											<i class="fa fa-inbox"></i>
											<h3 class="box-title">INBOX - EF-orders</h3>
										</div>

									</div>
									<div class="col-sm-1 blank"></div>
									<div class="col-sm-5 search-form">
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
												<th>CrisisID</th>
												<th>Threat Level</th>
												<th>Deployment Status</th>
												<th>DateTime</th>
											</tr>
										</thead>
									<c:forEach items="${messageList}" var="item" varStatus="stat">
										<tr ${item.read ? '' : 'class="unread"'} style="cursor: pointer;" onclick="loadDoc('/ajax/ef/from/${item.feedbackReportID}')">
											<td class="small-col">${stat.index + 1}</td>
											<td class="name">${item.crisisID}</td>
											<td class="subject">${item.threatLevel}</td>
											<td class="subject">${item.deploymentStatus}</td>
											<td class="time"><fmt:formatDate value="${item.messageReceivedTime}" pattern="dd/MM/yyyy hh:mm"/></td>
										</tr>
									</c:forEach>
									</table>
								</div>
								<!-- /.table-responsive -->
							</div>

						</div>
					</div>
					<div class="box-footer clearfix">
						<div class="pull-right">
							<small>Showing 1-10/1,240</small>
							<button class="btn btn-xs btn-primary">
								<i class="fa fa-caret-left"></i>
							</button>
							<button class="btn btn-xs btn-primary">
								<i class="fa fa-caret-right"></i>
							</button>
						</div>
					</div>
				</div>


			</section>


			<section class="col-xs-4">

				<div class="box">
					<div class="box-header">
						<i class="fa fa-users"></i>
						<h3 class="box-title">EF Chat</h3>
					</div>
					<div class="box-body"></div>
					<div class="overlay"></div>
					<div class="loading-img"></div>
					<div class="box-footer clearfix">
						<div class="pull-right">
							<button class="btn btn-xl btn-primary">SEND</button>
						</div>
					</div>
					<!-- box-footer -->
				</div>

			</section>
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
					<div class="box-footer clearfix">
						<button class="btn btn-xl btn-primary pull-right">View on
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

						<h2 class="text-center">Scroll down to view more</h2>
						<div>
							<object type="text/html"
								data="${pageContext.request.contextPath}/map" width="100%"
								height="800px"></object>

						</div>
					</div>
					<!-- Loading (remove the following to stop the loading)
					<div class="overlay"></div>
					<div class="loading-img"></div>
					<!-- end loading -->
					
					-->
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

					document.getElementById("reportID").innerHTML = jsonObj.feedbackReportID;
					document.getElementById("crisisID").innerHTML = jsonObj.crisisID;
					document.getElementById("name").innerHTML = jsonObj.name
					document.getElementById("positionInEF").innerHTML = jsonObj.positionInEF;
					document.getElementById("threatLevel").innerHTML = jsonObj.threatLevel;
					document.getElementById("casualtiesRescued").innerHTML = jsonObj.casualtiesRescued;
					document.getElementById("deploymentStatus").innerHTML = jsonObj.deploymentStatus;
					document.getElementById("situationStatus").innerHTML = jsonObj.situationStatus;
					document.getElementById("timestamp").innerHTML = jsonObj.createdTime;
				}
			};
			xhttp.open("GET", link, true);
			xhttp.send();
		}
				</script>
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