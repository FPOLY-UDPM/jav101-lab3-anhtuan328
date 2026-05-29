<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
%>
<html>
<head>
    <title>Danh sách sinh viên</title>
</head>
<body>
<h2>Danh sách sinh viên</h2>
<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Mã SV</th>
        <th>Họ tên</th>
    </tr>
    <c:forEach var="s" items="${students}">
        <tr>
            <td>${s.id}</td>
            <td>${s.masv}</td>
            <td>${s.hoten}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>