<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.Date" %>
	<!-- Here we have to import the Date class. -->
	<!-- You will put the import in the first line of the jsp tag. Use the import attribute -->

	<!-- c:out ; c:forEach ; c:if -->
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<!-- Formatting (like dates) -->
		<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
			<!-- form:form -->
			<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
				<!-- for rendering errors on PUT routes -->
				<%@ page isErrorPage="true" %>

					<!DOCTYPE html>

					<html>

					<head>
						<meta charset="UTF-8" />
						<title>Craig Burke - Display Date - Home</title>
						<!-- Bootstrap -->
						<!-- CSS only -->
						<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
							rel="stylesheet"
							integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
							crossorigin="anonymous" />
						<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
							integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
							crossorigin="anonymous"></script>
						<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
							integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
							crossorigin="anonymous"></script>
						<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
						<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
						<link rel="stylesheet" href="/css/style.css" />
					</head>

					<body>
						<!-- == Home button == -->
						<!-- <a class="btn btn-danger float-end mb-3" href="/">Home</a> -->
						<!-- <p class="w-100"></p> -->
						<div class="container w-25">
							<!-- Beginning of Container -->
							<h2 class="text-danger">Dashboard</h2>
							<p class="w-100"></p>
							<div class="dropdown">
								<a class="btn btn-secondary dropdown-toggle" href="#" role="button"
									id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">
									Date or Time selection
								</a>

								<ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
									<!-- <li><a class="dropdown-item" href="/side">side</a></li> -->
									<li><a class="dropdown-item" href="/date">Date</a></li>
									<li><a class="dropdown-item" href="/time">Time</a></li>
								</ul>
							</div>
						</div>
						<!-- End of Container -->

						<p class="w-100"></p>

						<script src="/js/app.js"></script>
					</body>

					</html>