<%@page import="com.twg.spring.TimeSheet.Entities.Entry"%>
<%@page import="com.twg.spring.TimeSheet.Entities.User"%>

<% Entry entry =(Entry)request.getAttribute("entry");%>
<% User user1=(User)session.getAttribute("user");%>

<html>
<head>
</head>
<body style="text-align:center">
<form action="updateentry">
Date
<input type="text" name="entrydate" value=<%= entry.getEntrydate() %> readonly>
<br/>
<br/>
<label>WorkUpdates</label>
<textarea name="workupdates" ><%=entry.getWorkupdates() %></textarea>
<input type="hidden" name="id" value=<%=entry.getId() %>>
<input type="hidden" name="userid" value=<%=entry.getUserid() %>>
<br/>
<br/>
<button type="submit">Update</button>
</form>
</body>
</html>




