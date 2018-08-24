<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<p class="lead">Shop Name</p>
<div class="list-group">

	<c:forEach var="category" items="${categories}">
		<a href="#" class="list-group-item">${category.name}</a>
	</c:forEach>

</div>