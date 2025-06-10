//Myservlet class
package servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	 PrintWriter out = resp.getWriter();
    	 out.print("I am in doGet() method for browser");
    	System.out.println("I am in doget() method");
    }
}

//web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <servlet>
  <servlet-name>myaservlet</servlet-name>
  <servlet-class>servlet1.Myservlet</servlet-class>
  </servlet>
  
  <servlet-mapping>
  <servlet-name>myaservlet</servlet-name>
  <url-pattern>/aaa</url-pattern>
  </servlet-mapping>
</web-app>
