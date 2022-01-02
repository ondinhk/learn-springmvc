<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>

    <body>
        <h1>Page 1</h1>
        <form:form method="POST" action="redirect">
            <input type="submit" value="Redirect" />
        </form:form>
    </body>

    </html>