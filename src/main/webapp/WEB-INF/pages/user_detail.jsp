<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%@ include file="header.jsp"%>
</head>
<body>
    <div class="container">
        <div class="well"><p class="h2">CRM Demo</p></div>
        <form action="user/update" method="post" class="form-horizontal" role="form">
            <div class="form-group">
                <label for="firstName" class="col-sm-2 control-label">First Name</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="firstName" name="firstName" value="${user.firstName}">
                </div>
            </div>
            <div class="form-group">
                <label for="lastName" class="col-sm-2 control-label">Last Name</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="lastName" name="lastName" value="${user.lastName}">
                </div>
            </div>
            <div class="form-group">
                <label for="email" class="col-sm-2 control-label">Email</label>
                <div class="col-sm-4">
                    <input type="email" class="form-control" id="email" name="email" value="${user.email}">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-4">
                    <input type="hidden" name="id" value="${user.id}" />
                    <button type="submit" class="btn btn-sm btn-primary" id="update"><span class="glyphicon glyphicon-check"></span> Update</button>
                </div>
            </div>
        </form>
    </div>
</body>
</html>
