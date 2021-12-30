<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
            <h1>Id: ${userModel.id}</h1>
            <h1>Name: ${userModel.name}</h1>
            <h1>Email: ${userModel.email}</h1>
            <h1>Postion: ${userModel.position}</h1>
            <h1>Favorite: <c:forEach var="favorite" items="${userModel.favorites}">${favorite}</c:forEach>
            </h1>

        </body>

        </html>