(1) Voter valid
package voter;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Vote")
public class Vote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Vote() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		String name =request.getParameter("name");
		String age1 = request.getParameter("age");
		 PrintWriter out =response.getWriter();
		   int age;
	        try {
	            age = Integer.parseInt(age1);
	        } catch (NumberFormatException e) {
	            out.println("Invalid age parameter");
	            return;
	        }
		 
		 if(age >=18)
			 
		 {
			 out.println(name +"Valid for vote");
		 }
		 else
		 {
			 out.println(name +"not valid for vote");
		 }
	}
		 
	
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	             
		doGet(request, response);
	}

}


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Vote" method="get">
name: <input type="text" name="name"/>
age: <input type="text" name="age"/>
<input type="submit" value="check"/>
</form>

</body>
</html>
_________________________________________________________________________

package form1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Form2")
public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Form2() {
        super();
     
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		String name =request.getParameter("name" );
		String age = request.getParameter("age" );
		String father = request.getParameter("father's name" );
		String mother = request.getParameter("mother's name" );
		String college = request.getParameter("college");
		String address = request.getParameter("address");
		 PrintWriter out =response.getWriter();
		 
		 out.println(name);
		 out.println(age);
		 out.println(father);
		 out.println(mother);
		 out.println(address);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Form2" method="get">
name:<input type="text" name="name">
age: <input type="text" name="age">
father's name: <input type="text" name="father's name">
mother's name: <input type="text" name="mother's name">
college : <input type="text" name="college">
address : <input type="text" name="address">
 <input type="submit" >
</form>

</body>
</html>
_________________________________________________________________________

package dfg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Nummax
 */
@WebServlet("/Nummax")
public class Nummax extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Nummax() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String n1 =request.getParameter("num1");
		String n2 = request.getParameter("num2");
		String n3 = request.getParameter("num3");
		 PrintWriter out =response.getWriter();
		 try {
		 int a1 = Integer.parseInt(n1);
		 int a2 = Integer.parseInt(n2);
		 int a3 = Integer.parseInt(n3);
		 
		 if(a1>a2&&a1>a3)
		 {
			 out.print(a1);
		 }
		 if(a2>a1&&a2>a3)
		 {
			 out.print(a2);
		 }
		 if(a3>a1&&a3>a2)
		 {
			 out.print(a3);
		 }
		 }
		 catch(Exception e)
		 {
			 out.println("Invalid input");
		 }
		 
		 
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Nummax" method="get">
enter  first number: <input type="number" name="num1"/>
enter  second number: <input type="number" name="num2"/>
enter third number: <input type="number" name="num3"/>
<input type="submit" value="check"/>

</body>
</html>
-------------------------------------------------------------------------
package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mail
 */
@WebServlet("/Mail")
public class Mail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String a =request.getParameter("u");
		String b =request.getParameter("p");
		PrintWriter out = response.getWriter();
		out.println(a);
		out.println(b);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Mail" method="get">
User name: <input type="text" name="u"> <br>
Password : <input type="text" name="p"> <br>
<input type="submit">
</form>
</body>
</html>
------------------------------------------------------------------------

package dsgf;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validmail
 */
@WebServlet("/Validmail")
public class Validmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validmail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String a =request.getParameter("e");
		String b =request.getParameter("p");
		PrintWriter out = response.getWriter();
		try
		{
			int c=Integer.parseInt(b);
			if(a.equals("abc")&&(c==123))
					{
				out.print("you are valid for the next page");
					}
			else
			{
				out.print("not eligible to next page");
			}
		}
		catch(Exception ex)
		{
			out.println("Invalid Input");
		}
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Validmail" method="get">
email: <input type="text" name="e"> 
password: <input type="password" name="p">
<input type="submit" value="submit">
</form>
</body>
</html>

