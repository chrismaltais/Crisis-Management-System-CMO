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

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.${pageContext.request.contextPath}/resources/js/1.3.0/respond.min.js"></script>
        <![endif]-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script src="/webjars/momentjs/2.19.1/moment.js" type="text/javascript"></script>

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
										<th>Affected Areas</th>
										<th>Date & Time</th>
									</tr>
								</thead>
								<tbody id="mailboxContent">
									<c:forEach items="${messageList}" var="item" varStatus="stat">
										<tr ${item.read ? '' : 'class="unread"'}
											style="cursor: pointer;"
											onclick="loadDoc('/ajax/proposalFromAnalyst/${item.proposalID}')">
											<td class="small-col">${stat.index + 1}</td>
											<td class="name">${item.crisisID}</td>
											<td class="subject">${item.threatLevel}</td>
											<td class="subject">${item.affectedArea}</td>
											<td class="time"><fmt:formatDate
													value="${item.createdTime}" pattern="dd/MM/yyyy HH:mm" /></td>
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
						<tr>
							<td>Proposal ID:</td>
							<td id="proposalID"></td>
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
							<td>Position in CMO:</td>
							<td id="positionInCMO"></td>
						</tr>
						<tr>
							<td>Threat Level:</td>
							<td id="threatLevel"></td>
						</tr>
						<tr>
							<td>Crisis Type:</td>
							<td id="crisisType"></td>
						</tr>
						<tr>
							<td>Affected Area:</td>
							<td id="affectedArea"></td>
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
							<td>Crisis Details:</td>
							<td id="crisisDetails"></td>
						</tr>
						<tr>
							<td>Course of Action:</td>
							<td id="courseOfAction"></td>
						</tr>
						<tr>
							<td>Consequences of Action:</td>
							<td id="consequencesOfAction"></td>
						</tr>
						<tr>
							<td>Clean Up Action:</td>
							<td id="cleanUpAction"></td>
						</tr>
						<tr>
							<td>Timestamp:</td>
							<td id="createdTime"></td>
						</tr>
					</tbody>
				</table>
				<script>
					function loadDoc(link) {
						var xhttp = new XMLHttpRequest();

						document.getElementById("proposalID").innerHTML = "";
						document.getElementById("crisisID").innerHTML = "";
						document.getElementById("name").innerHTML = "";
						document.getElementById("positionInCMO").innerHTML = "";
						document.getElementById("threatLevel").innerHTML = "";
						document.getElementById("crisisType").innerHTML = "";
						document.getElementById("affectedArea").innerHTML = "";
						document.getElementById("estimatedCasualties").innerHTML = "";
						document.getElementById("crisisDuration").innerHTML = "";
						document.getElementById("crisisDetails").innerHTML = "";
						document.getElementById("courseOfAction").innerHTML = "";
						document.getElementById("consequencesOfAction").innerHTML = "";
						document.getElementById("cleanUpAction").innerHTML = "";
						document.getElementById("createdTime").innerHTML = "";

						xhttp.onreadystatechange = function() {
							if (this.readyState == 4 && this.status == 200) {
								var jsonObj = JSON.parse(this.response);

								document.getElementById("proposalID").innerHTML = jsonObj.proposalID;
								document.getElementById("crisisID").innerHTML = jsonObj.crisisID;
								document.getElementById("name").innerHTML = jsonObj.name;
								document.getElementById("positionInCMO").innerHTML = jsonObj.positionInCMO;
								document.getElementById("threatLevel").innerHTML = jsonObj.threatLevel;
								document.getElementById("crisisType").innerHTML = jsonObj.crisisType;
								document.getElementById("affectedArea").innerHTML = jsonObj.affectedArea;
								document.getElementById("estimatedCasualties").innerHTML = jsonObj.estimatedCasualties;
								document.getElementById("crisisDuration").innerHTML = jsonObj.crisisDuration;
								document.getElementById("crisisDetails").innerHTML = jsonObj.crisisDetails;
								document.getElementById("courseOfAction").innerHTML = jsonObj.courseOfAction;
								document.getElementById("consequencesOfAction").innerHTML = jsonObj.consequencesOfAction;
								document.getElementById("cleanUpAction").innerHTML = jsonObj.cleanUpAction;
								document.getElementById("createdTime").innerHTML = moment(
										jsonObj.createdTime).format(
										"DD/MM/YYYY HH:mm");
							}
						};
						xhttp.open("GET", link, true);
						xhttp.send();
					}
				</script>
			</div>

			<!-- Button/Function to Load Map -->
			<div class="box-footer clearfix">
				<button class="btn btn-xs btn-primary pull-left"
					onclick="putToMap()">View on Map</button>
				<script type="text/javascript">
					function putToMap() {
						var marker = {
							coords : coordParse(document
									.getElementById("affectedArea").innerHTML),
							content : document.getElementById("callReportID").innerHTML
						};
						addMarker(marker);
					}
				</script>
				<button class="btn btn-info pull-right" onclick="sendProposal()">
					<i class="fa fa-user"></i>Send to PMO
				</button>
			</div>
			<script>
				function sendProposal() {
					var xhttp = new XMLHttpRequest();
					xhttp.onreadystatechange = function() {
						console.log(this.status == 200);
						if (this.readyState == 4 && this.status == 200) {
							alert(this.response);
						}
					};
					xhttp
							.open(
									"GET",
									"${pageContext.request.contextPath}/sendProposal/"
											+ document
													.getElementById("proposalID").innerHTML,
									true);
					xhttp.send();
				}
			</script>
		</div>
	</div>

	<div class="col-md-6">
		<div class="box">
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