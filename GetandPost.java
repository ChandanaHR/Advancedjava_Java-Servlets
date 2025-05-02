//index.html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Login form</h2>
	<form action = "mylogin" method="get">
		<input type="text" name="name1" placeholder="Enter name"/><br/><br/>
		<input type="password" name="pass1" placeholder="Enter password"/><br/><br/>
		<input type="submit" value="Login"/>
	</form>
</body>
</html>

  //Login.java
  package chandu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/mylogin")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myemail = request.getParameter("name1");
		String mypass = request.getParameter("pass1");
		if(myemail.equals("ch15@gmail.com") && mypass.equals("chan@15")) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
	}
	
}

//Note: In place of get use post and doPost 
