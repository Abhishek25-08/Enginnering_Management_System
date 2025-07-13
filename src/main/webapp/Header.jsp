<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kaushal Engineering Works</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Style.css">
</head>
<body>
<header class="bg-light-wine text-white p-3">
    <div class="container-fluid d-flex justify-content-between align-items-center">
        <div class="d-flex align-items-center">
            <a href="${pageContext.request.contextPath}/index.jsp">
                <img src="${pageContext.request.contextPath}/Image/Logo.png" alt="Logo" width="50" height="55" class="me-2">
            </a>
            <h3 class="mb-0"><strong>Kaushal Engineering Works</strong></h3>
        </div>
        <nav>
            <ul class="nav">
                <li class="nav-item"><a class="nav-link text-white" href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="${pageContext.request.contextPath}/about.jsp">About Us</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="${pageContext.request.contextPath}/products.jsp">Products</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="${pageContext.request.contextPath}/contact.jsp">Contact</a></li>
            </ul>
        </nav>
    </div>
</header>
</body>
