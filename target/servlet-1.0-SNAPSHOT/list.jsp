<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<div>
    <%
        for (int i = 0; i < a; i++) {
            String str = request.getParameter("key");
            final String param = application.getInitParameter("name");
    %>
    <div style="color: red"><%= str + param %>
    </div>
    <%
        }
    %>
</div>
</html>
