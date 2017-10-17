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
  <!-- Email description box -->

  <div class= "container my-5">
    <form method="get">
      <input type="checkbox" name="k" value="id">id
      <input type="checkbox" name="k" value="senderName">SenderName
      <input type="checkbox" name="k" value="threatLevel">ThreatLevel
      <input type="checkbox" name="k" value= "affectedarea">AffArea
      <input type="submit" value="Query">
    </form>


    <% String[] ks = request.getParameterValues("k");
    if (ks != null) {
    %>
    <%@ page import = "java.sql.*" %>
    <%    Connection conn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/nineoneone?useSSL=false","myuser","xxxx");

    Statement stmt = conn.createStatement();
    %> 


    <div class="mailbox-title-header">

      <% 
      String sqlStr = "SELECT * FROM nineoneone01 WHERE k IN (";
        sqlStr += "'" + ks[0] + "'";  // First author
        for (int i = 1; i < ks.length; ++i) {
        sqlStr += ", '" + ks[i] + "'";

      }
      sqlStr += ")";
      System.out.println("Query statement is " + sqlStr);
      ResultSet rset = stmt.executeQuery(sqlStr);
      %>

      <h3>Description:</h3>
    
    <div class="mailbox-content">
      <% while (rset.next()){
      %>
      <div class="row">
        <div class="col-4"><%= rset.getString("k")%></div>
        <div class="col-8"><%= rset.getString("v")%>
          <!-- <?php  -->
          <!-- if ($k=="view_map") { -->
          <!-- echo '<iframe src="'.$v.'" style="border:none" height="440" width="100%"></iframe>'; -->
          <!-- } else echo $v ?></div> -->
        </div>
      </div>
    </div>
    <%

  }
  %>
  <%
  rset.close();
  stmt.close();
  conn.close();
}

%>
</div>
</div>






<%@ include file = "footer.html" %>
</body>
</html>