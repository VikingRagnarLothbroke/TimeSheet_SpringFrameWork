<%@page import="com.twg.spring.TimeSheet.Entities.User" %>

<% User user2=(User)request.getAttribute("user1");%>


<html>
<head>
</head>
<body>
<div style="float:left">
<div>
Name:<%=user2.getUsername() %>
</div>
<br/>
<br/>
<div>
Mail:<%=user2.getMail() %>
</div>
<br/>
<br/>
<div>
Role:<%=user2.getRole() %>
</div>
<br/>
<br/>
<div>
Location:<%=user2.getLocation() %>
</div>
<br/>
<br/>
<div>
Contact:<%=user2.getContact() %>
</div>
<br/>
<br/>
</div>
<div style="float:right">
<a href="timesheet"><button>Time Sheet</button></a>
<br/>
<br/>
<a href="getworkupdates"><button>WorkSheet</button></a>
<br/>
<br/>
</div>
</body>
</html>