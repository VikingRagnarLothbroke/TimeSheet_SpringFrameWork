<%@page import="com.twg.spring.TimeSheet.Entities.User" %>

<% User user1=(User)session.getAttribute("user"); %>
<% Integer ans=(Integer)user1.getId(); %>


<html>
<head>
</head>
<body style="text-align:center">
<form action="addentry">
Date
<input type="text" name="entrydate"/>
<br/>
<br/>
Workupdates
<textarea rol="30" cols="20" name="Workupdates"></textarea>
<input type="hidden" name="userid" value=<%= ans %>>
<br/>
<br/>
<button type="submit">Save</button>
</form>
</body>
</html>