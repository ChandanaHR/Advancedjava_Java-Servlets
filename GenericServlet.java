package servlets1;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlets1 extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

// Compiled from GenericServlet.java (version 1.8 : 52.0, super bit)
public abstract class javax.servlet.GenericServlet implements javax.servlet.Servlet, javax.servlet.ServletConfig, java.io.Serializable {
  
  // Field descriptor #68 J
  private static final long serialVersionUID = 1L;
  
  // Field descriptor #26 Ljavax/servlet/ServletConfig;
  private transient javax.servlet.ServletConfig config;
  
  // Method descriptor #6 ()V
  // Stack: 1, Locals: 1
  public GenericServlet();
  
  // Method descriptor #6 ()V
  // Stack: 0, Locals: 1
  public void destroy();
  
  // Method descriptor #18 (Ljava/lang/String;)Ljava/lang/String;
  // Stack: 2, Locals: 2
  public java.lang.String getInitParameter(java.lang.String name);
  
  // Method descriptor #22 ()Ljava/util/Enumeration;
  // Signature: ()Ljava/util/Enumeration<Ljava/lang/String;>;
  // Stack: 1, Locals: 1
  public java.util.Enumeration getInitParameterNames();
  
  // Method descriptor #12 ()Ljavax/servlet/ServletConfig;
  // Stack: 1, Locals: 1
  public javax.servlet.ServletConfig getServletConfig();
  
  // Method descriptor #30 ()Ljavax/servlet/ServletContext;
  // Stack: 1, Locals: 1
  public javax.servlet.ServletContext getServletContext();
  
  // Method descriptor #43 ()Ljava/lang/String;
  // Stack: 1, Locals: 1
  public java.lang.String getServletInfo();
  
  // Method descriptor #83 (Ljavax/servlet/ServletConfig;)V
  // Stack: 2, Locals: 2
  public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException;
  
  // Method descriptor #6 ()V
  // Stack: 0, Locals: 1
  public void init() throws javax.servlet.ServletException;
  
  // Method descriptor #58 (Ljava/lang/String;)V
  // Stack: 3, Locals: 2
  public void log(java.lang.String message);
  
  // Method descriptor #61 (Ljava/lang/String;Ljava/lang/Throwable;)V
  // Stack: 3, Locals: 3
  public void log(java.lang.String message, java.lang.Throwable t);
     0  aload_0 [this]
     1  invokevirtual javax.servlet.GenericServlet.getServletContext() : javax.servlet.ServletContext [36]
     4  new java.lang.StringBuilder [37]
     7  dup
     8  invokespecial java.lang.StringBuilder() [39]
    11  aload_0 [this]
    12  invokevirtual javax.servlet.GenericServlet.getServletName() : java.lang.String [40]
    15  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [44]
    18  ldc <String ": "> [48]
    20  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [44]
    23  aload_1 [message]
    24  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [44]
    27  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [50]
    30  aload_2 [t]
    31  invokeinterface javax.servlet.ServletContext.log(java.lang.String, java.lang.Throwable) : void [59] [nargs: 3]
    36  return
      Line numbers:
        [pc: 0, line: 177]
        [pc: 36, line: 178]
      Local variable table:
        [pc: 0, pc: 37] local: this index: 0 type: javax.servlet.GenericServlet
        [pc: 0, pc: 37] local: message index: 1 type: java.lang.String
        [pc: 0, pc: 37] local: t index: 2 type: java.lang.Throwable
  
  // Method descriptor #91 (Ljavax/servlet/ServletRequest;Ljavax/servlet/ServletResponse;)V
  public abstract void service(javax.servlet.ServletRequest arg0, javax.servlet.ServletResponse arg1) throws javax.servlet.ServletException, java.io.IOException;
  
  // Method descriptor #43 ()Ljava/lang/String;
  // Stack: 1, Locals: 1
  public java.lang.String getServletName();
     0  aload_0 [this]
     1  getfield javax.servlet.GenericServlet.config : javax.servlet.ServletConfig [23]
     4  invokeinterface javax.servlet.ServletConfig.getServletName() : java.lang.String [62] [nargs: 1]
     9  areturn
      Line numbers:
        [pc: 0, line: 201]
      Local variable table:
        [pc: 0, pc: 10] local: this index: 0 type: javax.servlet.GenericServlet
}
