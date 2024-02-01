package cpdc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class H3
 */
@WebServlet("/H3")
public class H3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public H3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String n1 =request.getParameter("p");
		String n2 = request.getParameter("f");
		String n3 = request.getParameter("m");
		String []n4 =request.getParameterValues("dep");
		String n5 = request.getParameter("g");
		String n6 = request.getParameter("c");
		String n7 =request.getParameter("dl");
		String n8 = request.getParameter("n");
		
		 PrintWriter out =response.getWriter();
		 out.print(n1);
		 out.print(n2);
		 out.print(n3);
		 out.print(Arrays.toString(n4));
		 out.print(n4);
		 out.print(n5);
		 out.print(n6);
		 out.print(n7);
		 out.print(n8);
		 
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
<form action="H3" method="get">
 Patient name:<input type="text" name="p">
father's name: <input type="text" name="f">
mother's name: <input type="text" name="m">
department :
<select name="dep">
<option value="">select Department</option>
<option value="Orthopedic">Orthopedic</option>
<option value="Gynaecology">Gynaecology</option>
<option value="Cardiology">Cardiology</option>
<option value="Neurology">Neurology</option>
<option value="Neurology">Neurology</option>
</select>
 <input type="text" name="address">
Member :  <input type="radio" name="g" value="1" ><label for="1">1</label>
        <input type="radio" name="g" value="2" ><label for="2">2</label>
        <input type="radio" name="g" value="3"><label for="3">3</label>
        <input type="radio" name="g" value="more than 3"><label for="more than 3">more than 3</label><br>
 
 Coupon code :   <input type="radio" name="c" value="yes" ><label for="yes">yes</label>
        <input type="radio" name="c" value="no" ><label for="no">no</label>  
  Doctor list :   
<input  type="checkbox" value="Dr.anish vijay" name="dl">Dr.anish vijay
<input type="checkbox" value="Dr.mansih vijay" name="dl">Dr.mansih vijay
<input type="checkbox" value="Dr. jitendra singh " name="dl">Dr. jitendra singh 
<input type="checkbox" value="Dr.leena sharma" name="dl">Dr.leena sharma
<input type="checkbox" value="Dr.murali kumar" name="dl">Dr.murali kumar
<input type="checkbox"   value="Dr. shahid khan " name="dl">Dr.shahid khan 
<input type="checkbox" value="Dr.virat kohli" name="dl">Dr.virat kohli
<input  type="checkbox"value="Dr.satenra jain" name="dl">Dr.satenra jain
<input type="checkbox" value="Dr.satenra jain " name="dl">Dr.satenra jain
<input type="checkbox"  value="Dr.leena sharma" name="dl">Dr.leena sharma
<input type="checkbox" value="Dr.vipin kumar" name="dl">Dr.vipin kumar
<input type="checkbox" value="Dr. rahul sharma" name="dl">Dr. rahul sharma
Nurses :  <input type="radio" name="n" value="1" ><label for="1">1</label>
        <input type="radio" name="n" value="2" ><label for="2">2</label>
        <input type="radio" name="n" value="3"><label for="3">3</label>
        <input type="radio" name="n" value="more than 3"><label for="more than 3">more than 3</label><br>
 
     
</form>
</body>
</html>
-----------------------------------------------------------------------
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="H3" method="get">
 Patient name:<input type="text" name="p">
father's name: <input type="text" name="f">
mother's name: <input type="text" name="m">
department :
<select name="dep">
<option value="">select Department</option>
<option value="Orthopedic">Orthopedic</option>
<option value="Gynaecology">Gynaecology</option>
<option value="Cardiology">Cardiology</option>
<option value="Neurology">Neurology</option>
<option value="Neurology">Neurology</option>
</select>
 <input type="text" name="address">
Member :  <input type="radio" name="g" value="1" ><label for="1">1</label>
        <input type="radio" name="g" value="2" ><label for="2">2</label>
        <input type="radio" name="g" value="3"><label for="3">3</label>
        <input type="radio" name="g" value="more than 3"><label for="more than 3">more than 3</label><br>
 
 Coupon code :   <input type="radio" name="c" value="yes" ><label for="yes">yes</label>
        <input type="radio" name="c" value="no" ><label for="no">no</label>  
  Doctor list :   
<input  type="checkbox" value="Dr.anish vijay" name="dl">Dr.anish vijay
<input type="checkbox" value="Dr.mansih vijay" name="dl">Dr.mansih vijay
<input type="checkbox" value="Dr. jitendra singh " name="dl">Dr. jitendra singh 
<input type="checkbox" value="Dr.leena sharma" name="dl">Dr.leena sharma
<input type="checkbox" value="Dr.murali kumar" name="dl">Dr.murali kumar
<input type="checkbox"   value="Dr. shahid khan " name="dl">Dr.shahid khan 
<input type="checkbox" value="Dr.virat kohli" name="dl">Dr.virat kohli
<input  type="checkbox"value="Dr.satenra jain" name="dl">Dr.satenra jain
<input type="checkbox" value="Dr.satenra jain " name="dl">Dr.satenra jain
<input type="checkbox"  value="Dr.leena sharma" name="dl">Dr.leena sharma
<input type="checkbox" value="Dr.vipin kumar" name="dl">Dr.vipin kumar
<input type="checkbox" value="Dr. rahul sharma" name="dl">Dr. rahul sharma
Nurses :  <input type="radio" name="n" value="1" ><label for="1">1</label>
        <input type="radio" name="n" value="2" ><label for="2">2</label>
        <input type="radio" name="n" value="3"><label for="3">3</label>
        <input type="radio" name="n" value="more than 3"><label for="more than 3">more than 3</label><br>
 
     
</form>
</body>
</html>



import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class H2
 */
@WebServlet("/H2")
public class H2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public H2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String name=request.getParameter("n");
		String fname=request.getParameter("f");
		String mn=request.getParameter("m");
		String gender=request.getParameter("g");
		String cl=request.getParameter("c");
		String ad=request.getParameter("ad");
		String cn=request.getParameter("cn");
//		String []skills=request.getParameterValues("skills");
//		String []hoob=request.getParameterValues("hob");
		PrintWriter out=response.getWriter();
		out.println("name :"+name+"<br>");
		out.println("father name:"+fname+"<br>");
		out.println("mother name :"+mn+"<br>");
		out.println("gender :"+gender+"<br>");
		out.println("class :"+cl+"<br>");
		out.println("contact number :"+cn+"<br>");
		out.println("address :"+ad+"<br>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
==-------------------------------------------------------------------------
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
----------------------------------------------------------------------
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

