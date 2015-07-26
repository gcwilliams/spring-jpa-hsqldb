<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:page title="Home">
    <div class="jumbotron">
        <h1>Cars!</h1>
        <p>This is a simple application demonstrating the use of Spring, JPA and an in-memory HSQLDB database</p>
        <p><a class="btn btn-primary btn-lg" href="${context}/cars" role="button">Add Some Cars</a></p>
    </div>
</t:page>