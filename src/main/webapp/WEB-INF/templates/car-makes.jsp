<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<t:page title="Car Makes">
    <c:choose>
        <c:when test="${fn:length(makes) gt 0}">
            <table class="table table-striped">
                <tbody>
                <c:forEach var="model" items="${makes}">
                    <tr>
                        <td class="col-xs-6">${model.id}</td>
                        <td class="col-xs-6">${model.name}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:when>
        <c:otherwise>
            <div class="alert alert-danger" role="alert">
                <strong>On Snap!</strong> There are no registered makes
            </div>
        </c:otherwise>
    </c:choose>
    <div class="col-xs-12">
        <form action="${context}/car-makes" method="post" class="form-inline">
            <div class="form-group">
                <label for="make">New car make</label>
                <input type="text" id="make" name="make" placeholder="..." class="form-control">
                <button type="submit" class="btn btn-default">Add</button>
            </div>
        </form>
    </div>
</t:page>