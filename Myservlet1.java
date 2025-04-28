//MyServlets.java
package servlets1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		PrintWriter out = response.getWriter();
		out.print("I am in doGet() method for browser");
		System.out.println("I am in doGet() method");
	}
}

//web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <servlet>
  <servlet-name>myservlet</servlet-name>
  <servlet-class>servlets1.MyServlet1</servlet-class>
  </servlet>
  <servlet-mapping>
  <servlet-name>myservlet</servlet-name>
  <url-pattern>/aaa</url-pattern>
  </servlet-mapping>
</web-app>
