<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Start Page</title>
   </head>

   <body>
      <h2>Request Post Message</h2>
      <form method = "POST" action = "/HelloApp/hello">
         <input type = "submit" value = "Submit"/>
      </form>
   </body>
   
</html>