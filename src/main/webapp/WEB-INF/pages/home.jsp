<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%@ include file="header.jsp"%>
    <title>${title}</title>
</head>
<body>
    <div class="container">
    <div class="well"><p class="h2">CRM Demo</p></div>
    <div class="col-lg-12">
        <form action="user/add" method="post" class="form-inline" role="form">
            <div class="form-group">
                <label class="sr-only" for="firstName">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter First Name">
            </div>
            <div class="form-group">
                <label class="sr-only" for="lastName">Last Name</label>
                <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Last Name">
            </div>
            <div class="form-group">
                <label class="sr-only" for="email">Last Name</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Email">
            </div>
            <button type="submit" class="btn btn-default">Save</button>
        </form>
    </div>
    <div class="col-lg-12">
        <h3 class="sub-header">All Users:</h3>
        <table class="table">
            <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="user" items="${allUsers}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.email}</td>
                    <td><a href="user/id/${user.id}">Edit</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    </div>
</body>
</html>
