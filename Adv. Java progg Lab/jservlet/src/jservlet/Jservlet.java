<<<<<<< HEAD
import java.io.*;
import javax.servlet.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jservlet;

/**
 *
 * @author dhruv
 */
public class Jservlet extends GenericServlet {

    public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{  
  
    res.setContentType("text/html");  
  
    PrintWriter out=res.getWriter();  
    out.print("<html><body>");  
    out.print("<b>hello generic servlet</b>");  
    out.print("</body></html>");  
  
}  
    
}



import java.io.*;  
import javax.servlet.*;  
  
public class First extends GenericServlet{  
public void service(ServletRequest req,ServletResponse res)  
throws IOException,ServletException{  
  
res.setContentType("text/html");  
  
PrintWriter out=res.getWriter();  
out.print("<html><body>");  
out.print("<b>hello generic servlet</b>");  
out.print("</body></html>");  
  
}  
} 
=======
import java.io.*;
import javax.servlet.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jservlet;

/**
 *
 * @author dhruv
 */
public class Jservlet extends GenericServlet {

    public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{  
  
    res.setContentType("text/html");  
  
    PrintWriter out=res.getWriter();  
    out.print("<html><body>");  
    out.print("<b>hello generic servlet</b>");  
    out.print("</body></html>");  
  
}  
    
}



import java.io.*;  
import javax.servlet.*;  
  
public class First extends GenericServlet{  
public void service(ServletRequest req,ServletResponse res)  
throws IOException,ServletException{  
  
res.setContentType("text/html");  
  
PrintWriter out=res.getWriter();  
out.print("<html><body>");  
out.print("<b>hello generic servlet</b>");  
out.print("</body></html>");  
  
}  
} 
>>>>>>> 77597be8b32575313799fd00b3f39df34c781fa9
