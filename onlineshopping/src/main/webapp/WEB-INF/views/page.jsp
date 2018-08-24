<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<s:url var="css" value="/resources/css"></s:url>
<s:url var="js" value="/resources/js"></s:url>
<s:url var="images" value="/resources/images"></s:url>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Shopping - ${title}</title>

<script type="text/javascript">
	window.menu = '${title}';
</script>

<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Boots watch readable theme CSS -->
<link href="${css}/bootswatch-readable-theme.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>
<body>

	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- Page Content -->

		<div class="content">

			<c:if test="${userClickHome == true }">
				<%@ include file="./home.jsp"%>
			</c:if>

			<!-- Load when user clicks About -->
			<c:if test="${userClickAbout == true }">
				<%@ include file="./about.jsp"%>
			</c:if>

			<!-- Load when user clicks Contact -->
			<c:if test="${userClickContact == true }">
				<%@ include file="./contact.jsp"%>
			</c:if>
		</div>

		<!-- Footer Comes here -->

		<%@ include file="./shared/footer.jsp"%>
		<!-- jQuery -->
		<script src="${js}/jquery.js"></script>
		<!-- Bootstrap Core JavaScript -->
		<script src="${js}/bootstrap.min.js"></script>

		<!-- Self coded JavaScript -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>
</html>
