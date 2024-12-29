/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class ProcessCreateUser extends HttpServlet {
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//    }

  
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
         String username = request.getParameter("username");
         String password = request.getParameter("password");
         String confirmPassword = request.getParameter("confirm-password");
         boolean isValid = true;
         String message = null;
         
         //Kiểm tra trùng username
         boolean isExistsUsername = UserDAO.isExistUsername(username);
         if(isExistsUsername){
             message = "Tài khoản tồn tại";
             isValid = false;
             //response lỗi (200, 400, 404, 500)
         }
         //Kiểm tra password, confirm-pass
         if(!password.equals(confirmPassword)){
             message = "Mật khẩu không trùng";
             isValid = false;
             message = "Mời nhập lại mật khẩu";
         }
         
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
