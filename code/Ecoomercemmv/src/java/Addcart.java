/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bajaj
 */
@WebServlet(urlPatterns = {"/Addcart"})
public class Addcart extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Addcart</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Addcart at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String s, goods[] = {"Lenovo IdeaPad Slim 5", "HP 15 Entry Level 15.6", "ASUS VivoBook 14","ASUS VivoBook 14","Acer Nitro 5","AVITA Essential NE14A2INC433-MB","OnePlus 8T 5G","Redmi 9A","New Apple iPhone 12 Mini","OPPO F19 Pro","OnePlus Nord 5G","HP Laserjet","Canon PIXMA E477","Epson L3152","Canon Pixma G3000","Mi Smart Band5","Zebronics Zeb-Transformer Gaming Keyboard and Mouse Combo","Wacom CTL-4100/K0-CX","XP-Pen StarG430S","VEIKK S640 V2","Huion Inspiroy H640P"};
        String price []={"58,990","22,990","24,990","69,140","17,190","42,999","6,799","1,05,990","21,490","29,999","16,799","5,899","13,699","29,999","2,499","1,299","5,400","2,199","2,750","3,400"};
        double cost;
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        HttpSession session = req.getSession(true);

        if ( session == null ) return;
        

    for (int i = 0; i < goods.length; i++) {
        if (session.getAttribute(goods[i]) == null)
            session.setAttribute(goods[i], new Integer(0));
    }

    if ((s = req.getParameter("lenovo")) != null) {
        int n = ((Integer) session.getAttribute(goods[0])).intValue();
        session.setAttribute(goods[0], new Integer(n + 1));
    } else if ((s = req.getParameter("hp")) != null) {
        int n = ((Integer) session.getAttribute(goods[1])).intValue();
        session.setAttribute(goods[1], new Integer(n + 1));
    } else if ((s = req.getParameter("asus")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[2], new Integer(n + 1));
    }
    else if ((s = req.getParameter("acer")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[3], new Integer(n + 1));
    }
    else if ((s = req.getParameter("avita")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[4], new Integer(n + 1));
    }
     else if ((s = req.getParameter("oneplus8t")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[5], new Integer(n + 1));
    }
     else if ((s = req.getParameter("redmi9a")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[6], new Integer(n + 1));
    }
     else if ((s = req.getParameter("iphone")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[7], new Integer(n + 1));
    }
     else if ((s = req.getParameter("oppof19")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[8], new Integer(n + 1));
    }
     
    else if ((s = req.getParameter("oneplusnord")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[9], new Integer(n + 1));
    }
    else if ((s = req.getParameter("laserjet")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[10], new Integer(n + 1));
    }
    else if ((s = req.getParameter("canon")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[11], new Integer(n + 1));
    }
    else if ((s = req.getParameter("epson")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[12], new Integer(n + 1));
    }
    else if ((s = req.getParameter("canon1")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[13], new Integer(n + 1));
    }
    else if ((s = req.getParameter("mismart")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[14], new Integer(n + 1));
    }
    else if ((s = req.getParameter("zebro")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[15], new Integer(n + 1));
    }
    else if ((s = req.getParameter("wacom")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[16], new Integer(n + 1));
    }
    else if ((s = req.getParameter("xppen")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[17], new Integer(n + 1));
    }
    else if ((s = req.getParameter("veikk")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[18], new Integer(n + 1));
    }
    else if ((s = req.getParameter("huion")) != null) {
        int n = ((Integer) session.getAttribute(goods[2])).intValue();
        session.setAttribute(goods[19], new Integer(n + 1));
    }
    res.setContentType("text/html;charset=UTF-8");
        
        //PrintWriter out = res.getWriter();
        
        try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/ecommerce?zeroDateTimeBehavior=convertToNull","root","");
    String sql = "insert into cart (productname,price)values (?,?)"; 
    PreparedStatement prep = con.prepareStatement(sql);
     for (int i = 0; i < goods.length; i++) {
            int n = ((Integer)session.getAttribute(goods[i])).intValue();
            if ( n > 0 ){
                //out.println("<li><b>" + goods[i] + "</b> : " + n +":"+ price[i] +"</li>");
                prep.setString(1,goods[i]); 
                prep.setString(2,price[i]);
                //cost=n*price[i];
               // out.println(cost);}
            }
     }
    
    int i=prep.executeUpdate();
    if (i>0){
            /* TODO output your page here. You may use following sample code. */
           res.sendRedirect("cart.jsp");
 }
 prep.close();
 con.close();  
        }
        catch(Exception e){ 
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegProcServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegProcServ at " + req.getContextPath()+e + "</h1>");
            out.println("</body>");
            out.println("</html>");
}
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
