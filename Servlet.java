public class Servlets1 implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
}

// Compiled from Servlet.java (version 1.8 : 52.0, no super bit)
public abstract interface javax.servlet.Servlet {
  
  // Method descriptor #6 (Ljavax/servlet/ServletConfig;)V
  public abstract void init(javax.servlet.ServletConfig arg0) throws javax.servlet.ServletException;
  
  // Method descriptor #11 ()Ljavax/servlet/ServletConfig;
  public abstract javax.servlet.ServletConfig getServletConfig();
  
  // Method descriptor #13 (Ljavax/servlet/ServletRequest;Ljavax/servlet/ServletResponse;)V
  public abstract void service(javax.servlet.ServletRequest arg0, javax.servlet.ServletResponse arg1) throws javax.servlet.ServletException, java.io.IOException;
  
  // Method descriptor #17 ()Ljava/lang/String;
  public abstract java.lang.String getServletInfo();
  
  // Method descriptor #19 ()V
  public abstract void destroy();
}
