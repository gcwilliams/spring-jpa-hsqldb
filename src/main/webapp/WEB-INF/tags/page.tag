<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="title" required="true" %>
<c:set var="context" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <title>${title}</title>
    <link rel="stylesheet" href="${context}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${context}/css/cars.css">
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <a class="navbar-brand" href="${context}/">Home</a>
        <a class="navbar-brand" href="${context}/cars">Cars</a>
        <a class="navbar-brand" href="${context}/car-makes">Makes</a>
        <a class="navbar-brand" href="${context}/car-models">Models</a>
    </div>
</nav>
<div class="container">
    <div class="row">
        <jsp:doBody/>
    </div>
</div>
</body>
</html>