<!DOCTYPE html>
<html lang="en">
<head>
  <title> SSP2 CMO </title>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <%@ include file ="header.html" %>


</head>
<body>




  <!-- Mailbox -->

  <div class="container my-2" >
    <div class="mail-option"> <!--no css yet-->
      <button class="btn btn-default btn-sm"><i class="fa fa-trash-o"></i></button>
      <span>1-10 of 10</span>

      <a class="btn btn-default" href="#"><i class="fa fa-angle-left  pagination-left"></i></a></button>

      <a class="btn btn-default" href="#"><i class="fa fa-angle-right pagination-right"></i></a>

    </div>

    <div class="table-responsive mailbox-messages">
      <table class="table table-hover">
        <thead>
          <th></th>
          <th>ID</th>
          <th>Inbox</th>
          <th>Date</th>
        </thead>
        <tbody>
          <tr>
            <td><input type="checkbox"></td>
            <td class="mailbox-id"><a href="911maildescription.jsp">911_#10</a></td>
            <td class="mailbox-subject" id="mailbox-subject-1"><b>911_#10</b> - Trying to find a solution to this problem...</td>
            <td class="mailbox-date">5 mins ago</td>
          </tr>
          <tr>
            <td><input type="checkbox"></td>
            <td class="mailbox-id"><a href="read-mail.html">911_#9</a></td>
            <td class="mailbox-subject" id="mailbox-subject-2"><b>WM06</b> - Trying to find a solution to this problem...</td>
            <td class="mailbox-date">28 mins ago</td>
          </tr>
          <tr>
            <td><input type="checkbox"></td>
            <td class="mailbox-id"><a href="read-mail.html">911_#8</a></td>
            <td class="mailbox-subject" id="mailbox-subject-3"><b>WM06</b> - Trying to find a solution to this problem...</td>
            <td class="mailbox-date">11 hours ago</td>
          </tr>
          <tr>
            <td><input type="checkbox"></td>
            <td class="mailbox-id"><a href="read-mail.html">911_#7</a></td>
            <td class="mailbox-subject" id="mailbox-subject-4"><b>WM06</b> - Trying to find a solution to this problem...</td>
            <td class="mailbox-date">15 hours ago</td>
          </tr>
          <tr>
            <td><input type="checkbox"></td>
            <td class="mailbox-id"><a href="read-mail.html">911_#6</a></td>
            <td class="mailbox-subject" id="mailbox-subject-5"><b>WM06</b> - Trying to find a solution to this problem...</td>
            <td class="mailbox-date">Yesterday</td>
          </tr>
          <tr>
            <td><input type="checkbox"></td>
            <td class="mailbox-id"><a href="read-mail.html">911_#5</a></td>
            <td class="mailbox-subject" id="mailbox-subject-6"><b>WM06</b> - Trying to find a solution to this problem...</td>
            <td class="mailbox-date">2 days ago</td>
          </tr>
          <tr>
            <td><input type="checkbox"></td>
            <td class="mailbox-id"><a href="read-mail.html">911_#4</a></td>
            <td class="mailbox-subject" id="mailbox-subject-7"><b>WM06</b> - Trying to find a solution to this problem...</td>
            <td class="mailbox-date">3 days ago</td>
          </tr>
          <tr>
            <td><input type="checkbox"></td>
            <td class="mailbox-id"><a href="read-mail.html">911_#3</a></td>
            <td class="mailbox-subject" id="mailbox-subject-8"><b>WM06</b> - Trying to find a solution to this problem...</td>
            <td class="mailbox-date">4 days ago</td>
          </tr>
          <tr>
            <td><input type="checkbox"></td>
            <td class="mailbox-id"><a href="read-mail.html">911_#2</a></td>
            <td class="mailbox-subject" id="mailbox-subject-9"><b>WM06</b> - Trying to find a solution to this problem...</td>
            <td class="mailbox-date">1 week ago</td>
          </tr>
          <tr>
            <td><input type="checkbox"></td>
            <td class="mailbox-id"><a href="read-mail.html">911_#1</a></td>
            <td class="mailbox-subject" id="mailbox-subject-10"><b>WM06</b> - Trying to find a solution to this problem...</td>
            <td class="mailbox-date">2 weeks ago</td>
          </tr>
        </tbody>
      </table><!-- /.table -->
    </div>
    <hr>
  </div>



  <%@ include file = "footer.html" %>

  </body>
  </html>