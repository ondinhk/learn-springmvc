<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Form User</title>
    </head>

    <body>
        <h1>Form </h1>
        <form:form action="./add-user" method="post" modelAttribute="userModel">
            <label for="id">ID:</label>
            <form:input path="id" type="number" />
            <br>
            <label for="name">Name:</label>
            <form:input path="name" />
            <br>
            <label for="email">Email:</label>
            <form:input path="email" />
            <br>
            <label for="">Position select</label>
            <form:select path="position" multiple="">
                <form:option value="NONE" label="Select" />
                <form:options items="${listPosition}" />
            </form:select>
            <br>
            <label for="">Favorite checkbox</label>
            <form:checkboxes path="favorites" items="${listFavorite}" />
            <input type="submit" value="Submit" />
        </form:form>
    </body>

    </html>