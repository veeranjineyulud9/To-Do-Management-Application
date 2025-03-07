## sayHello.html

<html>
<head>
<title>My First HTML Page</title>
</head>
<body>
My first html page with body
</body>
</html>

## JSP
## Login.JSP

## HTML
HTML - Static Content

## EL - 
EL - Expression Language - Dynamic Content

## Logging

## Dispatcher Servlet
localhost:8081/login

A1: Identifies Correct Controller Method
/login => LoginController.gotoLoginPage()

A2: Executes Controller Method
=> Puts data into model
=> Returns view name => login

A3: Identifies correct view using View Resolver
/WEB-INF/jsp/login.jsp

A4: Executes view

## Todo

Todo.java
id
username
description
targetDate
done

Static List of Todos => Database(H2, MySQL)

TodoController
listTodos.jsp

## JSTL - Java Server Pages Standard Tag Library
## JSTL Core Tag Library

<dependency>
			<groupId>jakarta.servlet.jsp.jstl</groupId>
			<artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
		</dependency>

		<dependency>
			<groupId>org.eclipse.jetty</groupId>
			<artifactId>glassfish-jstl</artifactId>
			<version>11.0.23</version>
		</dependency>
 



