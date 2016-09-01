<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
    <h2><%@include file="AnotherPage.jsp"%></h2>
    <h2><jsp:include page="AnotherPage.jsp"></jsp:include></h2>

    <%--<form action="/welcome.htm" method="post">--%>
        <%--<input type="hidden" name="jack" value="black"/>--%>
        <%--<input type="submit">--%>
    <%--</form>--%>

</body>
</html>