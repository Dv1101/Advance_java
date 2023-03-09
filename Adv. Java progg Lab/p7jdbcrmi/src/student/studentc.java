import java.sql.*;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author Dhruv Varia
 */
public class studentc extends UnicastRemoteObject implements Student1
{
public studentc() throws Exception
{
super();
}
public ArrayList insert(int id,String name,String branch,int atd) throws Exception
{
ArrayList ar=new ArrayList();
Class.forName("com.mysql.jdbc.Driver");
Connection
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","birju");
Statement stmt=con.createStatement();
stmt.executeUpdate("insert into student values("+id+",'"+name+"','"+branch+"',"+atd+")");
ResultSet rs=stmt.executeQuery("select * from student where id="+id);
rs.next();
int Id=rs.getInt(1);
name=rs.getString(2);
branch=rs.getString(3);
atd=rs.getInt(4);
ar.add(new Integer(Id));
ar.add(name);
ar.add(branch);
ar.add(new Integer(atd));
con.close();
return ar;
}
}

