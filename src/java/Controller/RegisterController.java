/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Student;
import DAO.StudentDeclaration;
import DAO.StudentOperation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rishabh
 */
public class RegisterController extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("lollllllll");
    }

    
   
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //    super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        resp.setContentType("text/html");
        PrintWriter pw =resp.getWriter();
        
        String name,username,address,contact,cource,admission_date,password,email;
        int fee;
        
        name = req.getParameter("name");
        email = req.getParameter("email");
        username = req.getParameter("username");
        address = req.getParameter("address");
        contact = req.getParameter("contact");
        cource = req.getParameter("cource");
        admission_date = req.getParameter("admission_date");
        password = req.getParameter("password");
        fee = Integer.parseInt(req.getParameter("fee"));
        
        Student student =  new Student(name, username, name, address, contact, cource, fee, admission_date, password);
        StudentDeclaration sd = new StudentOperation();
        long a = sd.insertStudent(student);
        if (a>0) {
           pw.print("Registered Succesfully");
           
        }else
            pw.print("Registeration Failed");

    }
//
//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        super.service(req, res); //To change body of generated methods, choose Tools | Templates.
//        
//    }
    
    

}
