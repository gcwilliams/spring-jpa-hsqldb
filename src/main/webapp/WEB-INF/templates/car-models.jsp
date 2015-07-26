<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<t:page title="Car Models">
    <c:choose>
        <c:when test="${fn:length(models) gt 0}">
            <table class="table table-striped">
                <tbody>
                <c:forEach var="model" items="${models}">
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
                <strong>On Snap!</strong> There are no registered models
            </div>
        </c:otherwise>
    </c:choose>
    <div class="col-xs-12">
        <form action="${context}/car-models" method="post" class="form-inline">
            <div class="form-group">
                <label for="model">New car model</label>
                <input type="text" id="model" name="model" placeholder="..." class="form-control">
                <button type="submit" class="btn btn-default">Add</button>
            </div>
        </form>
    </div>
</t:page>