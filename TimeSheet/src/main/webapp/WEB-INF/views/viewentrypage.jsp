<%@page import="com.twg.spring.TimeSheet.Entities.Entry" %>
<%@page import="com.twg.spring.TimeSheet.Entities.User" %>

<% Entry entry=(Entry)request.getAttribute("entry"); %>
<% User user=(User)session.getAttribute("user"); %>


<html>
<head>
</head>
<body style="text-align:center">
<form action="backtohome">
Date
<input type="text" value=<%= entry.getEntrydate() %> readonly>
<br/>
<br/>
WorkUpdates
<textarea rows="10" cols="30" readonly><%= entry.getWorkupdates() %></textarea>
<input type="hidden" name="id" value=<%=user.getId() %>>
<br/>
<br/>
<button type="submit">Back To Home</button>
</form>
</body>
</html>


 

