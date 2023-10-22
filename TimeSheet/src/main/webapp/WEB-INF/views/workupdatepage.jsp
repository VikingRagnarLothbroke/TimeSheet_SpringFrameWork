<%@page import="com.twg.spring.TimeSheet.Entities.Entry" %>
<%@page import="com.twg.spring.TimeSheet.Entities.User" %>
<%@page import="java.util.List" %>

<% List<Entry> userentries=(List<Entry>)request.getAttribute("entries"); %>
<% User user=(User)session.getAttribute("user"); %>

<html>
    <head>
    </head>
    <body style="text-align: center">
    <% Integer roll=(Integer)request.getAttribute("id"); %>
    <input type="hidden" name="roll1" value="roll"/>
     <br/>
     <div Style="text-align:left">
     <% String str=(String)request.getAttribute("username"); %>   
    </div>
    <div style="padding-right:20px">
    <form action="timesheet"><button type="submit" style="text-decoration:none;color:red;float:right;">AddEntry</button></form>
    </div>
     
     <div class="header" style="float:right;padding-right:150px">
      <a href="signout" > <button type="submit" style="color:blue;text-decoration:none;">Signout</button></a>
     </div>
     <br/>
      <div>
    <table border="1" style="border-collapse:collapse;text-align: center;width:60%;height:8%;margin:0 auto auto;padding-down:40px"> 

        <caption><h3>List of Past Entries</h3></caption>  
      <tr>
      <th>Date</th>
      <th colspan="3">Actions</th>
      </tr>
      <tr>
      <%if(userentries.size()==0) {%>
      <td colspan="4">No entries from user</td>
      <%} %>
      <%for(Entry entry:userentries) {%>
       <td><% out.println(entry.getEntrydate());%></td>
       <td><form action="viewupdates" ><button type="submit" name="id" value=<%= entry.getId()%>>View</button></form></td>
       <td><form action="update" ><button type="submit" name="id" value=<%= entry.getId() %>>Update</button></form></td>
      <td><form action="delete" ><button type="submit" name="id" value=<%= entry.getId() %>>Delete</button></form></td>
       <tr></tr>
       <%} %>
      </tr>
    </table>
    </div>
    </body>
    </html>   