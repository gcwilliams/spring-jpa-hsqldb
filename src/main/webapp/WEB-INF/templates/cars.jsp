<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<t:page title="Cars">
    <c:choose>
        <c:when test="${fn:length(cars) gt 0}">
            <table class="table table-striped">
                <tbody>
                <c:forEach var="car" items="${cars}">
                    <tr>
                        <td class="col-xs-3">${car.id}</td>
                        <td class="col-xs-3">${car.registration}</td>
                        <td class="col-xs-3">${car.make.name}</td>
                        <td class="col-xs-3">${car.model.name}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:when>
        <c:otherwise>
            <div class="alert alert-danger" role="alert">
                <strong>On Snap!</strong> There are no registered cars
            </div>
        </c:otherwise>
    </c:choose>
    <div class="col-xs-12">
        <form action="${context}/cars" method="post" class="form-inline">
            <div class="form-group">
                <label for="registration">New car registration</label>
                <input type="text" id="registration" name="registration" placeholder="..." class="form-control">
                <label for="make">Make</label>
                <select class="form-control" id="make" name="make">
                    <c:forEach var="make" items="${makes}">
                        <option value="${make.id}">${make.name}</option>
                    </c:forEach>
                </select>
                <label for="model">Model</label>
                <select class="form-control" id="model" name="model">
                    <c:forEach var="model" items="${models}">
                        <option value="${model.id}">${model.name}</option>
                    </c:forEach>
                </select>
                <button type="submit" class="btn btn-default">Add</button>
            </div>
        </form>
    </div>
</t:page>